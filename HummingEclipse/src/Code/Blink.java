package Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import com.birdbraintechnologies.HummingbirdRobot;

public class Blink {
    public static void main(String[] args) throws IOException, InterruptedException{
    // Create a new Humingbird object
        PracticeBot discoBall = new PracticeBot();
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // discoBall.speak("Heheheha");
        // Thread.sleep(3000);
        // for(int i = 0; i < 10; i ++) 
        // {
        //     int r, g, b;
        //     r = (int) (Math.random()*255);
        //     g = (int) (Math.random()*255);
        //     b = (int) (Math.random()*255);
        //     // turn the light on
        //     discoBall.setFullColorLED(2, r, g, b);
        //     // wait one second
        //     Thread.sleep(500);
        //     discoBall.setFullColorLED(2, 0, 0 ,0);
        //     Thread.sleep(500);
        // }
        byte[] sound = PlaySound.fileToByte("H:\\APCSA\\HummingEclipse\\HummingEclipse\\src\\sounds\\Bad.wav");
        discoBall.setFullColorLED(1, 0, 0, 0);
        discoBall.setFullColorLED(2, 0, 0, 0);
        discoBall.setServoPosition(1, 40);
        boolean goodEnd = false;
        // discoBall.setServoPosition(2, 5); //CHANGE POSITION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("");
        System.out.println("Press ENTER to quit.");
        Boolean startUp = true;
        while (true) {
        if (in.ready()) break;
            Thread.sleep(1000);
            if (startUp) {
                // discoBall.startUp();
                discoBall.playClip((sound));
                startUp = false;
                Thread.sleep(1000);
            }
            if (discoBall.getSensorValue(1) < 100) {
                discoBall.awaken();
                discoBall.makeDeal();
                String deal = MyTools.readString("Make Deal? Y/N: ");
                if (deal.equalsIgnoreCase("y")) {
                    discoBall.contractTrue();
                    goodEnd = true;
                    break;
                }
                else {
                     discoBall.getNo();
                    break;
                }
            }
        }
        if (goodEnd == false) {
        discoBall.speak("Goodbye then you fool. I hope you rot in the end.");
        }
        discoBall.setFullColorLED(1, 0, 0, 0);
        discoBall.setFullColorLED(2, 0, 0, 0);
        discoBall.setServoPosition(1, 255); //CHANGE POSITION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // discoBall.setServoPosition(2, 0); //CHANGE POSITION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Thread.sleep(3000);

    discoBall.disconnect();
    }
}
