package com.DTO;

/**
 * Created by silvana.albert on 4/22/15.
 */
public class SearchOptionsDTO {
    String countryCode;
    String dateOfBirthOperator;
    String dateOfDiagnosisOperator;
    String dateOfDeathOperator;
    String dateOfBirth;
    String dateOfDiagnosis;
    String dateOfDeath;
    String gender;
    String professionalExposure;
    int professionalExposureTime;
    String professionalExposureTimeOperator;
    String mutation;
    String locus;
    String disorder;

    public SearchOptionsDTO() {
    }

    public SearchOptionsDTO(String countryCode, String dateOfBirthOperator, String dateOfDiagnosisOperator,
                            String dateOfDeathOperator, String dateOfBirth, String dateOfDiagnosis, String dateOfDeath,
                            String gender, String professionalExposure, int professionalExposureTime,
                            String professionalExposureTimeOperator, String mutation, String locus, String disorder) {
        this.countryCode = countryCode;
        this.dateOfBirthOperator = dateOfBirthOperator;
        this.dateOfDiagnosisOperator = dateOfDiagnosisOperator;
        this.dateOfDeathOperator = dateOfDeathOperator;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDiagnosis = dateOfDiagnosis;
        this.dateOfDeath = dateOfDeath;
        this.gender = gender;
        this.professionalExposure = professionalExposure;
        this.professionalExposureTime = professionalExposureTime;
        this.professionalExposureTimeOperator = professionalExposureTimeOperator;
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

    public String getDateOfBirthOperator() {
        return dateOfBirthOperator;
    }

    public void setDateOfBirthOperator(String dateOfBirthOperator) {
        this.dateOfBirthOperator = dateOfBirthOperator;
    }

    public String getDateOfDiagnosisOperator() {
        return dateOfDiagnosisOperator;
    }

    public void setDateOfDiagnosisOperator(String dateOfDiagnosisOperator) {
        this.dateOfDiagnosisOperator = dateOfDiagnosisOperator;
    }

    public String getDateOfDeathOperator() {
        return dateOfDeathOperator;
    }

    public void setDateOfDeathOperator(String dateOfDeathOperator) {
        this.dateOfDeathOperator = dateOfDeathOperator;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfDiagnosis() {
        return dateOfDiagnosis;
    }

    public void setDateOfDiagnosis(String dateOfDiagnosis) {
        this.dateOfDiagnosis = dateOfDiagnosis;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public int getProfessionalExposureTime() {
        return professionalExposureTime;
    }

    public void setProfessionalExposureTime(int professionalExposureTime) {
        this.professionalExposureTime = professionalExposureTime;
    }

    public String getProfessionalExposureTimeOperator() {
        return professionalExposureTimeOperator;
    }

    public void setProfessionalExposureTimeOperator(String professionalExposureTimeOperator) {
        this.professionalExposureTimeOperator = professionalExposureTimeOperator;
    }
}


