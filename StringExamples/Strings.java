package StringExamples;

public class Strings {
    public static String ReverseString(String str) {
        String reversed = "";
        /*for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }*/
        for (int i = 0; i <str.length(); i++) {
            reversed = str.charAt(i)+reversed;
        }
        return reversed;

    }
}
