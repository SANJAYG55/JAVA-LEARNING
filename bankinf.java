public class bankinf {
    public static void main(String[] args) {
        company c = new DepartmentStaff(90,"sanjay",100);
         c.getprofile();
         System.out.println("----------------------------------------------");
         c = new nontechstaff(80,"kumar",250);
         c.getprofile();
         System.out.println("----------------------------------------------");
    }
    
}
 abstract class company{
    int numberofworkingdays;
    String name;
    int id;
    
    company( int numberofworkingdays,String name,int id){
        this.numberofworkingdays =numberofworkingdays;
        this.name = name;
        this.id =id;
    }

    abstract void  getsalary();
    

    void getprofile(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("numberofworkingdays:"+numberofworkingdays);
        getsalary();
        getcompanyname();

        System.out.println(getClass());
    }
 abstract  void getcompanyname();

protected  int gettotalworkingdays(){
return numberofworkingdays;
    }
}

class DepartmentStaff extends company{
    int numberofworkingdays;

    DepartmentStaff(int numberofworkingdays,String name,int id){
        super(numberofworkingdays, name, id);
        this.numberofworkingdays=numberofworkingdays;
    }

    void getsalary(){
       int sal = 1000 *numberofworkingdays;
       System.out.println("Salary : "+sal);
        }

    void getcompanyname(){
        System.out.println("Company name : "+"Tcs");
        }
    }

class nontechstaff extends company{
    int numberofworkingdays;
    nontechstaff(int numberofworkingdays,String name,int id){
        super(numberofworkingdays, name, id);
        this.numberofworkingdays=numberofworkingdays;
    }

    void getsalary(){
       int sal = 1000 *numberofworkingdays;
       System.out.println("Salary : "+sal);
        }
     void getcompanyname(){
        System.out.println("Company name : "+"Mcs");
        }
     
  } 
