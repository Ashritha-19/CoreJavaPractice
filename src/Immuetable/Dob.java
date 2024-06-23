package Immuetable;

public class Dob {

   public String date;

   public String month;

   public String year;

   public Dob(String date, String month, String year) {
      this.date = date;
      this.month = month;
      this.year = year;
   }

   @Override
   public String toString() {
      return "Dob{" +
              "date='" + date + '\'' +
              ", month='" + month + '\'' +
              ", year='" + year + '\'' +
              '}';
   }
}
