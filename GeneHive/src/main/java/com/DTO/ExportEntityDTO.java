package com.DTO;

/**
 * Created by silvana.albert on 6/2/15.
 */
public class ExportEntityDTO {
    private String name;
    private String identificationNumber;
    private String countryCode;
    private  String mutation;
    private  String disorder;
    private  String locus;
    private String professionalExposure;
    private int professionalExposureTime;
    private  String gender;
    private  int age;
    private  int ageOfDiagnosis;
    private  int ageOfDeath;
    private String physician;

    public ExportEntityDTO(String name, String identificationNumber, String countryCode, String mutation,
                           String disorder, String locus, String professionalExposure, int professionalExposureTime,
                           String gender, int age, int ageOfDiagnosis, int ageOfDeath, String physician) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.countryCode = countryCode;
        this.mutation = mutation;
        this.disorder = disorder;
        this.locus = locus;
        this.professionalExposure = professionalExposure;
        this.professionalExposureTime = professionalExposureTime;
        this.gender = gender;
        this.age = age;
        this.ageOfDiagnosis = ageOfDiagnosis;
        this.ageOfDeath = ageOfDeath;
        this.physician = physician;
    }

    public String getMutation() {
        return mutation;
    }

    public void setMutation(String mutation) {
        this.mutation = mutation;
    }

    public String getDisorder() {
        return disorder;
    }

    public void setDisorder(String disorder) {
        this.disorder = disorder;
    }

    public String getLocus() {
        return locus;
    }

    public void setLocus(String locus) {
        this.locus = locus;
    }

    public String getProfessionalExposure() {
        return professionalExposure;
    }

    public void setProfessionalExposure(String professionalExposure) {
        this.professionalExposure = professionalExposure;
    }

    public int getProfessionalExposureTime() {
        return professionalExposureTime;
    }

    public void setProfessionalExposureTime(int professionalExposureTime) {
        this.professionalExposureTime = professionalExposureTime;
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
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeOfDiagnosis() {
        return ageOfDiagnosis;
    }

    public void setAgeOfDiagnosis(int ageOfDiagnosis) {
        this.ageOfDiagnosis = ageOfDiagnosis;
    }

    public int getAgeOfDeath() {
        return ageOfDeath;
    }

    public void setAgeOfDeath(int ageOfDeath) {
        this.ageOfDeath = ageOfDeath;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }
}

