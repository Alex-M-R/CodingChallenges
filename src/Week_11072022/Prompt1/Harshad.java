package Week_11072022.Prompt1;

public class Harshad
{
    public static boolean isHarshad(int num)
    {
        int sum = addDigitsRecursive(num);
        return num % sum == 0;
    }

    // not sure if this counts as meeting the "use recursion requirement"
    private static int addDigitsRecursive(int num)
    {
        if (num == 0)
            return 0;
        return (num % 10 + addDigitsRecursive(num / 10));
    }

    public static boolean isHarshadNoRecursion(int num)
    {
        int sum = 0;

        for (int t = num; t > 0; t /= 10)
            sum += t % 10;

        return num % sum == 0;
    }
}
