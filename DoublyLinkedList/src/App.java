import java.util.Arrays;

//This update was pushed from WSL Ubuntu. Just doing this to make sure it works

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
            System.out.println("As an array: " + Arrays.toString(list.ToArray()));

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
            System.out.println("As an array: " + Arrays.toString(list2.ToArray()));

            //removes all elements of a list
            list2.Clear();
            list2.PrintList(list2);


            //object "Animal"
            Animal dog = new Animal("max", 3);
            Animal cat = new Animal("charlie", 5);
            Animal horse = new Animal("gerard", 8);
            Animal capybara = new Animal("louise", 5);
            Animal shrew = new Animal("bob", 6);

            DoublyLinkedList<Animal> list3 = new DoublyLinkedList<>();

            list3.Add(dog);
            list3.Add(cat);
            list3.Add(horse);
            list3.Add(capybara);
            list3.Add(shrew);


            System.out.println("DoublyLinkedList:");
            list3.PrintList(list3);
            
            //remove
            list3.Remove();
            list3.PrintList(list3);

            //removes element at a given index from the list
            list3.Remove(1);
            list3.PrintList(list3);

            //returns number of elements in list
            System.out.println("The size of this list is " + list3.Size());

            //gets head of the list without removing it
            System.out.println(list3.GetHead());

            //gets element at given position
            System.out.println("The element at position 2 is " + list3.GetElement(2));

            //sets element at given position to given value
            //list3.Set(1, "switched");
            System.out.println("The element at position 1 is now \"switched\"");
            list3.PrintList(list3);

            //to array(list lmao)
            System.out.println("As an array: " + Arrays.toString(list3.ToArray()));

            //removes all elements of a list
            list3.Clear();
            list3.PrintList(list3);
    }
}