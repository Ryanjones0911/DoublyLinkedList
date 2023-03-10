public class DoublyLinkedList<T> implements AssignmentRequirements<T>
{
    //first node of the list
    Node<T> head;

    //defines what a node is
    private static class Node<T>
    {
        T data;
        Node<T> next;
        @SuppressWarnings("unused")
        Node<T> prev;

        //constructor
        Node()
        {

        }
        Node(T data)
        {
            //assigns given int to the data value of the current node
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //adds to the end of the list
    public void Add(T data)
    {
        //create a new node
        Node<T> newNode = new Node<T>(data);
        
        //if the list is empty, make the new node the head of the list
        if(head == null)
        {
            head = newNode;
        }

        //otherwise if we are not at the end of the list, get there and add the new node to the end
        else
        {
            Node<T> current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    //removes the head of the list
    public void Remove()
    {
        if(head != null)
        {
            System.out.println("Removing head...");
            head = head.next;
        }
        else
        {
            throw new IllegalArgumentException("Cannot remove the head of an empty list");
        }
    }

    //removes element at a given index from the list
    public void Remove(int x)
    {
        int count = 0;
        Node<T> current = head;

        //throws exception if given x is out of range 
        if(x > Size() || x < 0)
        {
            throw new IllegalArgumentException("Given index is out of range");
        }
        System.out.println("Removing list node at position " + x);

        while (current != null) 
        {
            if (count == x - 1) 
            {
                current.next = current.next.next;
            }
            current = current.next;
            count++;
        }
    }

    //removes all elements of a list
    public void Clear()
    {
        if(head == null)
        {
            throw new IllegalArgumentException("Cannot clear an empty list");
        }
        while(head.next != null)
        {
            head.prev = null;
            head = head.next;
        }
        head = null;
    }

    //returns number of elements in list
    public int Size()
    {
        Node<T> iterate = new Node<>();
        int count = 0;
        iterate = head;
        while(iterate != null)
        {
            iterate = iterate.next;
            count++;
        }
        return count;
    }

    //gets head of the list without removing it
    public T GetHead()
    {
        if(head == null)
        {
            throw new IllegalArgumentException("Cannot retrieve head of empty list");
        }
        System.out.println("Head of the list: ");
        return head.data;
    }

    //gets element at given position
    public T GetElement(int x)
    {
        Node<T> current = head;
        int count = 0;

        if(x > Size() || x < 0)
        {
            throw new IllegalArgumentException("Given index is out of range");
        }
        while(count != x)
        {
            current = current.next;
            count++;
        }
        return current.data;
    }

    public void Print()
    {
        Node<T> temp = head;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        if(head == null)
        {
            System.out.println("The list is empty");
        }
    }

    //sets element at given position to given value
    public void Set(int x, T t)
    {
        Node<T> current = head;
        int count = 0;

        if(x > Size() || x < 0)
        {
            throw new IllegalArgumentException("Given index is out of range");
        }
        while(count != x)
        {
            current = current.next;
            count++;
        }
        current.data = t;
    }

    //returns array of elements in list
    public T[] ToArray()
    {
        int size = Size();
        Node<T> current = head;
        @SuppressWarnings("unchecked")
        T[]array = (T[])new Object[size];

        int i = 0;
        while (current != null)
        {
            array[i] = current.data;
            current = current.next;
            i++;
        }
        return array;
    }
}
