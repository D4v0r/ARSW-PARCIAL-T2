package edu.eci.arsw.weather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Wind.
 */
@AllArgsConstructor
public class Wind {

    @Setter @Getter
    private double speed;

    @Setter
    @Getter
    private int deg;
}
