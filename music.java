// 5) You are developing a music system with different audio devices. Implement an interface 'Playable with methods like 'play()' and stop()'. Implement classes for MP3Player and Radio implementing this interface.

// - Design an interface 'Playable with play()' and 'stop() methods. -Implement classes for MP3Player and Radio, both implementing the "Playable interface.

// - Demonstrate how interface methods are implemented in these classes.

public class music{
    public static void main(String[] args) {
        Playable m =new MP3Player();
        m.play();
        m.stop();
        m= new Radio(); 
        m.play();
        m.stop();

    }

}

interface Playable{
    // int a;
     void play();
     void stop();
}
 
class MP3Player implements Playable{
   public void play(){
        System.out.println("MP3Player Playing Song");
    }
    public void stop(){
        System.out.println("MP3Player Stopped Playing Song");
    }
}

class Radio implements Playable{
    public void play(){
        System.out.println("Radio Playing Song");
    }
   public void stop(){
        System.out.println("Radio Stopped Playing Song");
    }
}


