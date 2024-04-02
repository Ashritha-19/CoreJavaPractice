package Bank;

public class UserData {

    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public String mobileNumber;
    public String aadhar;
    public String pan;
    public Address address;


    @Override
    public String toString() {
        return "UserData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", aadhar='" + aadhar + '\'' +
                ", pan='" + pan + '\'' +
                ", address=" + address +
                '}';
    }
}
