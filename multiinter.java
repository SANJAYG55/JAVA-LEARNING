public class multiinter {
    public static void main(String[] args) {

        GTX gtx =new GTX();
        gtx.display();
    }
}
    interface Android{
        void modelName();
        void androidVersion();
        void displayLength();
        void RAM();
    }
    class onePlus implements Android{
       public void modelName(){
        System.out.println("Model : onePlus 12R");
       }
       public void androidVersion(){
        System.out.println("androidVersion : 15");
       }
       public void displayLength(){
        System.out.println("displayLength : 17.5 inch");
       }
       public void RAM(){
        System.out.println("RAM : 8GB");
       }

    }

    class Samsung implements Android{
        public void modelName(){
         System.out.println("Model : Samsung S24");
        }
        public void androidVersion(){
         System.out.println("androidVersion : 15");
        }
        public void displayLength(){
         System.out.println("displayLength : 19 inch");
        }
        public void RAM(){
         System.out.println("RAM : 16GB");
        }
 
     }
     class Nokia implements Android{
        public void modelName(){
         System.out.println("Model :Nokia 5x");
        }
        public void androidVersion(){
         System.out.println("androidVersion : 13");
        }
        public void displayLength(){
         System.out.println("displayLength : 14.5 inch");
        }
        public void RAM(){
         System.out.println("RAM : 6GB");
        }
 
     }

     interface Iphone {
        void camera();
        void battery();
        void wifiversion();
     }

     class Iphone11 implements Iphone{
        public void camera(){
            System.out.println("camera : 55mp");
        }
        public void battery(){
            System.out.println("Battery : 3500 mAh");
        }
        public void wifiversion(){
            System.out.println("wifiversion : 5.0");
        }
     }
     class Iphone12 implements Iphone{
        public void camera(){
            System.out.println("camera : 65mp");
        }
        public void battery(){
            System.out.println("Battery : 4000 mAh");
        }
        public void wifiversion(){
            System.out.println("wifiversion : 5.5");
        }
     }
     class Iphone13 implements Iphone{
        public void camera(){
            System.out.println("camera : 75mp");
        }
        public void battery(){
            System.out.println("Battery : 5000 mAh");
        }
        public void wifiversion(){
            System.out.println("wifiversion : 6.5");
        }
     }

     class GTX implements Android,Iphone{
        public void modelName(){
            System.out.println("Model : GTX 5LR");
           }
           public void androidVersion(){
            System.out.println("androidVersion : 16");
           }
           public void displayLength(){
            System.out.println("displayLength : 18 inch");
           }
           public void RAM(){
            System.out.println("RAM : 16 GB");
           }
           public void camera(){
            System.out.println("camera : 80 mp");
        }
           public void battery(){
            System.out.println("Battery : 6000 mAh");
        }
           public void wifiversion(){
            System.out.println("wifiversion : 7.0");
        }

        void display(){
            modelName();
            androidVersion();
            displayLength();
            RAM();
            camera();
            battery();
            wifiversion();
        }

     }
    
    


