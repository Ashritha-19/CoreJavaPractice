package uber;

import uber.appEnum.VehicleTypeEnum;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UberTest {

    public static void main(String[] args) {

        User user1 = new User();
        user1.name = "AdS";
        user1.mobile = "1234567890";
        user1.userId = "A123";

        Location location = new Location();
        location.latitude = "12.34.56";
        location.longitude = "09.87.65";

        Insurance vInsurance = new Insurance();
        vInsurance.insuranceType = "B1234";

        Insurance dInsurance = new Insurance();
        dInsurance.insuranceType = "A1234";

        Driver driver1 = new Driver();
        Vehicle vehicle = new Vehicle();

        vehicle.vehicleInsurance = vInsurance;
        vehicle.vehicleType = VehicleTypeEnum.CAR;
        vehicle.vehicleNumber = "AP0123";
        vehicle.vehicleDriver = driver1;

        driver1.name = "polo";
        driver1.driverInsurance = dInsurance;
        driver1.drivingLicense = "abc123";
        driver1.mobileNumber = "1234567890";
        driver1.vehicle = vehicle;

        Task task = new Task();
        task.userId = user1.userId;
        task.fromLoc = location;
        task.toLoc = location;

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter startDateTimeFormatter = DateTimeFormatter.ofPattern("12/12/2012 03:46:22");
        String  startTime = currentDate.format(startDateTimeFormatter);

        DateTimeFormatter endDateTimeFormatter = DateTimeFormatter.ofPattern("12/12/2012 11:20:11");
        String endTime = currentDate.format(endDateTimeFormatter);

        JobTaskMapping jobTaskMapping = new JobTaskMapping();
        jobTaskMapping.task = task;
        jobTaskMapping.startTime = startTime;
        jobTaskMapping.endTime = endTime;
        jobTaskMapping.vehicle = vehicle;


        System.out.println(user1.name);

        System.out.println(jobTaskMapping.startTime);

        System.out.println(jobTaskMapping.endTime);

        System.out.println(jobTaskMapping.vehicle.vehicleDriver.driverInsurance.insuranceType);

        System.out.println(jobTaskMapping.task.toLoc);


    }
}
