package edu.eci.arsw.weather.cache;

public interface WeatherCache {

    void add(String key, Object value);

    void remove(String key);

    Object get(String key);
}
