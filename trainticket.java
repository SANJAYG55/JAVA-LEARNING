public class trainticket {
    public static void main(String[] args) {
        
    }
    
}
class train{
    String name;
    int departureTime;
    String startsta;
    String endsta;
    int passStrength;
    int trainNum;
   
     

    train(String name,int departureTime,String startsta,String endsta,int passStrength,int trainNum){
        this.name=name;
        this.departureTime=departureTime;
        this.startsta = startsta;
        this.endsta = endsta;
        this.passStrength=passStrength;
        this.trainNum=trainNum;
    }

}
class reservationSyst{
    int ticketnum;
    reservationSyst(int ticketnum){
        this.ticketnum=ticketnum;
    }

}
