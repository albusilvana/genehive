package com.DTO;

/**
 * Created by silvana.albert on 6/22/15.
 */
public class SearchOptionsDTO {
    String countryCode;
//    String dateOfBirth;
//    String dateOfDiagnosis;
//    String dateOfDeath;
    String gender;
    String professionalExposure;
//    String professionalExposureTime;
//    String details;
    String mutation;
    String locus;
    String disorder;

    public SearchOptionsDTO() {
    }

    public SearchOptionsDTO(String countryCode, String gender, String professionalExposure,  String mutation, String locus, String disorder) {
        this.countryCode = countryCode;
        this.gender = gender;
        this.professionalExposure = professionalExposure;
//        this.details = details;
        this.mutation = mutation;
        this.locus = locus;
        this.disorder = disorder;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfessionalExposure() {
        return professionalExposure;
    }

    public void setProfessionalExposure(String professionalExposure) {
        this.professionalExposure = professionalExposure;
    }

    public String getMutation() {
        return mutation;
    }

    public void setMutation(String mutation) {
        this.mutation = mutation;
    }

    public String getLocus() {
        return locus;
    }

    public void setLocus(String locus) {
        this.locus = locus;
    }

    public String getDisorder() {
        return disorder;
    }

    public void setDisorder(String disorder) {
        this.disorder = disorder;
    }
}


