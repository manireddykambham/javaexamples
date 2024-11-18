package ArrayExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySum {
    public static int ArraySum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    public static String[] StrToArray(String str) {
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }
        return arr;
    }
    public static String[] SortArray(String[] str) {
        Arrays.sort(str);
        return str;
    }
    public static int AvgOfArray(int[] str) {
        int avg,sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += str[i];
        }
        avg = sum / str.length;
        return avg;
    }
    public static int LowestOfArray(int[] str) {
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (str[i] < lowest) {
                lowest = str[i];
            }
        }
        return lowest;
    }
    public static int HighestOfArray(int[] str) {
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (str[i] > highest) {
                highest = str[i];
            }
        }
        return highest;
    }
    public static ArrayList<String> ListOfArray(String[] str) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            arr.add(str[i]);
        }
        return arr;
    }
}
