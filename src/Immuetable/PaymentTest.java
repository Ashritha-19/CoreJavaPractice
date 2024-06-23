package Immuetable;

public class PaymentTest {

    public static void main(String[] args) {

        AccDetails accDetails = new AccDetails("1234567890","AB123",100);

          AccDetails accDetails1 =new AccDetails("1357908642",500);

        System.out.println(accDetails.getFromAcc());
        System.out.println(accDetails.getToAcc());
        System.out.println(accDetails.getAmt());

        System.out.println(accDetails1.getMobileNumber());
        System.out.println(accDetails1.getAmt());


    }
}
