package Bank;

public class Address {
    public String doorNumber;
    public String street;
    public String city;
    public String pincode;


    @Override
    public String toString() {
        return "Address{" +
                "doorNumber='" + doorNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
