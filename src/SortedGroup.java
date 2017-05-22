import java.util.ArrayList;

/**
 * Created by or on 22/05/17.
 */
public class SortedGroup<T extends Comparable<T>>
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
        while (element.compareTo(_elements.get(insertInd)) < 0)
        {
            insertInd++;
        }

        _elements.add(insertInd, element);
    }

}
