
/**
 * Driver to test SortedGroup
 */
public class Tester
{
    public static void main(String[] args)
    {
        System.out.println("<----------Sorted group test---------->");
        Person babyBoomer = new Person("Bob", "3652365", 1950);
        Person genX = new Person("Alice", "035698741", 1974);
        Person genY = new Person("Jen", "95175365", 1990);
        Person genZ = new Person("Kay", "8484762", 2000);
        Person infant = new Person("Sam", "8412960", 2016);

        System.out.println("Creating an empty group");
        SortedGroup<Person> persons = new SortedGroup<>();

        System.out.println("~~add elements~~");
        persons.Add(genY);
        System.out.println("added " + genY);
        persons.Add(genX);
        System.out.println("added " + genX);
        persons.Add(genZ);
        System.out.println("added " + genZ);
        persons.Add(babyBoomer);
        System.out.println("added " + babyBoomer);
        persons.Add(infant);
        System.out.println("added " + infant);

        System.out.println("Persons in sorted group:");
        for (Person p : persons)
        {
            System.out.println(p);
        }

        System.out.println("~~remove elements~~");
        persons.Remove(genY);
        System.out.println("removed " + genY);
        persons.Remove(babyBoomer);
        System.out.println("removed " + babyBoomer);

        System.out.println("Persons in sorted group:");
        for (Person p : persons)
        {
            System.out.println(p);
        }

        System.out.println("~~reduce~~");

        SortedGroup<Person> reducedGroup =
                Reducer.reduce(persons, new Person("x", "0", 2000));

        System.out.println("Persons in original group:");
        for (Person p : persons)
        {
            System.out.println(p);
        }

        System.out.println("Persons in reduced group:");
        for (Person p : reducedGroup)
        {
            System.out.println(p);
        }
    }
}
