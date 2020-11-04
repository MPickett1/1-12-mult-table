import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //With input.
        printMultTable(1, 12);
    }

    private static void printMultTable(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.print("\t" + i);
        }
        System.out.println();
        for(int i=start; i <= end; i++){
            System.out.print(i + "\t");
            for(int j=start; j <= end; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}
