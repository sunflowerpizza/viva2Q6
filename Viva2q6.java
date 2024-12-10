import java.util.Scanner;
 
public class Viva2q6 {
	public static void main(String[] args) {
	    int[][] matrix = parseMatrix();
	    System.out.print("\nThe original matrix:");
            System.out.println("");
            displayMatrix(matrix);
            rotateMatrix(matrix);
            System.out.println("");
            System.out.print("The matrix after rotating:");
            System.out.println("");
            displayMatrix(matrix);
	}
	
	public static int[][]  parseMatrix(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the dimension of the square matrix: ");
		int n;
		while (true) {
		n = input.nextInt();
		if (n>=0 && n<=100) {
			break;
		}
		System.out.println("Please enter number between 0 and 100.");
		}
		
		 input.nextLine();
		
		int[][] matrix = new int[n][n];
		for (int i = 0; i <n; i++) {
			System.out.print("Enter row number " + (i+1) + " : ");
			String asd = input.nextLine();
			String[] store = asd.split(" ");
			for(int j = 0; j<n ; j++) {
				matrix[i][j] = Integer.parseInt(store[j]);
			}
		}
		input.close();
		return matrix;
	}
	
	public static void displayMatrix(int array [][]) {
		for(int i=0;i<array.length;i++) {
			for(int j =0;j<array.length;j++) {
				System.out.print(array[i][j]+" ");
			}
                        System.out.println("");
		}
	}
	
	public static void rotateMatrix(int array[][]) {
            //this loop rotates the matrix diagonally
            for(int i = 0; i<array.length;i++){
                for(int j = i+1;j<array.length;j++){
                    int hold = array[i][j];
                    array[i][j] = array [j][i];
                    array [j][i] = hold;
                }
            }
            //checks every row, while resets to 0 to check again
            for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array.length - 1;

            // Swap elements of each row from left to right
            while (left < right) {
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;
                left++;
                right--;
            }   
            }
    }
}
 
