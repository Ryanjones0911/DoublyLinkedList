import java.util.Arrays;

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
            System.out.println("DoublyLinkedList (integers):");
            list.Print();
            
            //remove
            list.Remove();
            list.Print();

            //removes element at a given index from the list
            list.Remove(1);
            list.Print();

            //returns number of elements in list
            System.out.println("The size of this list is " + list.Size());

            //gets head of the list without removing it
            System.out.println(list.GetHead());

            //gets element at given position
            System.out.println("The element at position 2 is " + list.GetElement(2));

            //sets element at given position to given value
            list.Set(1, 9);
            System.out.println("The element at position 1 is now nine");
            list.Print();

            //to array(list lmao)
            System.out.println("As an array: " + Arrays.toString(list.ToArray()));

            //removes all elements of a list
            list.Clear();
            list.Print();



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
            System.out.println("DoublyLinkedList (strings):");
            list2.Print();
            
            //remove
            list2.Remove();
            list2.Print();

            //removes element at a given index from the list
            list2.Remove(1);
            list2.Print();

            //returns number of elements in list
            System.out.println("The size of this list is " + list2.Size());

            //gets head of the list without removing it
            System.out.println(list2.GetHead());

            //gets element at given position
            System.out.println("The element at position 2 is " + list2.GetElement(2));

            //sets element at given position to given value
            list2.Set(1, "switched");
            System.out.println("The element at position 1 is now \"switched\"");
            list2.Print();

            //to array(list lmao)
            System.out.println("As an array: " + Arrays.toString(list2.ToArray()));

            //removes all elements of a list
            list2.Clear();
            list2.Print();


            //object "Animal"
            Animal dog = new Animal("max", 3);
            Animal cat = new Animal("charlie", 5);
            Animal horse = new Animal("gerard", 8);
            Animal capybara = new Animal("louise", 5);
            Animal shrew = new Animal("bob", 6);
            Animal frog = new Animal("tina", 4);
            Animal ant = new Animal("linda", 8);
            Animal whale = new Animal("frond", 35);
            Animal shark = new Animal("jimmy", 13);
            Animal komodo = new Animal("gene", 16);

            DoublyLinkedList<Animal> list3 = new DoublyLinkedList<>();

            list3.Add(dog);
            list3.Add(cat);
            list3.Add(horse);
            list3.Add(capybara);
            list3.Add(shrew);
            list3.Add(frog);
            list3.Add(ant);
            list3.Add(whale);
            list3.Add(shark);
            list3.Add(komodo);


            System.out.println("DoublyLinkedList (objects):");
            list3.Print();
            
            //remove
            list3.Remove();
            list3.Print();

            //removes element at a given index from the list
            list3.Remove(1);
            list3.Print();

            //returns number of elements in list
            System.out.println("The size of this list is " + list3.Size());

            //gets head of the list without removing it
            System.out.println(list3.GetHead());

            //gets element at given position
            System.out.println("The element at position 2 is " + list3.GetElement(2));

            //sets element at given position to given value
            list3.Set(1, whale);
            System.out.println("The element at position 1 is now \"switched\"");
            list3.Print();

            //to array
            System.out.println("As an array: " + Arrays.toString(list3.ToArray()));

            //removes all elements of a list
            list3.Clear();
            list3.Print();
    }
}