package com.DTO;

/**
 * Created by silvana.albert on 5/20/15.
 */
public class EntryFromUIDTO {
    String name;
    String identificationNumber;
    String countryCode;
    String dateOfBirth;
    String dateOfDiagnosis;
    String dateOfDeath;
    String gender;
    String professionalExposure;
    int professionalExposureTime;
    String details;
    String mutation;
    String locus;
    String disorder;
    String physician;


    public EntryFromUIDTO(){

    }

    public EntryFromUIDTO(String name, String identificationNumber, String countryCode, String dateOfBirth,
                          String dateOfDiagnosis, String dateOfDeath, String gender, String professionalExposure,
                          int professionalExposureTime, String details, String mutation, String locus,
                          String disorder, String physician) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.countryCode = countryCode;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDiagnosis = dateOfDiagnosis;
        this.dateOfDeath = dateOfDeath;
        this.gender = gender;
        this.professionalExposure = professionalExposure;
        this.professionalExposureTime = professionalExposureTime;
        this.details = details;
        this.mutation = mutation;
        this.locus = locus;
        this.disorder = disorder;
        this.physician = physician;
    }


    public int getProfessionalExposureTime() {
        return professionalExposureTime;
    }

    public void setProfessionalExposureTime(int professionalExposureTime) {
        this.professionalExposureTime = professionalExposureTime;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getMutation() {
        return mutation;
    }

    public void setMutation(String mutation) {
        this.mutation = mutation;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }
}
