package edu.eci.arsw.weather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Coord.
 */
@AllArgsConstructor
public class Coord {

    @Setter @Getter
    private double lon;

    @Setter @Getter
    private double lat;
}
