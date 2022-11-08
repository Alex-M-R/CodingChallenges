package Week_11072022.Prompt1;

public class Harshad
{
    public static boolean isHarshad(int num)
    {
        return num % addDigitsRecursive(num) == 0;
    }

    private static int addDigitsRecursive(int num)
    {
        return num == 0? 0 : (num % 10 + addDigitsRecursive(num / 10));
    }
}
