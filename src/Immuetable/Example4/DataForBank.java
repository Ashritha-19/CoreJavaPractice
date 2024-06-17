package Immuetable.Example4;

public final class DataForBank {

    private  double applicantSalary;

    private  ApplicantDetails applicant;

    public DataForBank(double applicantSalary, ApplicantDetails applicant) {
        this.applicantSalary = applicantSalary;
        this.applicant = applicant;
    }

    public double getApplicantSalary() {

        return applicantSalary;
    }

    public ApplicantDetails getApplicant() {

        return applicant;
    }

    @Override
    public String toString() {
        return "DataForBank{" +
                "applicantSalary=" + applicantSalary +
                ", applicant=" + applicant +
                '}';
    }
}
