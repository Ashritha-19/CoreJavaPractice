package Inheritance.Example4;

public class SchoolFee {


    // card, netbanking

    public String payment(double amount, String typeOfPayment) {

        if ("card".equalsIgnoreCase(typeOfPayment)) {

            double charges = (amount * 2) / 100;
            double finalAmount = amount + charges;
//        } else if ("netBanking".equalsIgnoreCase(typeOfPayment) {

        }
        return "";
    }
}
