package com.example.a16014753.p02_holidays;

public class Islamic {

    private String name;
    private String date;
    private Boolean pic;

    public Islamic(String name, String date, boolean pic) {
        this.name = name;
        this.date = date;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
    public boolean isPic() {
        return pic;
    }
}
