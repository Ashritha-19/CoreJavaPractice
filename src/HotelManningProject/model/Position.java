package HotelManningProject.model;

public class Position {

        private String designation;
        private int grade;
        private int headcount;
        private int weeksAhead;
        private int monthsAhead;
        private String joiningDate;
        private String department;
        private String division;


    /* public Position(String designation, int grade, int headcount, int weeksAhead, int monthsAhead, String joiningDate, String department, String division) {
        this.designation = designation;
        this.grade = grade;
        this.headcount = headcount;
        this.weeksAhead = weeksAhead;
        this.monthsAhead = monthsAhead;
        this.joiningDate = joiningDate;
        this.department = department;
        this.division = division;
    }*/

    public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public int getHeadcount() {
            return headcount;
        }

        public void setHeadcount(int headcount) {
            this.headcount = headcount;
        }

        public int getWeeksAhead() {
            return weeksAhead;
        }

        public void setWeeksAhead(int weeksAhead) {
            this.weeksAhead = weeksAhead;
        }

        public int getMonthsAhead() {
            return monthsAhead;
        }

        public void setMonthsAhead(int monthsAhead) {
            this.monthsAhead = monthsAhead;
        }

        public String getJoiningDate() {
            return joiningDate;
        }

        public void setJoiningDate(String joiningDate) {
            this.joiningDate = joiningDate;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }
}


