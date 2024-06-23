package Immuetable.Example3;


import java.util.Date;

public class Dob {

    private int date;
    private String month;
    private String year;


    public Dob(int date, String month, String year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "Dob{" +
                "date=" + date +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
