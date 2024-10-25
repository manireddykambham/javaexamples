package trigger;

import ArrayExamples.ArraySum;
import StringExamples.Strings;

import static arthmetics.AdditionClass.addition;
import static arthmetics.DivisionClass.divide;
import static arthmetics.MultiplicationClass.multiply;
import static arthmetics.SubstractionClass.substraction;

public class TriggerClass {
    public static void trigger() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String str = "hello";
        int a = 2;
        int b = 3;
        int c = 4;
        System.out.println(addition(a, b));
        System.out.println(addition(a, b, c));
        System.out.println(substraction(a, b));
        System.out.println(substraction(a, b, c));
        System.out.println(multiply(a, b));
        System.out.println(multiply(a, c, b));
        System.out.println(divide(a, b));
        System.out.println(Strings.ReverseString(str));
        System.out.println(ArraySum.ArraySum(array));
        System.out.println(ArraySum.StrToArray(str));
    }
}
