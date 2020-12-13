package introduction;


public class StringExercises {
    // i metoda rasome parametrus
    public static void printHelloName(String name, String lastName, int age) {
        String initialText = "Print my name on the screen... ";
        System.out.println(initialText + name + " " + lastName + " " + age + " metu," + " how are you?");
    }

    public static void printStringPattern() {
        System.out.println("Basic pattern:");

        //isspausdinsime dideli JAva zodi
        System.out.println("   J   a   v   v   a");
        System.out.println("   J  a a   v v   a a ");
        System.out.println("J  J aaaaa   v   aaaaa");
        System.out.println(" JJ  a   a       a   a ");
    }

    public static void printLowerCase(String eilute) {
        System.out.println("Paverciame eilutes simbolius mazais: " + eilute.toLowerCase());
        System.out.println("Paverciame eilutes simbolius dideliais: " + eilute.toUpperCase());
    }

    public static void checkUserName(String username) {
        if (username.length() > 5) {
            System.out.println("Viskas liuks");
        } else {
            System.out.println("Username per trumpas");
        }
    }

    public static void printReversedString(String eilute) {
        System.out.println("Printing reversed string " + eilute);

        //StringBuilder papildoma klase kuri duoda papildomo funkcionalumo
        //dirbant su eilutemis
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(eilute);
        stringBuilder.reverse();

        System.out.println("Apsukta eilute: " + stringBuilder);
    }

    public static void printHalfOfString(String eilute) {
        System.out.println("Printing first half of provided string - " + eilute);
        int eilutesIlgis = eilute.length();
        int pusesEilutesIlgis = eilutesIlgis / 2;

        String puseEilutes = eilute.substring(0, pusesEilutesIlgis);
        System.out.println("puse eilutes " + puseEilutes);
    }

    public static void printWordWithutFirstLetter(String eilute) {
        System.out.println("Pilnas zodis - " + eilute);
        int eilutesIlgis = eilute.length();
        String nukirptaEilute = eilute.substring(1, eilutesIlgis);
        System.out.println("Nukirpta eilute - " + nukirptaEilute);
    }

    public static void compareTwoStrings(String pirmasZodis, String antrasZodis) {
        //tikrinama ar eilutes lygios
        if (pirmasZodis.equalsIgnoreCase(antrasZodis)) {
            System.out.println("Zodziai yra lygus!");
        } else {
            System.out.println("Zodziai yra skirtingi");
        }
    }

    public static void printSymbolCount(String eilute) {
        System.out.println("Printing string symbol count: " + eilute);

        int lettersCount = 0;
        int spacesCount = 0;
        int numbers = 0;
        int otherSymbolsCount = 0;

        for (int skaicius = 0; skaicius < eilute.length(); skaicius++) {
            String vienasSimbolis = eilute.substring(skaicius, skaicius + 1);

            if (vienasSimbolis.matches("[a-zA-Z]")) {
                lettersCount++;
                continue;
            }

            if (vienasSimbolis.matches(" ")) {
                spacesCount++;
                continue;
            }
            if (vienasSimbolis.matches("[0-9]")) {
                numbers++;
                continue;
            }
            otherSymbolsCount++;
        }
        System.out.println("Eilute turi - " + lettersCount + " raidziu/raides.");
        System.out.println("Eilute turi - " + spacesCount + " tarpelius/tarpeli.");
        System.out.println("Eilute turi - " + numbers + " skaicius/skaiciu.");
        System.out.println("Eilute turi - " + otherSymbolsCount + " kitu simboliu.");

    }

}
