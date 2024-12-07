package trigger;

import ArrayExamples.ArraySum;
import StringExamples.Strings;
import arthmetics.PositiveOrNegative;
import arthmetics.SquareRoot;
import constants.Levels;
import leetcode01.Solution;
import leetcode01.TwoSum;

import java.util.Arrays;

import static arthmetics.AdditionClass.addition;
import static arthmetics.DivisionClass.divide;
import static arthmetics.MultiplicationClass.multiply;
import static arthmetics.PositiveOrNegative.PositiveNegative;
import static arthmetics.SubstractionClass.substraction;

public class TriggerClass {
    public static void trigger() {
        int[] basicArray = {3,2,4};
        int target = 6;
        int[] array = {31, 21, 53, 24, 15, 86, 57, 18, 39, 10};
        String str = "hello";
        String[] arrstr = {"hello", "world", "BMW", "Audi"};
        int a = 2;
        int b = 3;
        int c = 4;
        System.out.println(addition(a, b));
        System.out.println(addition(a, b, c));
        System.out.println(substraction(a, b));
        System.out.println(substraction(a, b, c));
        System.out.println("Multiplication of two numbers "+multiply(a, b));
        System.out.println("Multiplication of three numbers "+multiply(a, c, b));
        System.out.println("Division of two numbers "+divide(a, b));
        System.out.println("reverse of string "+Strings.ReverseString(str));
        System.out.println("sum of array "+ArraySum.ArraySum(array));
        System.out.println("String to array "+Arrays.toString(ArraySum.StrToArray(str)));
        System.out.println("Sort of array "+Arrays.toString(ArraySum.SortArray(arrstr)));
        System.out.println("Avg of array "+ArraySum.AvgOfArray(array));
        System.out.println("Lowest number in arraty "+ArraySum.LowestOfArray(array));
        System.out.println("Highest number in array "+ArraySum.HighestOfArray(array));
        System.out.println("Array List "+ArraySum.ListOfArray(arrstr));
        System.out.println("square root of "+SquareRoot.Root(a));
        System.out.println("random number "+Math.random());
        for(Levels i : Levels.values()){
            System.out.println("Levels "+ i);
        }
        PositiveNegative(a);
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(basicArray, target)));

    }
}
