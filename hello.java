class hello{  

    int mark1;
    int mark2;
    int mark3;
    int sum;
    String name;


    void name(){
        System.out.println("Name is :"+name);
    }

    void stuMark(){
        System.out.println("mark1 is: "+mark1);
        System.out.println("mark2 is: "+mark2);
        System.out.println("mark3 is "+mark3);
    }

    void sum(){
        System.out.println("sum of marks is:"+sum);
    }
    public static void main(String args[]){  
        
        hello h = new hello();

        h.name = "sanjay";
        h.name();

        h.mark1 =50;
        h.mark2 =60;
        h.mark3 =70;
        h.stuMark();
        h.sum = h.mark1+h.mark2+h.mark3;
        h.sum();

        hello h2 = new hello();

        
        h2.name = "ajay";
        h2.name();
        h2.mark1 =60;
        h2.mark2 =70;
        h2.mark3 =80;
        h2.stuMark();

        h2.sum = h.mark1+h.mark2+h.mark3;
        h2.sum();
    }  
}  













