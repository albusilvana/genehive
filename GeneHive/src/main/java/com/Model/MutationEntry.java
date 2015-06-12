package com.Model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by silvana.albert on 3/11/15.
 */
@JsonSerialize
public class MutationEntry {
    private Gene gene;
    private Locus locus;
    private Disease disease;

//    genecode_possition_disorder

    public MutationEntry(Gene gene, Locus locus, Disease disease) {
        this.gene = gene;
        this.locus = locus;
        this.disease = disease;
    }

    public Gene getGene() {
        return gene;
    }

    public void setGene(Gene gene) {
        this.gene = gene;
    }

    public Locus getLocus() {
        return locus;
    }

    public void setLocus(Locus locus) {
        this.locus = locus;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
}
