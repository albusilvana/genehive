package com.Model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;

/**
 * Created by silvana.albert on 3/29/15.
 */
@JsonSerialize
public class Gene {
    private String geneCode;
    private List<Locus> locuses;
    private String name;


    public Gene(String geneCode, List<Locus> locuses, String name) {
        this.geneCode = geneCode;
        this.locuses = locuses;
        this.name = name;
    }

    public Gene(String geneCode) {
        this.geneCode = geneCode;
    }

    public String getGeneCode() {

        return geneCode;
    }

    public void setGeneCode(String geneCode) {
        this.geneCode = geneCode;
    }

    public List<Locus> getLocuses() {
        return locuses;
    }

    public void setLocuses(List<Locus> locuses) {
        this.locuses = locuses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
