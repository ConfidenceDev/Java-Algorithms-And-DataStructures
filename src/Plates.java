import java.util.Scanner;

public class Plates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		if(T >= 1 && T <= 100) {
			for(int i = 1; i <= T; i++) {
				
				int N = scan.nextInt();
				int K = scan.nextInt();
				int P = scan.nextInt();
				int[] B = new int[P];
				
				for(int j = 0; j < N; j++) {
					
					for(int k = 0; k < K; k++) {
						
						//Set plate array
						B[k] = scan.nextInt();
					}
				}
				
				int count = plates(N, K, P, B);
				System.out.println("#" + i + ": " + count);
			}
		}
		scan.close();

	}

	static int plates(int N, int K, int P, int[] B) {
		int count = 0;
		if(K >= 1 && K <= 30) {
			if(P >= 1 && P <= (N * K)) {
				int i = 1;
				while(i <= P) {
					
					// Pick plates
					
				}
			}
		}
		
		return count;
	}
}
