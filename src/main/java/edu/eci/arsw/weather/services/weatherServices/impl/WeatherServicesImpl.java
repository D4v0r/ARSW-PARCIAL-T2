package edu.eci.arsw.weather.services.weatherServices.impl;

import com.google.gson.Gson;
import edu.eci.arsw.weather.cache.WeatherCache;
import edu.eci.arsw.weather.model.*;
import edu.eci.arsw.weather.services.WeatherException;
import edu.eci.arsw.weather.services.httpConnectionService.HttpConnectionService;
import edu.eci.arsw.weather.services.weatherServices.WeatherServices;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServicesImpl implements WeatherServices {

    @Autowired
    WeatherCache cache;

    @Autowired
    HttpConnectionService httpConnectionService;

    @Override
    public WeatherInfo getWeatherInfoByCityName(String cityName) throws WeatherException {
        Gson gson = new Gson();
        System.out.println("AQUI ESTOY");
        try{
            if (cache.get(cityName) != null){
                return (WeatherInfo) cache.get(cityName);
            } else {
                JSONObject object = httpConnectionService.getWeatherInfoByCity(cityName);
                System.out.println(object);
                WeatherInfo query = new WeatherInfo(
                        gson.fromJson(object.getJSONObject("coord").toString(), Coord.class),
                        gson.fromJson(object.getJSONObject("weather").toString(), Weather.class),
                        object.getString("base"),
                        gson.fromJson(object.getJSONObject("main").toString(), Temperature.class),
                        object.getInt("visibility"),
                        gson.fromJson(object.getJSONObject("wind").toString(), Wind.class),
                        gson.fromJson(object.getJSONObject("clouds").toString(), Clouds.class),
                        object.getInt("dt"),
                        object.getInt("timezone"),
                        object.getInt("id"),
                        object.getString("name"),
                        object.getInt("cod")
            );
            cache.add(cityName, query);
            return query;
            }
        }catch (Exception e){
            throw new WeatherException("Error en los serivicios internos", e);
        }
    }
}
