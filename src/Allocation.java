import java.util.Scanner;

class Allocation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		if(T >= 1 && T <= 100) {
			for(int i = 1; i <= T; i++) {
				
				int N = scan.nextInt();
				int B = scan.nextInt();
				int[] Ai = new int[N];
				
				for(int j = 0; j < N; j++) {
					Ai[j] = scan.nextInt();
				}
				
				int count = allocate(T, N, B, Ai);
				System.out.println("#" + i + ": " + count);
			}
		}
		scan.close();
	}
	
	static int allocate(int T, int N, int B, int[] Ai) {		
		int count = 0;	
		if(B >= 1 && B <= Math.pow(10, 5)) {
				
			//Sort from lowest
			for (int i = Ai.length -1; i >= 0; i--) {
				for(int j = 0; j < i; j++) {
					
					int indexOne = Ai[j];
					int nextIndex = Ai[j + 1];
					
					if(indexOne > nextIndex) {
						Ai[j] = nextIndex;
						Ai[j + 1] = indexOne;
					}
				}
			}
			
			//Add array items sequentially 
			int total = 0;
			for (int i = 0; i <= Ai.length; i++) {
				if (total <= B && (total += Ai[i]) <= B) {
					count++;
				}
			}
		}
		
		return count;
	}

}
