import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //With input.
        printMultTable(1, 12);
    }

    private static void printMultTable(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.printf("\t%2d", i);
        }
        System.out.println();
        for(int i=start; i <= end; i++){
            System.out.printf("%2d\t", i);
            for(int j=start; j <= end; j++){
                System.out.printf("%2d\t", i*j);
            }
            System.out.println();
        }
    }
}
