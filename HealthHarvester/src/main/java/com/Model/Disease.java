package com.Model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by silvana.albert on 3/11/15.
 */
@JsonSerialize
public class Disease extends Entity {
    private String name;
    private String characteristics;

    public Disease(String name, String characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }

    public Disease(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
