package Immuetable;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Te {

    public static void main(String[] args) {

        Dob dob = new Dob("1","1","2000");

        Ashri ashri = new Ashri(29, dob);

        System.out.println(ashri);


    }
}
