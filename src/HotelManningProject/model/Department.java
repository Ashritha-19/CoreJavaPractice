package HotelManningProject.model;
import java.util.List;

public class Department {

        private String name;
        private List<Position> positions;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Position> getPositions() {
            return positions;
        }

        public void setPositions(List<Position> positions) {
            this.positions = positions;
        }
}
