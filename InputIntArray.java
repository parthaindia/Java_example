import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class InputIntArray{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int M = 3; // 3 lines having single integer each
        List<Integer> values = new ArrayList<Integer>();
        for(int i=0; i<M; i++) {
            int a=sc.nextInt();
            values.add(a);            
        }
        //use this to print
       //System.out.println(values.get(0));
    }
}
