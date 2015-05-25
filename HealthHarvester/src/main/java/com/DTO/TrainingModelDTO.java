package com.DTO;

/**
 * Created by silvana.albert on 5/23/15.
 */
public class TrainingModelDTO {
    String countryCode;
    String mutationString;
    String gender;
    int age;
    int ageOfDiagnosis;
    int ageOfDeath;

    public TrainingModelDTO(String countryCode, String mutationString, String gender, int age, int ageOfDiagnosis, int ageOfDeath) {
        this.countryCode = countryCode;
        this.mutationString = mutationString;
        this.gender = gender;
        this.age = age;
        this.ageOfDiagnosis = ageOfDiagnosis;
        this.ageOfDeath = ageOfDeath;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMutationString() {
        return mutationString;
    }

    public void setMutationString(String mutationString) {
        this.mutationString = mutationString;
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
}
