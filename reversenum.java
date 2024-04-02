public class reversenum {

int num;
int digit;

reversenum(int num){
    this.num = num;
int r = revnum(num);
System.out.println("rev num:"+r);
    
}

int revnum(int num){
    int digit=0;
    int count =1;
    while(count<6){
        
    int rem = num % 10;
    digit = digit *10 + rem;
     num = num/10;
    count++;

    }
    return digit;


}

public static void main (String args[]){


    //int num = 85321;
    //reversenum rvr = new reversenum(num);

  }    
}
