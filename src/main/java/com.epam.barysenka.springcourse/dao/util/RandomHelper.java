package com.epam.barysenka.springcourse.dao.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomHelper {
    private static final int randomSeed = 50000;

    public static String getRandomString(){
        Random randomGenerator = new Random(randomSeed); //put in random seed
        int min = 6;
        int max = 10;

        int stringLength = min+randomGenerator.nextInt(max-min+1);
        StringBuilder stringBuilder= new StringBuilder(stringLength);
            while(stringBuilder.length() < stringLength){
                //97 is ASCII for character 'a', and 26 is number of alphabets
                stringBuilder.append((char)(97 + randomGenerator.nextInt(26)));
            }
        return stringBuilder.toString();
    }

    public static double getRandomPrice() {
        Random randomGenerator = new Random(randomSeed);
        return randomGenerator.nextDouble();
    }


    public static Date getRandomDate() {
        DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        RandomDate rd;
        try {
            rd = new RandomDate(df.parse("01.01.2010"), df.parse("31.12.2018"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return rd.get();
    }

}
