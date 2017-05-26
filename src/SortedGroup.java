import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class to represent a sorted group of generic comparable type T
 * group elements are sorted from smallest to largest (determined by T's compareTo method)
 */
public class SortedGroup<T extends Comparable<T>> implements Iterable<T>
{
    private ArrayList<T> _elements;

    /**
     * Create an empty group
     */
    public SortedGroup()
    {
        _elements = new ArrayList<T>();
    }

    /**
     * add element to group
     */
    void Add(T element)
    {
        if (_elements.size() == 0)
        {
            _elements.add(element);
            return;
        }

        //find the correct place to insert element (preserve sorting)
        int insertInd = 0;
        while (element.compareTo(_elements.get(insertInd)) > 0)
        {
            insertInd++;
            if (insertInd == _elements.size()) //reached list end
            {
                break;
            }
        }

        _elements.add(insertInd, element);
    }

    /**
     * remove element from group
     */
    int Remove(T element)
    {
        int removed = 0;
        //remove all instances of element from group
        while (_elements.remove(element))
        {
            removed++;
        }

        return removed;
    }

    @Override
    public Iterator<T> iterator()
    {
        return _elements.iterator();
    }
}
