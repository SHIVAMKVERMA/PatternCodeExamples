import java.util.*;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to create pattern: ");

		int row = sc.nextInt();


		for (int i =1 ; i <= row; i++) {
			for (int j=1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}

/*
For below pattern we have this program.
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

*/