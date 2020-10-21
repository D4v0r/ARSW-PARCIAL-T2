package edu.eci.arsw.weather.controllers;

import edu.eci.arsw.weather.model.WeatherInfo;
import edu.eci.arsw.weather.services.WeatherException;
import edu.eci.arsw.weather.services.weatherServices.WeatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    WeatherServices services;

    @GetMapping("{cityName}")
    public ResponseEntity<?> getWeatherInfoByCityName(@PathVariable String cityName){
        try{
            WeatherInfo  responseObject = services.getWeatherInfoByCityName(cityName);
            return new ResponseEntity<>(responseObject, HttpStatus.OK);
        }catch (WeatherException e){
            return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
