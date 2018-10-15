package com.company;

public class GiftAdvisorApp {
    private String giftName;
    private String gender;
    private String price;

    public GiftAdvisorApp() {
    }

    public GiftAdvisorApp(String giftName, String gender, String price) {
        this.giftName = giftName;
        this.gender = gender;
        this.price = price;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
