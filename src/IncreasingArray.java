import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IncreasingArray {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        List<Integer> input = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int index = 1;
        long moves = 0;
        while(index < size){

            if(input.get(index) < input.get(index-1)){
                moves+= (input.get(index-1) - input.get(index));
                input.set(index, input.get(index-1));
            }

            index++;
        }
        System.out.println(moves);
    }
}
