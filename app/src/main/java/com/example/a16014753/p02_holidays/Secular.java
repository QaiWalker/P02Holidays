package com.example.a16014753.p02_holidays;

public class Secular {
    private String name;
    private String date;
    private Boolean pic;

    public Secular(String name, String date, boolean pic) {
        this.name = name;
        this.date = date;
        this.pic = pic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPic() {
        return pic;
    }

    public void setPic(Boolean pic) {
        this.pic = pic;
    }
    public boolean isPic() {
        return pic;
    }

}
