package edu.eci.arsw.weather.cache;

/**
 * The interface Weather cache.
 */
public interface WeatherCache {

    /**
     * Add.
     *
     * @param key   the key
     * @param value the value
     */
    void add(String key, Object value);

    /**
     * Remove.
     *
     * @param key the key
     */
    void remove(String key);

    /**
     * Get object.
     *
     * @param key the key
     * @return the object
     */
    Object get(String key);
}
