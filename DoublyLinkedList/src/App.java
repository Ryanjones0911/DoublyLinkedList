public class App 
{
    public static void main(String[] args) throws Exception 
    {
           DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
           
           //add
            list.Add(1);
            list.Add(2);
            list.Add(3);
            list.Add(4);
            list.Add(5);
            System.out.println("DoublyLinkedList:");
            list.PrintList(list);
            
            //remove
            list.Remove();
            list.PrintList(list);

            //removes element at a given index from the list
            list.Remove(1);
            list.PrintList(list);

            //returns number of elements in list
            int size = list.Size();
            System.out.println("The size of this list is " + size);

            //gets head of the list without removing it
            int head = list.GetHead();
            System.out.println(head);

            //gets element at given position
            int spot2 = list.GetElement(2);
            System.out.println("The element at position 2 is " + spot2);

            //sets element at given position to given value
            list.Set(1, 9);
            System.out.println("The element at position 1 is now nine");
            list.PrintList(list);


            //removes all elements of a list
            list.Clear();
    }
}

