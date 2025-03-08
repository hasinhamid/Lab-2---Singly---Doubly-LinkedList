import java.util.Scanner;

public class WRMTester {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("** Welcome to Waiting Room Management System **");
        WRM test=new WRM();
        int option=-1;
        while (true) {
            System.out.println("====================");
            System.out.println("Choose an Option:");
            System.out.println("1. registerPatient()");
            System.out.println("2. servePatient()");
            System.out.println("3. showAllPatients()");
            System.out.println("4. canDoctorGoHome()");
            System.out.println("5. cancelAll()");
            System.out.println("6. reverseTheLine()");
            System.out.println("7. Exit");
            System.out.println("====================");
            System.out.print("Enter your choice : ");
            option=sc.nextInt();
            if (option==1) {
                System.out.print("Enter Patient ID : ");
                int id=sc.nextInt();
                System.out.print("Enter Patient Name : ");
                String nm=sc.next();
                System.out.print("Enter Patient Age : ");
                int age=sc.nextInt();
                System.out.print("Enter Patient BloodGroup : ");
                String bld=sc.next();
                test.registerPatient(id, nm, age, bld);
            }
            else if(option==2){
                test.servePatient();
            }
            else if(option==3){
                test.showAllPatient();
            }
            else if(option==4){
                System.out.println(test.canDoctorGoHome());
            }
            else if(option==5){
                test.cancelAll();;
            }
            else if(option==6){
                test.reverseTheLine();;
            }
            else if(option==7){
                System.out.println("Exit");
                return;
            }
        }
    }
}
