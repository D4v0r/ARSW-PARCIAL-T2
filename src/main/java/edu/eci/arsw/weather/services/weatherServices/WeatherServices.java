package edu.eci.arsw.weather.services.weatherServices;

import edu.eci.arsw.weather.model.WeatherInfo;
import edu.eci.arsw.weather.services.WeatherException;

/**
 * The interface Weather services.
 */
public interface WeatherServices {

    /**
     * Gets weather info by city name.
     *
     * @param cityName the city name
     * @return the weather info by city name
     * @throws WeatherException the weather exception
     */
    WeatherInfo getWeatherInfoByCityName(String cityName)throws WeatherException;

}
