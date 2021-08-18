import java.util.Arrays;

public class MyArrays {


    public static void main(String[] args) {
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                positive = positive + 1;
            else if (array[i] < 0)
                negative = negative + 1;
        }
        int[] positiveArray = new int[positive];
        int[] negativeArray = new int[negative];

        int p, p1, n, n1;
        for (p = 0, p1 = 0, n = 0, n1 = 0; p < array.length; p++, n++) {
            if (array[p] > 0) {
                positiveArray[p1] = array[p];
                p1++;
            } else if (array[n] < 0) {
                negativeArray[n1] = array[n];
                n1++;
            }
        }
        int[] array1 = new int[array.length];
        System.arraycopy(array, 0, array1, 0, array.length);
        java.util.Arrays.sort(array1);
        int d = array1[0];
        int d1 = -1;
        for (int j : array1) {
            if (j == d) {
                d1++;
                continue;
            } else if (d1 > 1) {
                System.out.printf("Elementul %d apare %d ori.\n", d, d1);
            }
            d1 = 1;
            d = j;
        }
        System.out.println("Sirul de elemente pozitive:" + java.util.Arrays.toString(positiveArray));
        System.out.println("Sirul de elemente negative:" + java.util.Arrays.toString(negativeArray));
    }
}

