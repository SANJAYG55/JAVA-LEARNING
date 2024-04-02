// 4) Develop an inventory management system for a store. Create a class 'Product with attributes like name and price. 
//Implement a polymorphic collection to store different types of products.
// - Define a class 'Product' with attributes like name and price.
// - Implement subclasses for different types of products.
// - Use polymorphism to create a collection that can store various product types.

public class store {
    public static void main(String[] args) {
         product ok = new milk("Aavin", 35, "100% Veg");
         ok.display();
         ok =new biscuit("Bourbon", 10, "100% Veg");
         ok.display();
         ok =new chips("Lays", 5, "100% Veg");
         ok.display();
    }
    
}

class product{
    String name;
    int price;
    String type;


    void display(){
        System.out.println("---------------------------");
        System.out.println("Product name: "+name);
        System.out.println("Product price: "+price+"Rupees");
        System.out.println("Product type: "+type);
        System.out.println("---------------------------");

    }
}

class milk extends product{
   
    milk(String name,int price, String type){
        this.name=name;
        this.price=price;
        this.type=type;
    }
}

class biscuit extends product{

    biscuit(String name,int price, String type){
        this.name=name;
        this.price=price;
        this.type=type;
    }

}

class chips extends product{
    chips(String name,int price, String type){
        this.name=name;
        this.price=price;
        this.type=type;
    }

}

