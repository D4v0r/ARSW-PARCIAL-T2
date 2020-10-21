package edu.eci.arsw.weather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Temperature.
 */
@AllArgsConstructor
public class Temperature {

    @Setter
    @Getter
    private double temp;

    @Setter @Getter
    private double feelsLike;

    @Setter @Getter
    private double tempMin;

    @Setter @Getter
    private double tempMax;

    @Setter @Getter
    private int pressure;

    @Setter @Getter
    private int humidity;
}
