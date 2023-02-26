public class Animal {
    String name;
    int age;

    Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /***********************************************
     * When attempting to print the value of this  *
     * object to console, System.out.println has   *
     * no fitting method to call for it and so     *
     * defaults to the ToString method in          *
     * the Object class, which returns a class     *
     * name and a hex code reference to the object.*
     * We can overload this by providing our own   *
     * ToString method in order to get the output  *
     * we want.                                    *
     ***********************************************/
    public String toString() 
    {
        return name + ", " + age + " years old";
    }

}
