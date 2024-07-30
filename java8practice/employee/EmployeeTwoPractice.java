package java8practice.employee;

import java.util.ArrayList;

public class EmployeeTwoPractice {
    static ArrayList<EmployeePractice> empList = new ArrayList<EmployeePractice>();

    public static void main(String[] args) {
        empList.add(new EmployeePractice(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        empList.add(new EmployeePractice(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        empList.add(new EmployeePractice(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        empList.add(new EmployeePractice(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        empList.add(new EmployeePractice(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        empList.add(new EmployeePractice(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        empList.add(new EmployeePractice(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        empList.add(new EmployeePractice(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        empList.add(new EmployeePractice(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        empList.add(new EmployeePractice(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        empList.add(new EmployeePractice(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        empList.add(new EmployeePractice(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        empList.add(new EmployeePractice(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        empList.add(new EmployeePractice(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        empList.add(new EmployeePractice(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        empList.add(new EmployeePractice(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        empList.add(new EmployeePractice(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // Query 1 : How many male and female employees are there in the organization?
    method1();
        System.out.println("\n");
        // Query 2 : Print the name of all departments in the organization?
//    method2();
        System.out.println("\n");
        // Query 3 : What is the average age of male and female employees?
//    method3();
        System.out.println("\n");
        // Query 4 : Get the details of highest paid employee in the organization?
//    method4();
        System.out.println("\n");
        // Query 5 : Get the names of all employees who have joined after 2015?
//    method5();
        System.out.println("\n");
        // Query 6 : Count the number of employees in each department?
//    method6();
        System.out.println("\n");
        // Query 7 : What is the average salary of each department?
//    method7();
        System.out.println("\n");
        // Query 8 : Get the details of youngest male employee in the product development department?
//    method8();
        System.out.println("\n");
        // Query 9 : Who has the most working experience in the organization?
//    method9();
        System.out.println("\n");
        // Query 10 : How many male and female employees are there in the sales and marketing team?
//    method10();
        System.out.println("\n");
        // Query 11 : What is the average salary of male and female employees?
//    method11();
        System.out.println("\n");
        // Query 12 : List down the names of all employees in each department?
//    method12();
        System.out.println("\n");
        // Query 13 : What is the average salary and total salary of the whole
        // organization?
//    method13();
        System.out.println("\n");
        // Query 14 : Separate the employees who are younger or equal to 25 years from
        // those employees who are older than 25 years.
//    method14();
        System.out.println("\n");
        // Query 15 : Who is the oldest employee in the organization? What is his age
        // and which department he belongs to?
//    method15();
    }

    private static void method1() {
        EmployeePractice emp = new EmployeePractice();
    }
}
