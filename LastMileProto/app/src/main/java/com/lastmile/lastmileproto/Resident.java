package com.lastmile.lastmileproto;

public class Resident extends Object {
    private String username;
    private String password;

    public Resident(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Resident)) {
            return false;
        }

        Resident resident = (Resident)obj;

        return this.username.equals(resident.username) && this.password.equals(resident.password);
    }
}
