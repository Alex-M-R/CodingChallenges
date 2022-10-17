package Week_10172022.Prompt1;

import java.util.LinkedList;

public class FindIntersection
{
    public static int getIntersection(LinkedList<Integer> firstList, LinkedList<Integer> secondList)
    {
        for (int i = 0; i < firstList.size(); i++)
        {
            for (int j = 0; j < secondList.size(); j++)
            {
                if (firstList.get(i) == secondList.get(j))
                {
                    return firstList.get(i);
                }
            }
        }
        throw new RuntimeException("No intersection found");
    }
}
