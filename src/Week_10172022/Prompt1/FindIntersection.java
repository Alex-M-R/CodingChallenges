package Week_10172022.Prompt1;

import java.util.LinkedList;

public class FindIntersection
{
    public static int getIntersection(LinkedList<Integer> A, LinkedList<Integer> B)
    {
        for (Integer a : A)
        {
            for(Integer b : B)
            {
                if (a == b)
                    return a;
            }
        }
        throw new RuntimeException("No intersection found");
    }
}
