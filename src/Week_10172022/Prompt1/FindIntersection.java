package Week_10172022.Prompt1;

import java.util.LinkedList;

public class FindIntersection
{
    public static int getIntersection(LinkedList<Integer> A, LinkedList<Integer> B)
    {
        int aSize = A.size();
        int bSize = B.size();

        for (int i = 0; i < aSize; i++)
        {
            for (int j = 0; j < bSize; j++)
            {

                int currentNode = A.get(i);
                if (currentNode == B.get(j))
                {

                    return currentNode;
                }
            }
        }
        throw new RuntimeException("No intersection found");
    }
}
