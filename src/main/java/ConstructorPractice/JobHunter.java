package ConstructorPractice;

public class JobHunter{
    public JobHunter() {
    }

    public static void main(String[] args) {
        Job job1 = new Job();
        Job job2 = new Job("SDET", 100000.0D, "Chicago");
        String job2Title = job2.jobTitle;
        String job1Title = job1.jobTitle;
        System.out.println(Job.country);
        System.out.println(Job.country);
        Job.country = "Europe";
        System.out.println(Job.country);
        System.out.println(Job.country);
        System.out.println("===============================");
        System.out.println(job2Title);
        System.out.println(job1Title);
        System.out.println("===========================");
        job2.getDetails();
    }
}
