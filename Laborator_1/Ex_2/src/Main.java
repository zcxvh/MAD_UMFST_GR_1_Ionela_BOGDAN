//import java.util.List;
//import java.util.Scanner;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        int average=0;

        Scanner sc =new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente: ");
        int elements=sc.nextInt();
        for(int i=0;i<elements;i++){
            System.out.print("Introduceti elementul: ");
            int number=sc.nextInt();
            integerList.add(number);
        }


        //Average
        for (int i=0;i<integerList.size();i++){
            average +=integerList.get(i);
        }
        System.out.println("Media numerelor este: "+average);

    }
}