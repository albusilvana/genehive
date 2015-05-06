package com.Model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;

/**
 * Created by silvana.albert on 3/29/15.
 */
@JsonSerialize
public class Gene {
    private String geneCode;
    private String name;


    public Gene(String geneCode, String name) {
        this.geneCode = geneCode;
        this.name = name;
    }

    public Gene(String geneCode) {
        this.geneCode = geneCode;
    }

    public String getGeneCode() {

        return geneCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
