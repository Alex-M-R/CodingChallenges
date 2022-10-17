package Week_10172022.Prompt1;
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
        // 2 singly linked lists using Node
        // list A: 3, 7, 8, 10
        Node A = new Node(3);
        A.next = new Node(7);

        // list B: 99, 1, 8, 10
        Node B = new Node(99);
        B.next = new Node(1);

        // shared nodes
        Node newNode = new Node(8);
        A.next.next = newNode;
        B.next.next = newNode;

        newNode = new Node(10);
        A.next.next.next = newNode;
        B.next.next.next = newNode;

        Node intersection = Node.getIntersection(A, B);
        System.out.println("Intersection: " + intersection.data);
    }

}
