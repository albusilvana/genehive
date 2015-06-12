package com.DTO;

import com.Model.Entry;

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
    String details;
    String mutationEntries;
    String physitian;


    public EntryFromUIDTO(){

    }

    public EntryFromUIDTO(String name, String identificationNumber, String countryCode, String dateOfBirth, String dateOfDiagnosis, String dateOfDeath, String gender, String professionalExposure, String details, String mutationEntries, String physitian) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.countryCode = countryCode;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDiagnosis = dateOfDiagnosis;
        this.dateOfDeath = dateOfDeath;
        this.gender = gender;
        this.professionalExposure = professionalExposure;
        this.details = details;
        this.mutationEntries = mutationEntries;
        this.physitian = physitian;
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

    public String getMutationEntries() {
        return mutationEntries;
    }

    public void setMutationEntries(String mutationEntries) {
        this.mutationEntries = mutationEntries;
    }

    public String getPhysitian() {
        return physitian;
    }

    public void setPhysitian(String physitian) {
        this.physitian = physitian;
    }
}
