package Code;

import com.birdbraintechnologies.HummingbirdRobot;

public class PracticeBot  extends HummingbirdRobot{
    public static int l = 1000;
    public static int v = 10;
    public static byte[] bad = PlaySound.fileToByte("H:\\APCSA\\HummingEclipse\\HummingEclipse\\src\\sounds\\Bad.wav"); 
    public static byte[] awaken = PlaySound.fileToByte("H:\\APCSA\\HummingEclipse\\HummingEclipse\\src\\sounds\\awaken.wav"); 
    public static byte[] thunder = PlaySound.fileToByte("H:\\APCSA\\HummingEclipse\\HummingEclipse\\src\\sounds\\thunder.wav"); 
    public static byte[] deal = PlaySound.fileToByte("H:\\APCSA\\HummingEclipse\\HummingEclipse\\src\\sounds\\j.wav"); 
    public static byte[] contract = PlaySound.fileToByte("H:\\APCSA\\HummingEclipse\\HummingEclipse\\src\\sounds\\PICESESE.wav"); 
    public static byte[] no = PlaySound.fileToByte("H:\\APCSA\\HummingEclipse\\HummingEclipse\\src\\sounds\\not.wav"); 
    public static byte[] higher = PlaySound.fileToByte("H:\\APCSA\\HummingEclipse\\HummingEclipse\\src\\sounds\\higher.wav"); 

    public void blink(int port, int numBlinks) throws InterruptedException {
        for (int i = 0; i < numBlinks; i++) {
            setLED(1, 255);
            Thread.sleep(1000);
            setLED(1, 0);
            Thread.sleep(1000);        }
    }
    public void startUp() throws InterruptedException {
        playTone(196, v, 95);
        playTone(196, v, 95);
        playTone(523, v, 95);
        playTone(196, v, 95);
        playTone(494, v, 95);
        playTone(196, v, 95);
    }
    public void getNo() throws InterruptedException{
        playClip(no);
        // speak("No? Ok.");
        Thread.sleep(6000);
    }

    public int randomness() {
        int r = (int) (Math.random()*255);
        return r;
    }
    public void badBone() throws InterruptedException{
        int t = 95;
        l = (int) (Math.random()*50000)+100; 
        playTone(196, v, t);
        playTone(196, v, t);
        playTone(523, v, t);
        playTone(196, v, t);
        playTone(494, v, t);
        playTone(196, v, t);
        if (v == 10) {
        speak("Bad To the Bone");
        System.out.println("Bad To the Bone " + t);
        }
        v = 10;
        Thread.sleep(6000);
        Thread.sleep(6000);
    }
    public void awaken() throws InterruptedException {
        //Plays AWAKEN JOJOs here
        playClip(awaken);
        Thread.sleep(3200);
        setServoPosition(1, 90); 
        setFullColorLED(1, 255, 0, 0);
        setFullColorLED(2, 255, 0, 0);
        for (int i = 0; i <= 9200; i+= 1000) {
            setServoPosition(1, 20); 
            setFullColorLED(1, 0, 0, 0);
            setFullColorLED(2, 0, 0, 0);
            Thread.sleep(500);
            setServoPosition(1, 90); 
            setFullColorLED(1, 255, 0, 0);
            setFullColorLED(2, 255, 0, 0);
            Thread.sleep(500);
        }
        setServoPosition(1, 90); 
        setFullColorLED(1, 255, 0, 0);
        setFullColorLED(2, 255, 0, 0);
    }

    public void makeDeal() throws InterruptedException {
        playClip(bad);
        Thread.sleep(3000);
        playClip(deal);
        setServoPosition(2, 5); //CHANGE POSITION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Thread.sleep(6000);
        playClip(thunder);
        Thread.sleep(7000);
    }
    public void contractTrue() throws InterruptedException {
        playClip(contract);
        Thread.sleep(8500);
        // speak("The contract. Is Formed.");
        // Thread.sleep(1500);
        playClip(higher);
        for (int i = 22; i <= 22; i++) {
            setFullColorLED(1, randomness(), randomness(), randomness());
            setFullColorLED(2, randomness(), randomness(), randomness());
            Thread.sleep(1000);
        }
        // Thread.sleep(22000);
        speak("What is tho name?");
        String s = MyTools.readString("Name?: ");
        s = s.substring(0,4) + "Axtonef The 3rd";
        speak("Hello then " + s + " your soul is in good housing. BWAHAHAHAHHA. I would move my arms but they seem to have been disconnected or sum");
        Thread.sleep(7000);
        playClip(thunder);
        Thread.sleep(7000);
        playClip(bad);
        speak("YOHOHOHOHOHOHOHOH");
        Thread.sleep(3000);
    }
}
