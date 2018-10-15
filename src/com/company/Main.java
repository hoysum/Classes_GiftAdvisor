package com.company;
//Bonus: Add a column to the list for age and change your program to prompt for the age (adult, teen, child) of the recipient. You'll need to add more gift ideas if this is the case.
//You should also handle the possibility that you have no gift ideas. In which case, just say ... get him/her a gift certificate.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<GiftAdvisorApp> gifts = new ArrayList<>();
        gifts.add(new GiftAdvisorApp("jewelry", "female", "high"));
        gifts.add(new GiftAdvisorApp("weekend getaway", "female", "high"));
        gifts.add(new GiftAdvisorApp("selfie stick", "female", "low"));
        gifts.add(new GiftAdvisorApp("wine bottle", "female", "low"));
        gifts.add(new GiftAdvisorApp("perfume", "female", "medium"));
        gifts.add(new GiftAdvisorApp("sweater", "female", "medium"));
        gifts.add(new GiftAdvisorApp("smart TV", "female", "medium"));
        gifts.add(new GiftAdvisorApp("apple watch", "male", "high"));
        gifts.add(new GiftAdvisorApp("books", "male", "low"));
        gifts.add(new GiftAdvisorApp("shoes", "male", "low"));
        gifts.add(new GiftAdvisorApp("guitar","male","medium" ));
        gifts.add(new GiftAdvisorApp("playstation","male", "medium"));

        /*for(String s: gifts){
            System.out.println(s);*/

        //System.out.println("GiftName" + "   " + "Price" + "   " + "Gender");
        //for(GiftAdvisorApp g: gifts){
           // System.out.println(g.getGiftName() + "   " + g.getPrice() + "    " + g.getGender());
            //System.out.println(g);
        //}
        //Prompt user for gender/price
        //if gender, price range
        //for loop to find gift .. g.getGift
        Scanner in = new Scanner(System.in);
        System.out.println("Enter gender: male or female");
        String gender = in.nextLine();
        System.out.println("Enter price: high, medium or low");
        String price = in.nextLine();

        for(GiftAdvisorApp g: gifts){
            if(g.getGender().equalsIgnoreCase(gender) && g.getPrice().equalsIgnoreCase(price)){
                System.out.println(g.getGiftName());
            }

        }
    }
}
