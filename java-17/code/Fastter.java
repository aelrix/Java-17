class Fastter {
    public static void main (String[] data){
         int[] a = { 71, 80, 72, 38, 45, 63, 12, 80, 99 };
         Engine engine = new Engine();
         engine.partition(a, 0, a.length - 1);
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
         }
    }
}

class Engine {
    int partition(int[] a, int left, int right){
        int pivot = a[left];
        int i = left + 1;   // skip the pivot
        int j = right;
        while (i <= j) {
            while (i <= j && a[i] <= pivot) i++;
            while (i <= j && a[j] >= pivot) j--;
            if (i <= j) {
                int t = a[i]; // interchange a[i] and a[j]
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[left];  // interchange a[left] and a[j]
        a[left] = a[j];
        a[j] = t;
        return j;
    }
}

        // first version is use the left-most element be the pivot
        // the better version is to random, to prevent the worst-case


