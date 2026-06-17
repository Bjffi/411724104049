import java.util.ArrayList;
import java.util.Scanner;

public class miniproject {

    private static ArrayList<Student> students = new ArrayList<>();


    static class Student {

        private String id;
        private String name;
        private int age;
        private String department;
        private String section;
        private String Academic_year;
        private String mobile;
        private String gmail;
        private String gender;
        private String activity;


        public Student(String id, String name, int age,
                       String department, String section,
                       String Academic_year,
                       String mobile, String gmail,
                       String gender, String activity) {

            this.id = id;
            this.name = name;
            this.age = age;
            this.department = department;
            this.section = section;
            this.Academic_year = Academic_year;
            this.mobile = mobile;
            this.gmail = gmail;
            this.gender = gender;
            this.activity = activity;
        }

        public String getId(){
            return id;
        }

        public void updateDetails(String name,int age,
                                  String department,
                                  String section,
                                  String Academic_year,
                                  String mobile,
                                  String gmail,
                                  String gender,
                                  String activity){

            this.name = name;
            this.age = age;
            this.department = department;
            this.section = section;
            this.Academic_year = Academic_year;
            this.mobile = mobile;
            this.gmail = gmail;
            this.gender = gender;
            this.activity = activity;

        }

        public String toString(){

            return "\n----------------------"+
                    "\nID: "+id+
                    "\nName: "+name+
                    "\nAge: "+age+
                    "\nDepartment: "+department+
                    "\nSection: "+section+
                    "\nYear: "+Academic_year+
                    "\nMobile: "+mobile+
                    "\nGmail: "+gmail+
                    "\nGender: "+gender+
                    "\nExtra Activity: "+activity+
                    "\n----------------------";

        }

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int choice=0;


        while(choice!=5){

            display();

            choice=sc.nextInt();


            switch(choice){

                case 1:
                    add(sc);
                    break;


                case 2:
                    update(sc);
                    break;


                case 3:
                    delete(sc);
                    break;


                case 4:
                    view();
                    break;


                case 5:
                    System.out.println("Exit");
                    break;


                default:
                    System.out.println("Invalid Choice");

            }

        }

    }

    public static void display(){

        System.out.println("\n....Student Management System....");

        System.out.println("1.Add Student Details");
        System.out.println("2.Update Student Details");
        System.out.println("3.Delete Student Details");
        System.out.println("4.View Student Details");
        System.out.println("5.Exit");

        System.out.print("Enter choice: ");

    }


    private static String validateMobile(Scanner sc){

        String mobile;


        while(true){

            System.out.print("Enter Mobile Number:");

            mobile=sc.next();

            if(mobile.length()==10 && mobile.matches("[0-9]+")){

                return mobile;

            }
            else{

                System.out.println("Invalid Mobile Number");
                System.out.println("Enter exactly 10 digits");

            }

        }

    }

    private static void add(Scanner sc){


        System.out.print("Enter Student Id:");
        String id=sc.next();


        sc.nextLine();


        System.out.print("Enter Student Name:");
        String name=sc.nextLine();



        System.out.print("Enter Age:");
        int age=sc.nextInt();



        System.out.print("Enter Department:");
        String department=sc.next();

        System.out.print("Enter Section:");
        String section=sc.next();

        System.out.print("Enter Academic Year:");
        String year=sc.next();

        String mobile=validateMobile(sc);

        System.out.print("Enter Gmail:");
        String gmail=sc.next();

        System.out.print("Enter Gender:");
        String gender=sc.next();



        sc.nextLine();


        System.out.print("Enter Extra Curricular Activity:");
        String activity=sc.nextLine();





        Student s=new Student(id,name,age,
                department,section,year,
                mobile,gmail,gender,activity);



        students.add(s);


        System.out.println("Student Added Successfully");

    }

    private static void update(Scanner sc){

        System.out.print("Enter Student Id:");
        String id=sc.next();

        for(Student s:students){

            if(s.getId().equals(id)){

                sc.nextLine();

                System.out.print("New Name:");
                String name=sc.nextLine();

                System.out.print("New Age:");
                int age=sc.nextInt();

                System.out.print("Department:");
                String dept=sc.next();

                System.out.print("Section:");
                String section=sc.next();

                System.out.print("Academic Year:");
                String year=sc.next();

                String mobile=validateMobile(sc);

                System.out.print("Gmail:");
                String gmail=sc.next();

                System.out.print("Gender:");
                String gender=sc.next();



                sc.nextLine();


                System.out.print("Extra Activity:");
                String activity=sc.nextLine();

                s.updateDetails(name,age,
                        dept,section,year,
                        mobile,gmail,gender,activity);

                System.out.println("Updated Successfully");

                return;

            }

        }

        System.out.println("Student Not Found");

    }


    public static void delete(Scanner sc){

        System.out.print("Enter Student Id:");

        String id=sc.next();

        for(Student s:students){


            if(s.getId().equals(id)){


                students.remove(s);


                System.out.println("Deleted Successfully");

                return;

            }

        }


        System.out.println("Student Not Found");

    }


    public static void view(){


        if(students.isEmpty()){

            System.out.println("No Student Details");

            return;

        }

        for(Student s:students){

            System.out.println(s);

        }

    }

}