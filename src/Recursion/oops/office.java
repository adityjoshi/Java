/*
Write a Java program that creates a class hierarchy for employees of a company.
The base class should be Employee, with subclasses Manager, Developer, and Programmer.
 Each subclass should have properties such as name, address, salary, and job title.
 Implement methods for calculating bonuses, generating performance reports, and managing projects.
 */


package Recursion.oops;

public class office {
    public static void main(String[] args) {


        Manager manager = new Manager("Tanya Chaturvedi ", "Nainital", 80000, "Manager", 10);
        Developer developer = new Developer("Someone", "California", 50000, "Developer");
        Programmer programmer = new Programmer("Steve", "cal-tech", 20000 );

        System.out.println(manager.performanceReport());
        manager.manageProject();
        manager.getAddress();
        System.out.println( manager.getName() +" lives in : " + manager.getAddress());
        System.out.println("Bonus for " + manager.getName() + ": $" + manager.bonusCal());
        System.out.println("\n" + developer.performanceReport());
        developer.manageProject();
        System.out.println("Developer lives in : " + developer.getAddress());
        System.out.println("Bonus for " + developer.getName() + ": $" + developer.bonusCal());

        System.out.println("\n" + programmer.performanceReport());
        programmer.manageProject();
        System.out.println("Programmer lives in :" + programmer.getAddress());
        System.out.println("Bonus for " + programmer.getName() + ": $" + programmer.bonusCal());
    }

    }
    class Employee {
        private String name ;
        private String address ;
        private double salary ;
        private String jobTitle ;

        public Employee(String name, String address, double salary, String jobTitle) {
            this.name = name;
            this.address = address;
            this.salary = salary;
            this.jobTitle = jobTitle;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public double getSalary() {
            return salary;
        }

        public String getJobTitle() {
            return jobTitle;
        }



        public String performanceReport() {
            return "Performance report for " + name;
        }

        public void manageProject() {
            System.out.println(name + " is managing a project.");
        }
    }
    class Manager extends Employee {
    private int teamSize;

        public Manager(String name, String address, double salary, String jobTitle, int teamSize) {
            super(name, address, salary, jobTitle);
            this.teamSize = teamSize;
        }
        public double bonusCal() {
            return 0.4 * getSalary();
        }

        public String performanceReport() {
            return "Performance report for Manager " + getName() + ": Outstanding";
        }
        public void manageTeam() {
            System.out.println(getName() + " is managing a team of " + teamSize + " members.");
        }

    }
    class Developer extends Employee {

        public Developer(String name, String address, double salary, String jobTitle) {
            super(name, address, salary, jobTitle);
        }

        public double bonusCal() {
            return 0.2 * getSalary();
        }
        public String performanceReport() {
            return "Performance report for Developer " + getName() + ": Outstanding";
        }

    }

    class Programmer extends Developer {

        public Programmer(String name, String address, double salary) {
            super(name, address, salary, "Programmer");
        }


        public double bonusCal() {
            return 0.1 * getSalary();
        }


    }


