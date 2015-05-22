package com.DTO;

/**
 * Created by silvana.albert on 5/22/15.
 */
public class EnhancedBasicEntityDTO {
    private String code;
    private String name;
    private int value;

    public EnhancedBasicEntityDTO(String code, String name, int value) {
        this.code = code;
        this.name = name;
        this.value = value;
    }

    public EnhancedBasicEntityDTO() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
