/*
1
10
101
1010
10101
101010 
1010101
 */
package patternPrinting;

public class Example1 {
	public static void main(String[] args) {
		int row = 7;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				if(j%2 == 0){
					System.out.print(0);
				}
				else{
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}
}
