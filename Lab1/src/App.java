import java.util.Scanner; 
import java.lang.Math;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        //Uppgift 1
        /* float a = scanner.nextFloat();
        System.out.println(Math.sqrt(a));

        float b = scanner.nextFloat();
        System.out.println(Math.pow(b,a));*/
        

        //Uppgift 2

        /* int versaler = 0;
        char arr;
        
        
        do {
            arr = scanner.next().charAt(0);
            if(Character.isUpperCase(arr)) {
                versaler++;
            }

        }while(arr != '?');

        System.err.println(versaler);*/


        //Uppgift 3
        /* String string[];
        int size = 5;

        string = new String[size];

        for(int i = 0; i < size;i++) {
            string[i] = scanner.nextLine();
        }

        //bubbelsort
        for(int a = 0; a < size - 1; a++) {
            for(int b = 0; b < size - a - 1;b++) {
                if(string[b].compareTo(string[b+1]) > 0) {
                    String temp  = string[b];
                    string[b] = string[b+1];
                    string[b+1] = temp;
                }
            }
        }
        
        for(int j = 0; j < size;j++) {
            System.out.println(string[j]);
        }*/


        //Uppgift 4

        int tärning1[];
        int tärning2[];

        int size = 100;
        int summa = 0;
        int tärning1Summa = 0;
        int tärning2Summa = 0;

        tärning1 = new int[size];
        tärning2 = new int[size];

        Random rand = new Random();

        for(int i = 0; i < size; i++) {
            //tärning 1
            //tärning1 = rand.nextInt(1,7);
            //tärning 2
            //tärning2 = rand.nextInt(1,7);
        }


        
        
    }
}