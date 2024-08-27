import java.util.Arrays;
import java.util.Scanner;

public class N과M6 {

	static int n;
	static int m;
	static int[] arr;
	static int[] ans;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		m = sc.nextInt();
		arr = new int[n];
		ans = new int[m];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		recur(0,0);
		System.out.println(sb);
		
	}
	
	static void recur(int depth, int at) {
		if(depth==m) {
			for(int i=0;i<m;i++) {
				sb.append(ans[i]+" ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i = at ; i < n ;i++) {
			ans[depth] = arr[i];
			recur(depth+1,i+1);
		}
	}
}
