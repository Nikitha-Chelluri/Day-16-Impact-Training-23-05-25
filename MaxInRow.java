import java.util.*;
class MaxInRow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        for (int i =0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i =0; i < r; i++) {
            int max = 0; 
            for(int j = 1; j < c; j++) {
                if (arr[j][i] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print(max+"\t");
        }

    }
}