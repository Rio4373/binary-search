import java.util.Comparator;
import java.util.List;

public class Collections {

    // Метод бинарного поиска в списке с использованием естественного порядка
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        return binarySearch(list, key, Comparator.naturalOrder());
    }

    // Метод бинарного поиска в списке с компаратором
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;  // Искомый элемент в правой части
            } else if (cmp > 0) {
                high = mid - 1;  // Искомый элемент в левой части
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }
}
