package ConstructorPractice;

public class Job{String jobTitle;
    double salary;
    String location;
    static String country = "Usa";

    public Job() {
    }

    public Job(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Job(String jobTitle, double salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Job(String jobTitle, double salary, String location) {
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.location = location;
    }

    public Job(String jobTitle, double salary, String location, boolean openToRelocate) {
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.location = location;
    }

    public void getDetails() {
        System.out.println(this.jobTitle + "\n" + this.salary + "\n" + this.location);
    }
}


