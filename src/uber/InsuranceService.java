package uber;

public class InsuranceService {

    public Insurance getInsurance(Vehicle vehicle){

        Insurance vInsurance = new Insurance();
        vInsurance.insuranceType = "B1234";

        vehicle.vehicleInsurance = vInsurance;

           Insurance insurance = new Insurance();
           insurance.insuranceType = vInsurance.insuranceType;
           return insurance;

    }
}
