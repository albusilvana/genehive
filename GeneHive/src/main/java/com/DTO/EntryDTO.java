package com.DTO;

import com.Model.Entity;
import com.Model.MutationEntry;

import java.util.List;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class EntryDTO extends Entity {

    private String identificationNumber;
    private String countryCode;
    private List<MutationEntry> mutationEntries;

    public EntryDTO(String identificationNumber, String countryCode, List<MutationEntry> mutationEntries) {
        this.identificationNumber = identificationNumber;
        this.countryCode = countryCode;
        this.mutationEntries = mutationEntries;
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

    public List<MutationEntry> getMutationEntries() {
        return mutationEntries;
    }

    public void setMutationEntries(List<MutationEntry> mutationEntries) {
        this.mutationEntries = mutationEntries;
    }
}
