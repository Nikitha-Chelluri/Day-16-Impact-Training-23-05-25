import java.util.*;
class Trans {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        for (int i =0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }for (int i =0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
    }
}