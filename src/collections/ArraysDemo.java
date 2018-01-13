package collections;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[] = new int[10];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		a[7] = 80;
		a[8] = 90;
		a[9] = 100;
		int size = a.length;
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		Object obj[] = new Object[6];
		obj[0] = "Avnish";
		obj[1] = 123;
		obj[2] = "avnish123";
		obj[3] = 'A';
		obj[4] = "Java";
		obj[5] = 456;
		int size1 = obj.length;
		for (int j = 0; j < size1; j++) {
			System.out.println(obj[j]);
		}

	}
}