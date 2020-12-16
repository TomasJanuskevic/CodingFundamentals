package kartuves;

import java.util.Random;

public enum Words {
    STALAS, LANGAS, BATAS, VARLE;


    public static Words getRandomWord() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
