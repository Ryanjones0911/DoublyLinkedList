

public class App 
{
    public static void main(String[] args) throws Exception 
    {
           DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

            list.Add(1);
            list.Add(2);
            list.Add(3);
            list.Add(4);
            list.Add(5);
            list.Add(6);
            list.Add(7);
            list.Add(8);
            list.Add(9);
            list.Add(10);
            System.out.println("DoublyLinkedList:");
            list.PrintList(list);
            
            //remove
            list.Remove();
            list.PrintList(list);

            //removes element at a given index from the list
            list.Remove(1);
            list.PrintList(list);

            //returns number of elements in list
            System.out.println("The size of this list is " + list.Size());

            //gets head of the list without removing it
            System.out.println(list.GetHead());

            //gets element at given position
            System.out.println("The element at position 2 is " + list.GetElement(2));

            //sets element at given position to given value
            list.Set(1, 9);
            System.out.println("The element at position 1 is now nine");
            list.PrintList(list);

            //to array(list lmao)
            System.out.println("As an array: " + list.ToArray());

            //removes all elements of a list
            list.Clear();
            list.PrintList(list);



            //Strings
            DoublyLinkedList<String> list2 = new DoublyLinkedList<>();

            list2.Add("This");
            list2.Add("is");
            list2.Add("a");
            list2.Add("doubly");
            list2.Add("linked");
            list2.Add("list");
            list2.Add("of");
            list2.Add("data");
            list2.Add("type");
            list2.Add("string");
            System.out.println("DoublyLinkedList:");
            list2.PrintList(list2);
            
            //remove
            list2.Remove();
            list2.PrintList(list2);

            //removes element at a given index from the list
            list2.Remove(1);
            list2.PrintList(list2);

            //returns number of elements in list
            System.out.println("The size of this list is " + list2.Size());

            //gets head of the list without removing it
            System.out.println(list2.GetHead());

            //gets element at given position
            System.out.println("The element at position 2 is " + list2.GetElement(2));

            //sets element at given position to given value
            list2.Set(1, "switched");
            System.out.println("The element at position 1 is now \"switched\"");
            list2.PrintList(list2);

            //to array(list lmao)
            System.out.println("As an array: " + list2.ToArray());

            //removes all elements of a list
            list2.Clear();
            list2.PrintList(list2);
    }
}

