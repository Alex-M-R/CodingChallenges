package Week_11072022.Prompt1;
/*
Java:
A number is said to be Harshad if it's exactly divisible by the sum of its digits. Create a function that determines whether a number is a Harshad or not.

Examples

isHarshad(75) ➞ false
// 7 + 5 = 12
// 75 is not exactly divisible by 12

isHarshad(171) ➞ true
// 1 + 7 + 1 = 9
// 9 exactly divides 171

isHarshad(481) ➞ true
isHarshad(89) ➞ false
isHarshad(516) ➞ true
isHarshad(200) ➞ true

Notes
You are expected to solve this challenge via recursion.
 */
public class Prompt
{
    public static void main(String[] args)
    {
        System.out.println(Harshad.isHarshad(75));  // false
        System.out.println(Harshad.isHarshad(171)); // true
        System.out.println(Harshad.isHarshad(481)); // true
        System.out.println(Harshad.isHarshad(89));  // false
        System.out.println(Harshad.isHarshad(516)); // true
        System.out.println(Harshad.isHarshad(200)); // true
    }
}
