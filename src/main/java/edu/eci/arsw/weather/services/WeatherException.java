package edu.eci.arsw.weather.services;

public class WeatherException extends Exception{
    public WeatherException(String message){
        super(message);
    }

    public WeatherException(String message, Throwable throwable){
        super(message, throwable);
    }
}
