package com.project.assignmenttwo;

public class Address {
    public String streetInfo1;
    public String streetInfo2;
    public String city;
    public String postalCode;
    public String province;
    public String country;

    public Address() {
        this.city = "Test-Toronto";
        this.streetInfo1 = "Test-StreetInfo1";
        this.streetInfo2 = "Test-StreetInfo2";
        this.postalCode = "PostalCodeTest";
        this.province = "Province";
        this.country = "Country";
    }

    public Address(String streetInfo1, String streetInfo2, String city, String postalCode, String province, String country) {
        this.streetInfo1 = streetInfo1;
        this.streetInfo2 = streetInfo2;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }


}
