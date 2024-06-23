package HotelManningProject.service;
import HotelManningProject.model.Department;
import HotelManningProject.model.HotelManning;
import HotelManningProject.model.Position;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
        public static void main(String[] args) {

            Position itmanager = new Position();
            itmanager.setDesignation("It Manager");
            itmanager.setGrade(3);
            itmanager.setHeadcount(1);
            itmanager.setWeeksAhead(24);
            itmanager.setMonthsAhead(6);
            itmanager.setJoiningDate("1-Jul-25");

            Position itspecialist = new Position();
            itspecialist.setDesignation("It Specialist");
            itspecialist.setGrade(2);
            itspecialist.setHeadcount(3);
            itspecialist.setWeeksAhead(12);
            itspecialist.setMonthsAhead(3);
            itspecialist.setJoiningDate("1-Oct-25");

            Position ittechnician = new Position();
            ittechnician.setDesignation("It Technician");
            ittechnician.setGrade(1);
            ittechnician.setHeadcount(0);
            ittechnician.setWeeksAhead(8);
            ittechnician.setMonthsAhead(2);
            ittechnician.setJoiningDate("1-Nov-25");

            List<Position> itPositions = new ArrayList<>();
            itPositions.add(itmanager);
            itPositions.add(itspecialist);

            Department informartiontechnology = new Department();
            informartiontechnology.setName("Information Technologies");
            informartiontechnology.setPositions(itPositions);


            Position directorofrevenue = new Position();
            directorofrevenue.setDesignation("Director of Revenue");
            directorofrevenue.setGrade(4);
            directorofrevenue.setHeadcount(1);
            directorofrevenue.setWeeksAhead(24);
            directorofrevenue.setMonthsAhead(6);
            directorofrevenue.setJoiningDate("1-Jul-25");



            Department executiveManagement = new Department();
            executiveManagement.setName("Executive Management");
//            executiveManagement.setPositions(executivePositions);

            List<Department> departments = new ArrayList<>();
            departments.add(executiveManagement);

            HotelManning guide = new HotelManning();
            guide.setHotelName("Hotel Name");
            guide.setOpeningDate("1-Jan-2026");
            guide.setDepartments(departments);

            System.out.println("Hotel Opening Date: " + guide.getOpeningDate());
            for (Department dept : guide.getDepartments()) {
                System.out.println("Department: " + dept.getName());
                for (Position pos : dept.getPositions()) {
                    System.out.println("Position: " + pos.getDesignation() + ", Joining Date: " + pos.getJoiningDate());
                }
            }
        }
}

