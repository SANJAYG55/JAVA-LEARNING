
// You are designing a system to represent different types of vehicles. 
// Implement a class 'Vehicle' with attributes like speed and fuel capacity. 
// Create subclasses for Car and Bicycle inheriting from the Vehicle class. 
// Define a class 'Vehicle with attributes and methods related to speed and fuel capacity.

// -'Implement subclasses for Car and Bicycle inheriting from the Vehicle class. 
// Showcase inheritance by accessing attributes and methods from both subclasses.




public class vehicle {
    int speed;
    int fuel_capacity;
    String model_name;
    vehicle(){

    }
    vehicle(int speed,int fuel_capacity,String model_name){
        this.fuel_capacity=fuel_capacity;
        this.speed = speed;
        this.model_name=model_name;
    }
    void getspeed(){
        System.out.println(speed);
    }
    void getfuel(){
        System.out.println(fuel_capacity);
    }
    void display(){
        System.out.println(model_name);
        System.out.println("Speed"+speed+"km/hr");
        System.out.println(fuel_capacity); 
    }
    public static void main(String[] args) {

        vehicle v = new vehicle(200, 020,"vehicle");
        v.display();


        car c =new car("FORTUNER", "diesel",100,15);
        c.display();
        c.engitype();


        bicycle b = new bicycle("KTM", "petrol",150,20);
        b.display();
        b.gettype();
        
    }
}
class car extends vehicle{
   // String model_name;
    String engine_type;

    car(String model_name,String engine_type,int speed,int fuel_capacity){
        super(speed,fuel_capacity,model_name);
        this.engine_type=engine_type;
        // this.model_name=model_name;
        // this.speed=speed;
        // this.fuel_capacity=fuel_capacity;

    }
    void engitype(){
        System.out.println(engine_type);
    }
}
   

class bicycle extends vehicle{
    //String model_name;
    String type;


    bicycle(String model_name,String type,int speed,int fuel_capacity){
        super(speed,fuel_capacity,model_name);
        // this.model_name = model_name;
        // this.speed=speed;
        // this.fuel_capacity=fuel_capacity;
        this.type=type;
   }
  void gettype(){
    System.out.println(type);
  }
}
