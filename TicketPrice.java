package PracticeTasks;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance;
        int age;
        int tripType;
        System.out.print("Please enter distance with KM..");
        distance = sc.nextDouble();

        System.out.print("Please enter your age..");
        age = sc.nextInt();

        System.out.print("Please enter your trip type: \n1=>One way \n2=>Return\n");
        tripType = sc.nextInt();

        double normalPrice;
        double ageDiscount;
        double discountPrice=0 ;
        double tripTypeDiscount=0;
        double total;

        if(distance>0){
            if (tripType == 1) {
                normalPrice = distance * 0.1;
                if (age < 12) {
                    ageDiscount = normalPrice * 0.5;
                } else if (age >= 12 && age <= 24) {
                    ageDiscount = normalPrice * 0.1;
                } else if (age > 65) {
                    ageDiscount=normalPrice*0.3;
                }
                else{
                    ageDiscount=0;
                }
                discountPrice=normalPrice-ageDiscount;
            }
            else if(tripType==2){
                normalPrice = distance * 0.1;
                if (age < 12) {
                    ageDiscount = normalPrice * 0.5;
                } else if (age >= 12 && age <= 24) {
                    ageDiscount = normalPrice * 0.1;
                } else if (age > 65) {
                    ageDiscount=normalPrice*0.3;
                }
                else{
                    ageDiscount=0;
                }
                discountPrice=normalPrice-ageDiscount;
                tripTypeDiscount=discountPrice*0.2;
            }
            else {
                System.out.println("Incorrect trip type entered!");
                return;
            }
        }
        else {
            System.out.println("Incorrect distance entered!");
            return;
        }
        total=(tripType==2)?(discountPrice-tripTypeDiscount)*2:discountPrice;
        System.out.println("Your total price:"+total);


    }
}
