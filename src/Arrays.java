import java.util.Comparator;

public class Arrays {

    // Метод бинарного поиска в массиве byte
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Метод бинарного поиска в диапазоне массива byte
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;  // Находим середину
            byte midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;  // Искомый элемент в правой части
            } else if (midVal > key) {
                high = mid - 1;  // Искомый элемент в левой части
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }

    // Метод бинарного поиска в массиве char
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Метод бинарного поиска в диапазоне массива char
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }

    // Метод бинарного поиска в массиве double
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Метод бинарного поиска в диапазоне массива double
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }

    // Метод бинарного поиска в массиве float
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Метод бинарного поиска в диапазоне массива float
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }

    // Метод бинарного поиска в массиве int
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Метод бинарного поиска в диапазоне массива int
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }

    // Метод бинарного поиска в массиве long
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Метод бинарного поиска в диапазоне массива long
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }

    // Метод бинарного поиска в массиве short
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Метод бинарного поиска в диапазоне массива short
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }

    // Метод бинарного поиска в обобщенном массиве с компаратором
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    // Метод бинарного поиска в диапазоне обобщенного массива с компаратором
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }
}
