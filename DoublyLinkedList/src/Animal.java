public class Animal {
    String name;
    int age;

    Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString() 
    {
        return name + ", " + age + " years old";
    }

}
