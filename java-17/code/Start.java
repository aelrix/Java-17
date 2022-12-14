class Start{
    public static void main(String[] data){
        //int[] a = { 71, 80, 72, 38, 45, 63, 12, 80, 99 };
        int[] a = new int[1000000];
	for (int i = 0; i < a.length; i++)
		a[i] = (int)(Math.random() * 1000000);
	Engine engine = new Engine();
	engine.sort(a);
	boolean flag = true;
	for (int i = 0; i < a.length - 1; i++) {
		if (a[i] > a[i+1]) {
			flag = false;
		}
	}
	System.out.println(flag);
    }
}

class Engine {
	void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}
	void sort(int[] a, int left, int right) {
		if (left >= right) return;  // only one element
		int p = partition(a, left, right);
		sort(a, left, p - 1);
		sort(a, p + 1, right);
	}
	int partition(int[] a, int left, int right) {
		int pivot = a[left];
		int i = left + 1;    // skip the pivot
		int j = right;
		while (i <= j) {
			while (i <= j && a[i] <= pivot) i++;
			while (i <= j && a[j] >= pivot) j--;
			if (i <= j) {
				int t = a[i];   // interchange a[i] and a[j]
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[left];   // interchange a[left] and a[j]
		a[left] = a[j];
		a[j] = t;
		return j;
	}
}
// first version is use the left-most element be the pivot
// the better version is to random, to prevent the worst-case
//         i ------>               <-------- j
