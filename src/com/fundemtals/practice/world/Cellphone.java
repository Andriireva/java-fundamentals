package com.fundemtals.practice.world;

public class Cellphone {
    private String osType; // android or iphone or windows or....
    private String color;
    private Boolean hasFrontCamera;
    private Boolean hasMainCamera;
    private Boolean hasNfc;
    private Double diagonalInches;
    private String serialNumber;

    public Cellphone() {

    }

    public Cellphone(String osType, String color, Boolean hasFrontCamera, Boolean hasMainCamera, Boolean hasNfc,
                     Double diagonalInches, String serialNumber) {
        this.osType = osType;
        this.color = color;
        this.hasFrontCamera = hasFrontCamera;
        this.hasMainCamera = hasMainCamera;
        this.hasNfc = hasNfc;
        this.diagonalInches = diagonalInches;
        this.serialNumber = serialNumber;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getHasFrontCamera() {
        return hasFrontCamera;
    }

    public void setHasFrontCamera(Boolean hasFrontCamera) {
        this.hasFrontCamera = hasFrontCamera;
    }

    public Boolean getHasMainCamera() {
        return hasMainCamera;
    }

    public void setHasMainCamera(Boolean hasMainCamera) {
        this.hasMainCamera = hasMainCamera;
    }

    public Boolean getHasNfc() {
        return hasNfc;
    }

    public void setHasNfc(Boolean hasNfc) {
        this.hasNfc = hasNfc;
    }

    public Double getDiagonalInches() {
        return diagonalInches;
    }

    public void setDiagonalInches(Double diagonalInches) {
        this.diagonalInches = diagonalInches;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
