package com.Model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by silvana.albert on 3/11/15.
 */
@JsonSerialize
public class ProfessionalExposureCategory {
    private String categoryName;
    private String details;

    public ProfessionalExposureCategory(String categoryName, String details) {
        this.categoryName = categoryName;
        this.details = details;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
