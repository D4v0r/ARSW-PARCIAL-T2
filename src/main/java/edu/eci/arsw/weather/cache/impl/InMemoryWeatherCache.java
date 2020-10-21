package edu.eci.arsw.weather.cache.impl;

import edu.eci.arsw.weather.cache.WeatherCache;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.lang.ref.SoftReference;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class InMemoryWeatherCache implements WeatherCache {
    private final ConcurrentHashMap<String, SoftReference<CacheObject>> cache = new ConcurrentHashMap<>();

    @Override
    public void add(String key, Object value) {
        cache.put(key, new SoftReference<>(new CacheObject(value)));
    }

    @Override
    public void remove(String key) {
        cache.remove(key);
    }

    @Override
    public Object get(String key) {
        return Optional.ofNullable(cache.get(key)).map(SoftReference::get).map(CacheObject::getValue).orElse(null);
    }


    @AllArgsConstructor
    private static  class CacheObject {

        @Getter
        private Object value;

    }

}
