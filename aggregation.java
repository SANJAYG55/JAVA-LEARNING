public class aggregation {
    int id;
    String name;
    number num;

    aggregation(int id,String name,number num){

        this.id=id;
        this.name=name;
        this.num=num;

    }

    void adisplay(){
        System.out.println("id :"+id+" name :"+name);
    }

    public static void main(String[] args) {
        number n =new number("Dubai main road Dubai kuruku theru",600115,"Dubai");
        aggregation ag =new aggregation(100,"VIGNESH",n);
        ag.adisplay();
        ag.num.display();
        
    }
}

class number{
    String street;
    int pincode;
    String state;

    number(String street,int pincode,String state){
        this.street=street;
        this.pincode=pincode;
        this.state=state;
    }

    void display(){
        System.out.println("ADDRESS:"+street+" ,"+state+" ,"+pincode);
    }
}
