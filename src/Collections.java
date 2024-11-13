import java.util.Comparator;
import java.util.List;

class Collections {

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return binarySearch(list, key, null);
    }


    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        if (c == null) {
            if (!(key instanceof Comparable)) {
                throw new ClassCastException();
            }
            return binarySearchComparableElement((List<? extends Comparable<? super T>>) list, key);
        } else {
            return binarySearchWithComparator(list, key, c);
        }
    }


    private static <T> int binarySearchComparableElement(List<? extends Comparable<? super T>> list, T key) {
        int low = 0;
        int high = list.size()-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable<? super T> midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    private static <T> int binarySearchWithComparator(List<? extends T> list, T key, Comparator<? super T> c) {
        int low = 0;
        int high = list.size()-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found
    }
}