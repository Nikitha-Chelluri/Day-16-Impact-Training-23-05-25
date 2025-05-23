import java.util.*;
class Diagnol {
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
        int count  = 0;
        for (int i =0; i < r; i++) {
            for(int j = 0; j < i; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count == 3) {
            System.out.println("Upper Triangle");
        }
        else {
            System.out.println("Not Upper Triangle");
        }

    }
}