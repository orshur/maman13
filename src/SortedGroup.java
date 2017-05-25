import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by or on 22/05/17.
 */
public class SortedGroup<T extends Comparable<T>> implements Iterable<T>
{
    private ArrayList<T> _elements;

    public SortedGroup()
    {
        _elements = new ArrayList<T>();
    }

    void Add(T element)
    {
        if (_elements.size() == 0)
        {
            _elements.add(element);
            return;
        }

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

    int Remove(T element)
    {
        int removed = 0;
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
