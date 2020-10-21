package edu.eci.arsw.weather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class WeatherInfo {

    @Setter
    @Getter
    private Coord coord;

    @Setter @Getter
    private Weather weather;

    @Setter @Getter
    private String base;

    @Setter @Getter
    private Temperature main;

    @Setter @Getter
    private String visibility;

    @Setter @Getter
    private Wind wind;

    @Setter @Getter
    private Clouds clouds;

    @Setter @Getter
    private int dt;

    @Setter @Getter
    private int timezone;

    @Setter @Getter
    private  int id;

    @Setter @Getter
    private String name;

    @Setter @Getter
    private int cod;
}
