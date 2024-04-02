
 class Employeee{
    int id;
    String name;
    int phonenumber;
    String address;
    int salary;
    int num_of_days;

    void getsal(){
        int  salary = num_of_days*5000;

        System.out.println("salary :"+salary);
    }

    void calculateWorkinngDays(){
        System.out.println(num_of_days);
    }
}

class Staff extends Employeee{

    String role;
    int year_of_experience;
    String dept_name;

    Staff(String role,int year_of_experience,String dept_name,String name,int phonenumber,int num_of_days,int id){
        this.role = role;
        this.year_of_experience=year_of_experience;
        this.dept_name=dept_name;
        this.name=name;
        this.phonenumber=phonenumber;
        this.num_of_days=num_of_days;
        this.id=id;
    }


    void getdetails(){
        System.out.println("role :"+role);
        System.out.println("year_of_experience :"+year_of_experience);
        System.out.println("dept_name :"+dept_name);
        System.out.println("id :"+id);
        System.out.println("phonenumber :"+phonenumber);
        System.out.println("name :"+name);

    
    }

    
}


public class Employee{
public static void main(String[] args) {
    Staff s = new Staff("Engineer",10,"SOFTWARE","SANJAY",1234567891,90,100);
    s.getdetails();
    s.getsal();
    
    // s.role = "Engineer";
    // s.year_of_experience = 10;
    // s.dept_name="software";
    // s.id=100;
    // s.address="chennai";
    // s.name="sanjay";
    // s.num_of_days=90;
    // s.phonenumber=1234456778;
    // s.getdetails();


}
}    
    
