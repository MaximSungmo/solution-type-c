package problem04;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		

		int size=18;
		int result;
		int randResult;
		int[] arr = new int[size];
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		long[] timeCheck = new long[size];
		int count=0;
		int correct =0;
		int ncorrect=0;
		Random r=new Random();
		
		



		
		for(int i =1;i<10;i++) {
			for(int j=1; j<3; j++) {
				randResult = r.nextInt(8)+1;
				System.out.print(i+"x"+randResult+", ");
				arr1[count]=i;
				arr2[count]=randResult;
				arr[count]=i*randResult;
				count++;
			}
			System.out.println();
		  }		
		Scanner sc = new Scanner(System.in);

		int rand1;
		count =0;
		for(int i=0;i<size;i++) {
			rand1= r.nextInt(8)+1;
			count++;
			System.out.print(count+". "+arr1[rand1]+"x"+arr2[rand1]);
			long start = System.currentTimeMillis();

			int jungdap = sc.nextInt();
			long end = System.currentTimeMillis();
			timeCheck[rand1]=(long) ((end-start)/100.0);
			System.out.println(timeCheck[rand1]);

			if(arr[rand1]==jungdap) {
				correct++;
			}else {
				ncorrect++;
			}
		}	
		
		System.out.print("성공횟수"+correct+"실패횟수"+ncorrect);
		
		 
		
	}
}