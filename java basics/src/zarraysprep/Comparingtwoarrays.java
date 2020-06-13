package zarraysprep;

public class Comparingtwoarrays {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30 };
		int b[] = { 10, 20, 30 };
		boolean equalornot = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					equalornot = false;
				}

			}

		} else {
			System.out.println("both are not equal");
		}

		if (equalornot) {
			System.out.println("both are equal");

		} else {
			System.out.println("both are not equal");
		}
	}

}
