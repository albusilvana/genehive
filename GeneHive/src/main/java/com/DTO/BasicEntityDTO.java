package com.DTO;

/**
 * Created by silvana.albert on 5/18/15.
 */
public class BasicEntityDTO {
    private String code;
    private int z;

    public BasicEntityDTO(String code, int z) {
        this.code = code;
        this.z = z;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
