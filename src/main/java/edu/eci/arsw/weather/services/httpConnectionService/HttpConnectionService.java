package edu.eci.arsw.weather.services.httpConnectionService;

import edu.eci.arsw.weather.services.WeatherException;
import org.json.JSONObject;

/**
 * The interface Http connection service.
 */
public interface HttpConnectionService {

    /**
     * Gets weather info by city.
     *
     * @param cityName the city name
     * @return the weather info by city
     * @throws WeatherException the weather exception
     */
    JSONObject  getWeatherInfoByCity(String cityName) throws WeatherException;

}
