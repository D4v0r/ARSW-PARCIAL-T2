package edu.eci.arsw.weather.services.weatherServices;

import edu.eci.arsw.weather.model.WeatherInfo;
import edu.eci.arsw.weather.services.WeatherException;

public interface WeatherServices {

    WeatherInfo getWeatherInfoByCityName(String cityName)throws WeatherException;

}
