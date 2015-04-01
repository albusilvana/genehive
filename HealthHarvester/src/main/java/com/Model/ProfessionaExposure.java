package com.Model;

import java.sql.Time;

/**
 * Created by silvana.albert on 3/11/15.
 */
public class ProfessionaExposure {
    private ProfessionalExposureCategory professionalExposureCategory;
    private Time durationOfExposure;
//    proffesionalExposure_milliseconds

    public ProfessionaExposure(ProfessionalExposureCategory professionalExposureCategory, Time durationOfExposure) {
        this.professionalExposureCategory = professionalExposureCategory;
        this.durationOfExposure = durationOfExposure;
    }

    public ProfessionalExposureCategory getProfessionalExposureCategory() {
        return professionalExposureCategory;
    }

    public void setProfessionalExposureCategory(ProfessionalExposureCategory professionalExposureCategory) {
        this.professionalExposureCategory = professionalExposureCategory;
    }

    public Time getDurationOfExposure() {
        return durationOfExposure;
    }

    public void setDurationOfExposure(Time durationOfExposure) {
        this.durationOfExposure = durationOfExposure;
    }
}
