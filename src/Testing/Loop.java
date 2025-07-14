package Testing;


public class Loop {
	public static void main(String[] args) {
		System.out.print("Even Numbers : ");
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print("Odd Numbers : ");
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print("Even Numbers using while loop :");
		int i=1;
		while(i<=10){
			
			if(i%2==0){
				System.out.print(i+" ");	
			}
			i++;
		}
		System.out.println();
		System.out.print("Odd Numbers using while loop :");
		int j=1;
		while(j<=10){
			if(j%2!=0) {
				System.out.print(j+" ");
			}
			j++;
		}
		
	}
}
