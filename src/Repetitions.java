import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String dnaSequence = scan.next();
        char currentChar = ' ';
        int i = 0, count =0, highestCount = -1;

        while(i < dnaSequence.length()){
            if(i == 0) {
                currentChar = dnaSequence.charAt(i);
                count = 1;
            }
            else{
                if(currentChar == dnaSequence.charAt(i))
                    count++;
                else{
                    currentChar = dnaSequence.charAt(i);
                    if(highestCount < count)
                        highestCount = count;
                    count = 1;
                }
            }
            i++;
        }
        if(highestCount < count)
            highestCount = count;
        System.out.println(highestCount);
    }
}
