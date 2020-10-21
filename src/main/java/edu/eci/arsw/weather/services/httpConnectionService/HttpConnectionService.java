package edu.eci.arsw.weather.services.httpConnectionService;

import edu.eci.arsw.weather.services.WeatherException;
import org.json.JSONObject;

public interface HttpConnectionService {

    JSONObject  getWeatherInfoByCity(String cityName) throws WeatherException;

}
