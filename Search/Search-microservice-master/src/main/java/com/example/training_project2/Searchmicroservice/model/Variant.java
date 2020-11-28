package com.example.training_project2.Searchmicroservice.model;

import org.springframework.data.annotation.Id;


public class Variant {

    @Id
    private String variantId;

    private String brandName;
    private String quantity;
    private String ram;
    private String colour;
    private String batterySize;
    private String backCamera;
    private String price;
    private String simSlots;
    private String warrantyDetails;
    private String frontCamera;
    private String inkColour;
    private String material;
    private String gender;
    private String strapMaterial;
    private String bodyMaterial;
    private String capacity;
    private String flavour;
    private String vegetarian;

    public Variant() {
    }

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSimSlots() {
        return simSlots;
    }

    public void setSimSlots(String simSlots) {
        this.simSlots = simSlots;
    }

    public String getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(String batterySize) {
        this.batterySize = batterySize;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getBackCamera() {
        return backCamera;
    }

    public void setBackCamera(String backCamera) {
        this.backCamera = backCamera;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWarrantyDetails() {
        return warrantyDetails;
    }

    public void setWarrantyDetails(String warrantyDetails) {
        this.warrantyDetails = warrantyDetails;
    }

    public String getBrandName() { return brandName; }

    public void setBrandName(String brandName) { this.brandName = brandName; }

    public String getQuantity() { return quantity; }

    public void setQuantity(String quantity) { this.quantity = quantity; }

    public String getInkColour() { return inkColour; }

    public void setInkColour(String inkColour) { this.inkColour = inkColour; }

    public String getMaterial() { return material; }

    public void setMaterial(String material) { this.material = material; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getStrapMaterial() { return strapMaterial; }

    public void setStrapMaterial(String strapMaterial) { this.strapMaterial = strapMaterial; }

    public String getBodyMaterial() { return bodyMaterial; }

    public void setBodyMaterial(String bodyMaterial) { this.bodyMaterial = bodyMaterial; }

    public String getCapacity() { return capacity; }

    public void setCapacity(String capacity) { this.capacity = capacity; }

    public String getFlavour() { return flavour; }

    public void setFlavour(String flavour) { this.flavour = flavour; }

    public String getVegetarian() { return vegetarian; }

    public void setVegetarian(String vegetarian) { this.vegetarian = vegetarian; }



    //        return graphicsCard;
//    }
//        this.screenType = screenType;
//    public void setScreenType(String screenType) {
//
//    }
//        return screenType;
//    public String getScreenType() {
//
//    }
//        this.screenSize = screenSize;
//    public void setScreenSize(String screenSize) {
//
//    }
//        return screenSize;
// public String getScreenSize() {
//
//    public String getGraphicsCard() {//    public void setGraphicsCard(String graphicsCard) {////    }
//        this.graphicsCard = graphicsCard;
//    }
//
//    public String getUsbPorts() {
//        return usbPorts;
//    }
//
//    public void setUsbPorts(String usbPorts) {
//        this.usbPorts = usbPorts;
//    }
//
//    public String getNetworkDetails() {
//        return networkDetails;
//    }
//
//    public void setNetworkDetails(String networkDetails) {
//        this.networkDetails = networkDetails;
//    }
//
//    public String getSpeakerDetails() {
//        return speakerDetails;
//    }
//
//    public void setSpeakerDetails(String speakerDetails) {
//        this.speakerDetails = speakerDetails;
//    }
//    public String getProcessor() {
//        return processor;
//    }
//
//    public void setProcessor(String processor) {
//        this.processor = processor;
//    }
}