package com.Model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by silvana.albert on 3/29/15.
 */
@JsonSerialize
public class Locus {
    private String possition;

    public Locus(String possition) {
        this.possition = possition;
    }

    public String getPossition() {
        return possition;
    }

    public void setPossition(String possition) {
        this.possition = possition;
    }
}
