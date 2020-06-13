package com.example.startnglogistics;

public class ShipmentDeal {

    private String id;
    private String shipmentStatus;
    private String shippingDate;
    private String shipTo;
    private String shipFrom;
    private String currentLocation;
    private String previousLocation;
    private String arrivalDate;

    public ShipmentDeal(){ }

    public ShipmentDeal(String id,String shipmentStatus, String shippingDate, String shipTo, String shipFrom, String currentLocation, String previousLocation, String arrivalDate) {
        this.setId(id);
        this.setShipmentStatus(shipmentStatus);
        this.setShippingDate(shippingDate);
        this.setShipTo(shipTo);
        this.setShipFrom(shipFrom);
        this.setCurrentLocation(currentLocation);
        this.setPreviousLocation(previousLocation);
        this.setArrivalDate(arrivalDate);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    public String getShipFrom() {
        return shipFrom;
    }

    public void setShipFrom(String shipFrom) {
        this.shipFrom = shipFrom;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getPreviousLocation() {
        return previousLocation;
    }

    public void setPreviousLocation(String previousLocation) {
        this.previousLocation = previousLocation;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
