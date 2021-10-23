package face;

public class Test2 {
    public static void main(String[] args) {
        int[] a = {0, 2,0,2,4,5};
        int[] zeros = duplicateZeros(a);
        for (int i : zeros) {
            System.out.print(i+ " ");
        }
    }

    public static int[] duplicateZeros (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int k = arr.length-2; k >= i; k--)
                    arr[k+1] = arr[k];
                arr[i] = 0;
                i++;
            }
        }

        return arr;
    }
}
