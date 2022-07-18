package Utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class General {
    static Random rand = new java.util.Random();
    static int random = ThreadLocalRandom.current().nextInt();

    public static String randomName(){
        return "Patient" + + rand.nextInt(100);
    }
    public static String randomUmur(){
        return String.valueOf(rand.nextInt(80));
    }
    public static String randomNik(){return "235790100595" + + rand.nextInt(10000);}
    public static String randomPhone(){
        return "08570300" + + rand.nextInt(10000);
    }
    public static String randomAddress(){
        return "Jl.Cendrawasih" + + rand.nextInt(100);
    }
    public static String randomNpaIdi(){
        return "451" + + rand.nextInt(1000);
    }
    public static String randomNameDoctor(){
        return "Doctor" + + rand.nextInt(100);
    }
    public static int randomId(){return rand.nextInt(1000);}
    public static int randomAntrian(){
        return rand.nextInt(100);
    }
    public static String randomNote(){
        return "Obat " + rand.nextInt(3)+ "x Sehari setelah makan";
    }
    public static String randomUsername(){
        return "DocUser" + + rand.nextInt(1000);
    }
    public static String randomPassword(){
        return "DocPass" + + rand.nextInt(1000);
    }
}
