package Bank;

public class Test {
    public static void main(String[] args) {
        Address address = new Address();
        address.doorNumber = "1-1-1";
        address.street = "XYZ";
        address.city = "Guntur";
        address.pincode = "123456";


        UserData userData = new UserData();

        userData.firstName = "Sri";
        userData.lastName = "Krishna";
        userData.dateOfBirth = "03-03-2000";
        userData.mobileNumber ="8247649270";
        userData.aadhar = "1234 5678 0912";
        userData.pan = "ABC123";
        userData.address =address;




        Service service = new Service();
        System.out.println(service.createAccount(userData));

    }
}
