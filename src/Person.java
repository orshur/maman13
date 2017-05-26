/**
 * represents a person, persons are comparable by year of birth
 */
public class Person implements Comparable<Person>
{
    private String _name;
    private String _id;
    private int    _yearOfBirth;

    public Person(String name, String id, int yearOfBirth)
    {
        _name = name;
        _id = id;
        _yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString()
    {
        return "name: " + _name + ", id: " + _id + ", year of birth: " + String.valueOf(_yearOfBirth);
    }

    @Override
    public int compareTo(Person o)
    {
        if (o == null)
        {
            throw new NullPointerException();
        }

        Person other = (Person)o;
        if (_yearOfBirth < other._yearOfBirth)
        {
            return -1;
        }
        if (_yearOfBirth > other._yearOfBirth)
        {
            return 1;
        }

        return 0;
    }
}
