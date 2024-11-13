import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Тестирование binarySearch для byte[]
        byte[] byteArr = {1, 3, 5, 7, 9};
        System.out.println("binarySearch(byteArr, 3): " + Arrays.binarySearch(byteArr, (byte) 3)); // 1
        System.out.println("binarySearch(byteArr, 2): " + Arrays.binarySearch(byteArr, (byte) 2)); // -2
        System.out.println("binarySearch(byteArr, 1, 4, 5): " + Arrays.binarySearch(byteArr, 1, 4, (byte) 5)); // 2
        System.out.println("binarySearch(byteArr, 1, 4, 4): " + Arrays.binarySearch(byteArr, 1, 4, (byte) 4)); // -3

        // Тестирование binarySearch для char[]
        char[] charArr = {'a', 'c', 'e', 'g', 'i'};
        System.out.println("binarySearch(charArr, 'c'): " + Arrays.binarySearch(charArr, 'c')); // 1
        System.out.println("binarySearch(charArr, 'b'): " + Arrays.binarySearch(charArr, 'b')); // -2
        System.out.println("binarySearch(charArr, 1, 4, 'e'): " + Arrays.binarySearch(charArr, 1, 4, 'e')); // 2
        System.out.println("binarySearch(charArr, 1, 4, 'd'): " + Arrays.binarySearch(charArr, 1, 4, 'd')); // -3

        // Тестирование binarySearch для double[]
        double[] doubleArr = {1.0, 3.5, 5.2, 7.8, 9.1};
        System.out.println("binarySearch(doubleArr, 3.5): " + Arrays.binarySearch(doubleArr, 3.5)); // 1
        System.out.println("binarySearch(doubleArr, 2.0): " + Arrays.binarySearch(doubleArr, 2.0)); // -2
        System.out.println("binarySearch(doubleArr, 1, 4, 5.2): " + Arrays.binarySearch(doubleArr, 1, 4, 5.2)); // 2
        System.out.println("binarySearch(doubleArr, 1, 4, 4.0): " + Arrays.binarySearch(doubleArr, 1, 4, 4.0)); // -3

        // Тестирование binarySearch для float[]
        float[] floatArr = {1.0f, 3.5f, 5.2f, 7.8f, 9.1f};
        System.out.println("binarySearch(floatArr, 3.5f): " + Arrays.binarySearch(floatArr, 3.5f)); // 1
        System.out.println("binarySearch(floatArr, 2.0f): " + Arrays.binarySearch(floatArr, 2.0f)); // -2
        System.out.println("binarySearch(floatArr, 1, 4, 5.2f): " + Arrays.binarySearch(floatArr, 1, 4, 5.2f)); // 2
        System.out.println("binarySearch(floatArr, 1, 4, 4.0f): " + Arrays.binarySearch(floatArr, 1, 4, 4.0f)); // -3

        // Тестирование binarySearch для int[]
        int[] intArr = {1, 3, 5, 7, 9};
        System.out.println("binarySearch(intArr, 3): " + Arrays.binarySearch(intArr, 3)); // 1
        System.out.println("binarySearch(intArr, 2): " + Arrays.binarySearch(intArr, 2)); // -2
        System.out.println("binarySearch(intArr, 1, 4, 5): " + Arrays.binarySearch(intArr, 1, 4, 5)); // 2
        System.out.println("binarySearch(intArr, 1, 4, 4): " + Arrays.binarySearch(intArr, 1, 4, 4)); // -3

        // Тестирование binarySearch для long[]
        long[] longArr = {1L, 3L, 5L, 7L, 9L};
        System.out.println("binarySearch(longArr, 3L): " + Arrays.binarySearch(longArr, 3L)); // 1
        System.out.println("binarySearch(longArr, 2L): " + Arrays.binarySearch(longArr, 2L)); // -2
        System.out.println("binarySearch(longArr, 1, 4, 5L): " + Arrays.binarySearch(longArr, 1, 4, 5L)); // 2
        System.out.println("binarySearch(longArr, 1, 4, 4L): " + Arrays.binarySearch(longArr, 1, 4, 4L)); // -3

        // Тестирование binarySearch для short[]
        short[] shortArr = {1, 3, 5, 7, 9};
        System.out.println("binarySearch(shortArr, (short) 3): " + Arrays.binarySearch(shortArr, (short) 3)); // 1
        System.out.println("binarySearch(shortArr, (short) 2): " + Arrays.binarySearch(shortArr, (short) 2)); // -2
        System.out.println("binarySearch(shortArr, 1, 4, (short) 5): " + Arrays.binarySearch(shortArr, 1, 4, (short) 5)); // 2
        System.out.println("binarySearch(shortArr, 1, 4, (short) 4): " + Arrays.binarySearch(shortArr, 1, 4, (short) 4)); // -3

        // Тестирование binarySearch для T[] с Comparator
        Integer[] intArr2 = {1, 3, 5, 7, 9};
        Comparator<Integer> comparator = Comparator.naturalOrder();
        System.out.println("binarySearch(intArr2, 3, comparator): " + Arrays.binarySearch(intArr2, 3, comparator)); // 1
        System.out.println("binarySearch(intArr2, 2, comparator): " + Arrays.binarySearch(intArr2, 2, comparator)); // -2
        System.out.println("binarySearch(intArr2, 1, 4, 5, comparator): " + Arrays.binarySearch(intArr2, 1, 4, 5, comparator)); // 2
        System.out.println("binarySearch(intArr2, 1, 4, 4, comparator): " + Arrays.binarySearch(intArr2, 1, 4, 4, comparator)); // -3

        // Тестирование binarySearch для List
        ArrayList<Integer> intList = new ArrayList<>(java.util.Arrays.asList(1, 3, 5, 7, 9));
        System.out.println("binarySearch(intList, 3): " + Collections.binarySearch(intList, 3)); // 1
        System.out.println("binarySearch(intList, 2): " + Collections.binarySearch(intList, 2)); // -2

        // Тестирование binarySearch для List с Comparator
        ArrayList<String> stringList = new ArrayList<>(java.util.Arrays.asList("apple", "banana", "cherry"));
        Comparator<String> comparator2 = Comparator.naturalOrder();
        System.out.println("binarySearch(stringList, \"banana\", comparator2): " + Collections.binarySearch(stringList, "banana", comparator2)); // 1
        System.out.println("binarySearch(stringList, \"grape\", comparator2): " + Collections.binarySearch(stringList, "grape", comparator2)); // -4
    }
}

