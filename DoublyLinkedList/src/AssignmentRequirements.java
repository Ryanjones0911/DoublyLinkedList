public interface AssignmentRequirements<T> 
{

    //adds to the end of the list
    void Add(T data);

    //removes the head of the list
    void Remove();

    //removes element at a given index from the list
    void Remove(int x);

    //removes all elements of a list
    void Clear();

    //returns number of elements in list
    int Size();

    //returns array of elements in list
    T[] ToArray();

    //gets head of the list without removing it
    T GetHead();

    //gets element at given position
    T GetElement(int x);

    //sets element at given position to given value
    void Set(int x, T t);
}