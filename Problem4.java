import java.util.Scanner;

public class Problem4{
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Enter array length");
		int b[] = new int[scan.nextInt()];
		System.out.println("Enter the array elements");
		for(int i = 0; i <= b.length-1; i++){
			b[i] = scan.nextInt();
		}
		for(int i = 0; i <= b.length-1; i++){
			System.out.print(b[i] + " ");
		}
		System.out.println();
		int count = 0;
		for(int j = 0; j <= b.length-1; j++){
			for(int i = 0; i <= a.length-1; i++) {
				if(b[j]%a[i] == 0) {
					count = count + 1;
				}
			}
			for(int k = 0; k <= a.length-1; k++) {
				System.out.print(a[k] + ": " + count + ", ");
			}
		}
	}
}