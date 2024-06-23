package HotelManningProject.model;
import java.util.List;

public class HotelManning {

        private String hotelName;
        private String openingDate;
        private List<Department> departments;

        public String getHotelName() {
            return hotelName;
        }

        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }

        public String getOpeningDate() {
            return openingDate;
        }

        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
        }

        public List<Department> getDepartments() {
            return departments;
        }

        public void setDepartments(List<Department> departments) {
            this.departments = departments;
        }
}

