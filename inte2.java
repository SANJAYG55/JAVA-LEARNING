// 1) Design a program for managing different types of vehicles. 
//Create interfaces 'Engine' and 'Features' with methods related to engine functionality and additional features. 
//Implement a class 'Car' that extends 'Vehicle' and implements both interfaces.
// Define interfaces 'Engine' and 'Features' with methods related to their respective functionalities.
// -Create an abstract class 'Vehicle' with a parameterized constructor.
// Implement a class 'Car' that extends 'Vehicle' and implements both Engine" and 'Features' interfaces.
// - Access the superclass constructor from the 'Car' class.


public class inte2{
    public static void main(String[] args) {
        car c =new car("engi01", "refined", 2024, 159, "petrol", 5);
        c.enginename();
        c.engistype();
        c.topspeed();
        c.capacity();
        c.sensor();
        c.autopilot();
    }

}

interface engine{
    void engistype();
    void enginename();
    void topspeed();
    void capacity();

}

interface features{
    void sensor();
    void autopilot();
}

abstract class vehicle {
    int year;
    String type;
    vehicle(int year,String type){
        this.year = year;
        this.type= type;
    }
    void display(){
        System.out.println("type:"+type);
        System.out.println("year:"+year);
    }

}
class car extends vehicle implements engine,features{
    String enginame;
    int topspeed;
    String engitype;
    int capacity;
    car(String enginame, String type,int year,int topspeed,String engitype,int capacity){
        super(year, engitype);
        this.enginame= enginame;
        this.topspeed= topspeed;
        this.engitype= engitype;
         this.capacity= capacity;
    }
    public void engistype(){
        System.out.println("Engine type:"+engitype);
    }
    public void enginename(){
        System.out.println("Engine Name:"+enginame);
    }
    public void topspeed(){
        System.out.println("Top Speed:"+topspeed);
    }
    public void capacity(){
        System.out.println("engine capacity:"+capacity);

    }
    public void sensor(){
        System.out.println("This car have many sensor");

    }
    public void autopilot(){
        System.out.println("This car have autopilett mode in it");

    }


}