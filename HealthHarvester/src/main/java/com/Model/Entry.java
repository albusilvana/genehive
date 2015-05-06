package com.Model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;
import java.util.List;

/**
 * Created by silvana.albert on 3/11/15.
 */
@JsonSerialize
public class Entry extends Entity {
    private String lastName;
    private String firstName;
    private String identificationNumber;
    private String physician;
    private String countryCode;
    private String city;
    private Date dateOfBirth;
    private Date dateOfDiagnosis;
    private Date dateOfDeath;
    private char gender;
    private List<ProfessionaExposure> professionalExposures;
    private String details;
    private List<MutationEntry> mutationEntries;

    public Entry(String lastName, String firstName, String identificationNumber,String countryCode, String city, Date dateOfBirth,
                 Date dateOfDiagnosis, Date dateOfDeath, char gender, List<ProfessionaExposure> professionalExposures,
                 String details, List<MutationEntry> entries, String physician) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.identificationNumber = identificationNumber;
        this.countryCode = countryCode;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDiagnosis = dateOfDiagnosis;
        this.dateOfDeath = dateOfDeath;
        this.gender = gender;
        this.professionalExposures = professionalExposures;
        this.details = details;
        this.mutationEntries = entries;
        this.physician = physician;
    }

    public Entry(String identificationNumber, String countryCode, List<MutationEntry> entries) {
        this.identificationNumber = identificationNumber;
        this.countryCode = countryCode;
        this.mutationEntries = entries;
    }

    public Entry() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfDiagnosis() {
        return dateOfDiagnosis;
    }

    public void setDateOfDiagnosis(Date dateOfDiagnosis) {
        this.dateOfDiagnosis = dateOfDiagnosis;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public List<ProfessionaExposure> getProfessionalExposures() {
        return professionalExposures;
    }

    public void setProfessionalExposures(List<ProfessionaExposure> professionalExposures) {
        this.professionalExposures = professionalExposures;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<MutationEntry> getMutationEntries() {
        return mutationEntries;
    }

    public void setMutationEntries(List<MutationEntry> entries) {
        this.mutationEntries = entries;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }
}

