public class Mountain {
    private int[] array;
    public Mountain(int[] array) {
        this.array = array;
    }
    public static boolean isIncreasing(int[] array, int stop) {
        for (int i = 0; i < stop; i++) {
            if (array[i] >= array[i+1]) return false;
        }

        return true;
    }
    public static boolean isDecreasing(int[] array, int start) {
        for (int i = start; i < array.length-1; i++) {
            if (array[i] <= array[i+1]) return false;
        }

        return true;
    }

    public static int getPeakIndex(int[] array) {
        int max = 0;
        int i2 = 0;

        for (int i = 1; i < array.length-1; i++) {
            if (array[i] > max) {
                max = array[i];
                i2 = i;
            }
        }

        if (array[i2] > array[i2-1] && array[i2] > array[i2+1]) return i2;

        return -1;
    }
    public static boolean isMountain(int[] array) {
        int x = getPeakIndex(array);

        if (x == -1) return false;
        if (isIncreasing(array, x) && isDecreasing(array, x)) return true;
        return false;
    }
}
