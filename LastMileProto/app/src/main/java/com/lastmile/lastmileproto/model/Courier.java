package com.lastmile.lastmileproto.model;

public class Courier {
    private String MACAddress;
    private String ConfirmID;

    public Courier() {

    }
    public Courier(String confirmId, String MacAddress) {
        MACAddress = MacAddress;
        ConfirmID = confirmId;

    }

    public String getMACAddress() {
        return MACAddress;
    }

    public String getConfirmID() {
        return ConfirmID;
    }

    public void setMACAddress(String MacAddress) {
        MACAddress = MacAddress;
    }

    public void setConfirmID(String confirmId) {
        ConfirmID = confirmId;
    }

}
