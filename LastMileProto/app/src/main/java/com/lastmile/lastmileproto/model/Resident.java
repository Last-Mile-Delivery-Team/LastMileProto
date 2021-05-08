package com.lastmile.lastmileproto.model;

public class Resident {
    private String Username;
    private String Password;
    private String AwayImage;
    private String AwayLoc;
    private String HomeImage;
    private String HomeLoc;
    private String ResidentIDCode;

    public Resident() {
    }

    public Resident(String username, String password, String awayImage, String awayLoc, String homeImage, String homeLoc, String residentIdCode) {
        Username = username;
        Password = password;
        AwayImage = awayImage;
        AwayLoc = awayLoc;
        HomeImage = homeImage;
        HomeLoc = homeLoc;
        ResidentIDCode = residentIdCode;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getAwayImage() {
        return AwayImage;
    }

    public String getAwayLoc() {
        return AwayLoc;
    }

    public String getHomeImage() {
        return HomeImage;
    }

    public String getHomeLoc() {
        return HomeLoc;
    }

    public String getResidentIDCode() {
        return ResidentIDCode;
    }



    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setAwayImage(String awayImage) {
        AwayImage = awayImage;
    }

    public void setAwayLoc(String awayLoc) {
        AwayLoc = awayLoc;
    }

    public void setHomeImage(String homeImage) {
        HomeImage = homeImage;
    }

    public void setHomeLoc(String homeLoc) {
        HomeLoc = homeLoc;
    }

    public void ResidentIDCode(String residentIdCode) {
        ResidentIDCode = residentIdCode;
    }


}
