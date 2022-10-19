class Fast {
	public static void main(String[] data) {
//		 int[] a = { 71, 80, 72, 38, 45, 63, 12, 80, 99 };
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++)
			a[i] = (int)(Math.random() * 1000);
		Engine engine = new Engine();
		engine.sort(a);
		for (int i = 0; i < a.length; i++) System.out.println(a[i]);
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
		int pivot = a[left]; // random is better
		int T = left + 1;
		for (int R = left + 1; R <= right; R++) {
			if (a[R] < pivot) {
				int temporary = a[R]; // interchange a[R] and a[T]
				a[R] = a[T];
				a[T] = temporary;
				T++;
			}
		}
		int temporary = a[left]; // interchange a[left] and a[T-1]
		a[left] = a[T-1];
		a[T-1] = temporary;
		return T-1;
	}
	
}

