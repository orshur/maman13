import java.util.Iterator;

/**
 * Created by or on 24/05/17.
 */
public class Reducer
{
    public static<T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x)
    {
        SortedGroup<T> reducedGroup = new SortedGroup<>();
        for (T currItem : sGroup)
        {
            if (currItem.compareTo(x) >= 0) //currItem >= x, break since sGroup is sorted
            {
                break;
            }

            reducedGroup.Add(currItem);
        }

        return reducedGroup;
    }
}
