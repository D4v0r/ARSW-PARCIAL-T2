package edu.eci.arsw.weather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Weather {

    @Setter @Getter
    private int id;

    @Setter @Getter
    private String main;

    @Setter
    @Getter
    private String description;

}
