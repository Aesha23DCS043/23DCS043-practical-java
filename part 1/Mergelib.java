public class Mergelib {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5 };
        int[] arr2 = { 2, 4, 6, 8 };

        int l1 = arr1.length;
        int l2 = arr2.length;
        int result = l1 + l2;

        int[] mergearray = new int[result];

        for (int i = 0; i < l1; i++) {
            mergearray[i] = arr1[i];
        }

        for (int i = 0; i < l2; i++) {
            mergearray[l1 + i] = arr2[i];
        }

        for (int num : mergearray) {
            System.out.print(num + " ");
        }
    }
}
