// You are tasked with designing a class hierarchy for a library management system.
// The system should have classes for 'Book', 'Author', and 'Library.
// Each book has attributes such as title, author, and publication year. 
// Authors have details like name and biography. The Library class should manage a collection of books.

// Define the structure of the 'Book' and Author' classes, considering - encapsulation. - Implement a method in the 'Library' class to search for books based on specific

// criteria.

// - Demonstrate the instantiation of objects and showcase how objects interact in the library system.


public class library {
    String libname="kcg library";
    int libcode =3110 ;

   void getlib(){
    System.out.println("library name: "+libname+ "library code: "+libcode);
   }  


   public static void main(String[] args) {
    author a=new author("james", 70, "usa");
    book b =new book("the ghost", "james",1999);
    a.getlib();
    b.getbook();
    a.getauthor();
   }
}

class book extends library{
    String title;
    String author;
    int publiyear;

    book(String title, String author,int publiyear){
        this.title=title;
        this.author=author;
        this.publiyear=publiyear;
    }

   void getbook(){
    System.out.println("title: "+title+"author: "+author+"publiyear: "+publiyear);              
   }

}

class author extends library{
    String aname;
    int age;
    String place;

    author(String aname, int age,String place){
        this.aname=aname;
        this.age=age;
        this.place=place;
    }

    
   void getauthor(){
    System.out.println("name: "+aname+"age: "+age+"place: "+place);              
   }

}
