package edu.eci.arsw.weather.services.httpConnectionService.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.services.WeatherException;
import edu.eci.arsw.weather.services.httpConnectionService.HttpConnectionService;
import org.json.JSONObject;

public class HttpConnectionServiceImpl implements HttpConnectionService {
    @Override
    public JSONObject getWeatherInfoByCity(String cityName) throws WeatherException {
        try{
            HttpResponse<String> response = Unirest
                    .get("api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid=e2f238a657505b6ea2f13e452eec4a86")
                    .asString();
            return new JSONObject(response.getBody());
        }catch (UnirestException e){
            throw new WeatherException("Error en el servicio gateway", e);
        }
    }
}
