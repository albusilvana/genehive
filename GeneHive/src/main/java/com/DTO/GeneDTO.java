package com.DTO;

import java.util.Arrays;

/**
 * Created by silvana.albert on 6/18/15.
 */
public class GeneDTO {
    private String geneCode;
    private String geneName;
    private String[] disorder;

    public GeneDTO(String geneCode, String geneName, String[] disorder) {
        this.geneCode = geneCode;
        this.geneName = geneName;
        this.disorder = disorder;
    }

    public GeneDTO() {
    }

    public String getGeneCode() {
        return geneCode;
    }

    public void setGeneCode(String geneCode) {
        this.geneCode = geneCode;
    }

    public String getGeneName() {
        return geneName;
    }

    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }

    public String[] getDisorder() {
        return disorder;
    }

    public void setDisorder(String[] disorder) {
        this.disorder = disorder;
    }

    @Override
    public String toString() {
        return "GeneDTO{" +
                "geneCode='" + geneCode + '\'' +
                ", geneName='" + geneName + '\'' +
                ", disorder=" + Arrays.toString(disorder) +
                '}';
    }
}
