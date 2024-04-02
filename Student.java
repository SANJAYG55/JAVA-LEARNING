public class Student {

    int mark1,mark2,mark3,mark4,mark5;
    int id;
    double CGPA;
    String Name;
    int age;
    int yearofstudy;

    void marks(){
        System.out.println("mark1 :"+mark1);
        System.out.println("mark2 :"+mark2);
        System.out.println("mark3 :"+mark3);
        System.out.println("mark4 :"+mark4);
        System.out.println("mark5 :"+mark5);

    }
    int getTotal(){
        int sum = mark1+mark2+mark3+mark4+mark5;
        System.out.println("The total: "+sum);

        return 0;
    }

    int getAverage(){

        int sum1 = mark1+mark2+mark3+mark4+mark5;
        int avg = sum1/5;

        System.out.println("The average :"+avg);

        return 0;
    }

    void getCGPA(){
        System.out.println("CGPA : "+CGPA);
    }
    
    void info(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+age);

    }

    public static void main(String[] args) {
        
      Student h1 = new Student();

      h1.mark1 = 50;
      h1.mark2 = 60;
      h1.mark3 = 65;
      h1.mark4 = 70;
      h1.mark5 = 80;

      h1.CGPA = 8.15;

      h1.age=20;
      h1.Name = "sanjay";

      h1.info(); 
      h1.marks();
      h1.getTotal();
      h1.getAverage();
      h1.getCGPA();
    }
    
}
