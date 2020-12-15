package kartuves;


public class test {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};
        char[] b = {'*', '*', '*'};

        System.out.println(changeWordPattern('b', a, b));
    }

    private static char[] changeWordPattern(char userInput, char[] word, char[] wordPattern) {
        for (int i = 0; i < word.length; i++) {
            if (userInput == word[i]) {
                wordPattern[i] = userInput;
            }
        }
        return wordPattern;
    }
}
