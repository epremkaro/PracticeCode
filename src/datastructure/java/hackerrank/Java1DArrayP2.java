package datastructure.java.hackerrank;

import java.util.Scanner;

public class Java1DArrayP2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] myList = new int[n];
			for (int j = 0; j < n; j++) {
				myList[j] = sc.nextInt();
			}
			
//1
//			20 8
//			0 1 0 0 0 0 0 0 0 1 1 1 0 0 0 1 1 1 1 0
			
			for (int k = 0; k < n; ){
//				System.out.print(k + " - [k+m = " + (k+m) + "]\n");
				if ((k+1 > n-1) || (k+m > n-1)){
					System.out.println("YES");
					break;
				}
				else{
//					System.out.println("myList1[" + k + "] = " + myList[k]);
				}
				
				if ((k+1 < n) && (myList[k+1] == 0)){
//					System.out.println("cont1");
					k++;
					continue;
				}
				else {
					
					if (myList[k] == 0 && (k + m <= n - 1) && (myList[k + m] == 0)){
						if (k == k + m){
							System.out.println("NO");
							break;
						}
						k = k + m;
						continue;
					}
					else {
						if ((k-1 >= 0 ) && (myList[k-1] == 0)){
//							System.out.println("cont2");
//							System.out.println("myList2[" + (k-1+m) + "] = " + myList[k-1+m]);
							if ((k - 1 + m <= n - 1) && (myList[k - 1 + m] == 0)){
//								System.out.println("cont3");
								if (k == k - 1 + m){
									System.out.println("NO");
									break;
								}
									
								k = k - 1 + m;
								continue;
							}
							else{
								System.out.println("NO");
								break;
							}
						}
						else{
								System.out.println("NO");
								break;
						}
					}
				}
					
			}
		}
	}

}
