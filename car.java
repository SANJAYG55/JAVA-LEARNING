public class car {
    static int petrol_price=100;
    int no_of_seats;
    int no_of_wheels;
    String colour;
    String engine_type;

    car(int no_of_seats,int no_of_wheels,String colour,String engine_type){
        this.no_of_seats=no_of_seats;
        this.no_of_wheels=no_of_wheels;
        this.colour=colour;
        this.engine_type=engine_type;

    }
    public static void main(String args[]){
        punch p= new punch(656,"suv",55,20,56495,"suvXX",50,10,6,4,"red","petrol");
        p.aboutpunch();
        p.getpunchmilage();
        p.abouttata();
        p.gettatamilage();
        //  ta.gettatamilage();
        //  tata ta= new tata( 585, "suvXXX", 55, 5, 6, 5,"red", "petrol");
        //  ta.abouttata();
        //  ta.gettatamilage();
       
    }
    
}

class tata extends car{
    int model_no;
    String model_name;
    int distance_travelled;
    int fuel_consumed;
    tata(int model_no,String model_name,int distance_travelled,int fuel_consumed,int no_of_seats,int no_of_wheels,String colour,String engine_type){
        super( no_of_seats, no_of_wheels, colour, engine_type);
        
    }

    void gettatamilage(){
        int mil=distance_travelled/fuel_consumed;
        System.out.println("Milage of TATA is:"+mil);
         
    }
    void abouttata(){
        System.out.println(" TATA model no is:"+model_no);
        System.out.println(" TATA model name is:"+model_name);
    }
    
}
class punch extends tata{

          int punch_model_no;
          String punch_model_name;
          int punch_distance_travelled;
          int punch_fuel_consumed;

          punch(int punch_model_no,String punch_model_name,int punch_distance_travelled,int punch_fuel_consumed,int model_no, String model_name,int distance_travelled,int fuel_consumed,int no_of_seats,int no_of_wheels,String colour,String engine_type){
            super(model_no,model_name,distance_travelled,fuel_consumed,no_of_seats,no_of_wheels,colour,engine_type);
            this.punch_model_no=punch_model_no;
            this.punch_model_name=punch_model_name;
            this.punch_distance_travelled=punch_distance_travelled;
            this.punch_fuel_consumed=punch_fuel_consumed;
            

          }


        void getpunchmilage(){
            int mil=punch_distance_travelled/punch_fuel_consumed;
            System.out.println("Milage of punch is:"+mil);
             
        }
        void aboutpunch(){
            System.out.println(" punch model no is:"+model_no);
            System.out.println(" punch model name is:"+model_name);
        }

}
