import java.util.Scanner;

public class empsalary {
    String name;
    int empid;
    int workingdays;
    int perdaysal;
    long msalary;


    empsalary(String name,int empid,int workingdays,int perdaysal){
        this.name = name;
        this.empid = empid;
        this.workingdays = workingdays;
        this.perdaysal = perdaysal;
        this.msalary = getsalary( perdaysal,workingdays);
    }


    long getsalary(int perdaysal,int workingdays){
        long msalary = workingdays* perdaysal;
        return msalary;
    }

    void dis(){
        System.out.print(String.format("NAME:%s\nEMPID:%d\nWORKINGDAYS:%d\nPERDAYSALARY:%d\nMONTHLY SALARY:%d",name,empid,workingdays,perdaysal,msalary));
    }


    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NAME:");
        String name = s.nextLine();
        System.out.println("ENTER EMPLOYEE ID:");
        int empid = s.nextInt();
        System.out.println("ENTER NO.OF WORKING DAYS:");
        int workingdays = s.nextInt();
        System.out.println("ENTER PER DAY SALARY:");
        int perdaysal = s.nextInt();
        s.close();

        empsalary sal = new empsalary(name, empid, workingdays, perdaysal);
        sal.dis();


        


    }
    
}
