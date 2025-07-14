package Testing;

public class DoWhile {

	public static void main(String[] args) {
		int i=1;
		System.out.print("Even Numbers : ");
		do {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		} while (i<=10);
		System.out.println();
		System.out.print("Odd Numbers : ");
		int j=1;
		do {
			if(j%2!=0) {
			System.out.print(j+" ");
			}
			j++;
		}while(j<=10);
	}

}
