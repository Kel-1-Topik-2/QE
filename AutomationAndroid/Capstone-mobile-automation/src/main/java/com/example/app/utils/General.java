package com.example.app.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class General {
    static Random rand = new java.util.Random();
    static int random = ThreadLocalRandom.current().nextInt();

    public static String randomName(String fullName){
        return "Patient" + + rand.nextInt(100);
    }
    public static String randomUmur(String usia){
        return String.valueOf(rand.nextInt(80));
    }
    public static String randomNik(String nik){return "23579010059527" + + rand.nextInt(99);}
    public static String randomPhone(String numberPhone){
        return "08570300" + + rand.nextInt(10000);
    }
    public static String randomAddress(String address){
        return "Jl.Cendrawasih" + + rand.nextInt(100);
    }
    public static String randomNpaIdi(String npaIdi){
        return "451" + + rand.nextInt(999);
    }
    public static String randomNameDoctor(String fullName){
        return "Doctor" + + rand.nextInt(500);
    }
    public static String randomNote(String note){
        return "Obat " + rand.nextInt(3)+ "x Sehari setelah makan";
    }
    public static String randomUsername(String username){
        return "DocUser" + + rand.nextInt(500);
    }
    public static String randomPassword(){
        return "DocPass" + + rand.nextInt(1000);
    }
}
