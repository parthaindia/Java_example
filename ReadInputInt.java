import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class ReadInputInt{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int M = 3; // 3 lines;
        int N =2; // each line having 2 integers
        Integer[][] values = new Integer[M][N];
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                values[i][j] = sc.nextInt();
            }
        }
    }
}
