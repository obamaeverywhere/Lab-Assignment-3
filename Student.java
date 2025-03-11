// coding task 4

public class Student {
    public String name="Not Set";
    public String department="CSE";
    public double cgpa;
    public int credit=9;
    public String ScholarshipStatus="Not Set";
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Credit: " + credit);
        System.out.println("Scholarship Status: " + ScholarshipStatus);
    }
    public void updateDetails(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
    public void updateDetails(String name, double cgpa, int credit) {
        this.name = name;
        this.cgpa = cgpa;
        this.credit = credit;
    }
    public void updateDetails(String name, double cgpa, int credit, String department) {
        this.name = name;
        this.cgpa = cgpa;
        this.credit = credit;
        this.department = department;
    }
    public void checkScholarshipEligibility() {
        if(cgpa>=3.5 && credit>10) {
            if(cgpa>3.7) {
                ScholarshipStatus="Merit based scholarship";
    
            }
            else if(cgpa>=3.5) {
                ScholarshipStatus="Need based scholarship";
            }
            System.out.println(name + " is eligible for " + ScholarshipStatus);
        }
        else {
            ScholarshipStatus = "No scholarship";
            System.out.println(name + " is not eligible for scholarship");
        }
    }
}
