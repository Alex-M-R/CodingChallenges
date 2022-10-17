package Week_10172022.Prompt1;

public class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        next = null;
    }

    public static Node getIntersection(Node A, Node B)
    {

        if (A == null || B == null)
            return null;

        Node a = A;
        Node b = B;

        while (a != b)
        {
            a = a == null? B : a.next;
            b = b == null? A : b.next;
        }
        return a;
    }
}
