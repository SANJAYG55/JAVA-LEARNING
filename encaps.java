public class encaps {   
    public static void main(String[] args) {
    
        // Details d = new Details();
        // d.setGetId(100);
        // System.out.println(d.getGetId());
        // d.setGetbalance(100000);
        // System.out.println(d.getGetbalance());
        
    }

}

class Details{
    private int getId;
    private int getbalance;
    private int mobnum;


public int getGetId() {
    return getId;
}
public void setGetId(int getId) {
    this.getId = getId;
}
public int getGetbalance() {
    return getbalance;
}
public void setGetbalance(int getbalance) {
    this.getbalance = getbalance;
}
public int getMobnum() {
    return mobnum;
}
public void setMobnum(int mobnum) {
    this.mobnum = mobnum;
}

}

// class sanjay {
//     Details m =new Details();
//     m.setGetId(100);

// }