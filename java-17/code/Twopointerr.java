public class Twopointerr {
   public static void main(String[] data){
        // given array of integer, write code fragement
        // to reverse only even values
        int[] a = { 8, 5, 4, 7, 2, 3, 6, 4 };
        int left = 0;
        int right = a.length -1;
        while (true) {
            if (left > right) break; //two pointer //caterpillar_method
            if (a[left] % 2 == 0 && a[right] % 2 == 0) { 
                int x = a[left];
                int y = a[right];
                a[left] = y;
                a[right] = x;
                left++; right--;
                continue;
            } // e e
            if (a[left] % 2 != 0 && a[right] % 2 == 0) { left++; continue; } // o e 
            if (a[left] % 2 == 0 && a[right] % 2 != 0) {right--; continue; } // e o
            if (a[left] % 2 != 0 && a[right] % 2 != 0) { left++; right--; } // o o
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
 
