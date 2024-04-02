import java.util.Scanner;
 
 class rectangle{ 
    int areaofrectangle(int l,int b){

        int a = l*b;
        return a; 
    }
}

class circle {

    int areaofcircle(int r){
        //float pi = 3.14f;
        int b = (int)(3.14*(r*r));
        return b;
    }
}
 class triangle{

    double areaoftriangle(int b1,int h1){
        double e = (0.5*(b1*h1));
        return e;
    }
}

public class SHAPE{
    public static void main(String arge[]){

        Scanner sc = new Scanner(System.in);


        System.out.print(String.format("1.circle\n2.rectangle\n3.triangle"));
        System.out.println("enter choice:");
        int c = sc.nextInt();

        switch(c){
            case 1:
            System.out.println("enter length:");
            int l =sc.nextInt();
            System.out.println("enter breadth :");
            int b = sc.nextInt();
            rectangle re = new rectangle();
            int g = re.areaofrectangle(l, b);
            System.out.println("area of rectangle:"+g);
            break;

            case 2:
            System.out.println("enter radius:");
            int r =sc.nextInt();
            circle ci = new circle();
            int h = ci.areaofcircle(r);
            System.out.println("area of circle:"+h);
            break;

           case 3:
           System.out.println("enter breadth:");
           int b1 =sc.nextInt();
           System.out.println("enter height:");
           int h1 =sc.nextInt();
           triangle y = new triangle();
           double p = y.areaoftriangle(b1,h1);

          System.out.println("area of triangle:"+p);
          break;
        }
        sc.close();
    }

}



