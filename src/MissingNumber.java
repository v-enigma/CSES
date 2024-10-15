import java.util.*;
import java.util.stream.Collectors;


public class MissingNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Boolean> hs= new HashMap<Integer,Boolean>();
        int n = scan.nextInt();
        scan.nextLine();
        int nCopy = n;
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int i =0;
        while(n > 1){

            hs.put(numbers.get(i), true);
            i++;
            n--;
        }
        while(hs.containsKey(nCopy ) && nCopy > 0){
            nCopy--;
        }
        System.out.println(nCopy);

    }
}
