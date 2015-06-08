package com.DTO;

/**
 * Created by silvana.albert on 6/2/15.
 */
public class ExportEntityDTO {
    private String name;
    private String identificationNumber;
    private String countryCode;
    private  String mutationentries;
    private String professionalExposures;
    private  String gender;
    private  int age;
    private  int ageOfDiagnosis;
    private  int ageOfDeath;
    private String physician;

    public ExportEntityDTO(String name, String identificationNumber, String countryCode, String mutationentries, String professionalExposures, String gender, int age, int ageOfDiagnosis, int ageOfDeath, String physician) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.countryCode = countryCode;
        this.mutationentries = mutationentries;
        this.professionalExposures = professionalExposures;
        this.gender = gender;
        this.age = age;
        this.ageOfDiagnosis = ageOfDiagnosis;
        this.ageOfDeath = ageOfDeath;
        this.physician = physician;
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

    public String getMutationentries() {
        return mutationentries;
    }

    public void setMutationentries(String mutationentries) {
        this.mutationentries = mutationentries;
    }

    public String getProfessionalExposures() {
        return professionalExposures;
    }

    public void setProfessionalExposures(String professionalExposures) {
        this.professionalExposures = professionalExposures;
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

