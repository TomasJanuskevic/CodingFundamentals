package hangMan;

import java.util.Random;

public enum Words {
    STALAS, LANGAS, BATAS, VARLE;


    public static String getRandomWord() {
        Random random = new Random();
        return values()[random.nextInt(values().length)].name();
    }
}
