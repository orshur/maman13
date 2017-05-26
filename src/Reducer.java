/**
 * utility class, reduces an input sorted group
 */
public class Reducer
{

    /**
     * return a new SortedGroup containing elements < x
     */
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
