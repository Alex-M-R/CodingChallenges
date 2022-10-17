package Week_10172022.Prompt1;


import java.util.LinkedList;

/*
1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.

For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, return the node with value 8.
In this example, assume nodes with the same value are the exact same node objects.

Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.
 */
public class Prompt
{
    public static void main(String[] args)
    {
        // 2 given linked lists
        LinkedList<Integer> firstList = new LinkedList();
        LinkedList<Integer> secondList = new LinkedList();

        firstList.add(3);
        firstList.add(7);
        firstList.add(8);
        firstList.add(10);

        secondList.add(99);
        secondList.add(1);
        secondList.add(8);
        secondList.add(10);

        System.out.println("Intersection: " + FindIntersection.getIntersection(firstList, secondList));
    }

}
