public class constructor {
    int id;
    String name;
    long total;

    constructor(){

    }

    constructor(int m1, int m2,int m3,int m4,int m5,int id, String name){
        this.name = name;
        this.id = id;
        this.total =  gettotal(m1, m2, m3, m4, m5); 
        
    }

    long gettotal(int m1, int m2,int m3,int m4,int m5){

        long total = m1+m2+m3+m4+m5;
        return total;
    }

    void display(){
        // System.out.println("NAME: "+name  +"ID: "+id +"TOTAL: "+total);
        //System.out.print(String.format("NAME:%s\nID:%d\nTOTAL:%ld" ,name,id,total));
        System.out.printf("NAME:%s\nID:%d\nTOTAL:%d\n",name,id,total);
    }


    public static void main(String args[]){

        constructor ob1 = new constructor(50,60,70,55,70,100,"SANJAY");
        ob1.display();

        constructor ob2 = new constructor(60,55,80,90,50,99,"PRABHA");
        ob2.display();

        constructor ob3 = new constructor(50,55,60,55,80,69,"VIGNESH");
        ob3.display();

    }

    }

    

