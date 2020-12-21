package hangMan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {


        System.out.println(getRandomWordFromFile());
    }

    private static String getRandomWordFromFile() {
        final String FILE_LOCATION = "src/main/java/hangMan/Words.txt";
        List<String> words = new ArrayList<>();
        Random random = new Random();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String singleFileLine = bufferedReader.readLine();

            while (singleFileLine != null) {
                words.add(singleFileLine);
                singleFileLine = bufferedReader.readLine();
            }

        } catch (IOException exception) {
            System.out.println("Ivyko klaida");
        }
        return words.get(random.nextInt(words.size()));
    }
}
