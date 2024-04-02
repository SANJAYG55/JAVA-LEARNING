public class bank {

    static int Balance=1000;

    // void setbalance(int t){
    //     Balance =t;
    //     System.out.println("Balance:"+Balance);
    // }


    void credit(int a){
        if(a>=0 && a<=1500){
        Balance = Balance+a;
        System.out.println("balance after credit:"+Balance);
        }
        else{
            System.out.println("no, you can't credit amount more than 1500");
        }

    }
  
    void  debit(int b){
        if(b<=Balance){
        Balance = Balance - b;  
        System.out.println("balance after debit: "+Balance);
    }
    else{
        System.out.println("can't debit insufficient amount");
    }
}
//   void incre(){
//     Balance++;
//     System.out.println("Balance is:"+Balance);

//   }

 void getBalance(){

    System.out.println("Balance: "+Balance);

 }



public static void main(String args[]){

   bank b1 = new bank();
    
//    b1.setbalance(1000);
   b1.getBalance();
   b1.credit(5000);

   b1.debit(500);

   bank b2 = new bank();

   b2.getBalance();
   b2.credit(20);





}
}
