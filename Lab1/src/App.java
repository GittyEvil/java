import java.util.Scanner; 
import java.lang.Math;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        
        Circle circle = new Circle(0);
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

        /*int size = 100;
        int[] arr = new int[12];

        Random rand = new Random();

        for(int i = 0; i < size; i++) {
            //tärning 1
            int tärning1 = rand.nextInt(6) + 1;
            //tärning 2
            int tärning2 = rand.nextInt(6) + 1;
            int summa = tärning1 + tärning2;

            arr[summa-2]++;
        }


        for(int j = 0; j < arr.length;j++) {
            System.out.println((arr[j])+ " gånger blev tärningssumman " + j);
        } */


        //Uppgift 5
        System.out.println("skriv en radie du vill använda");
        int radius = scanner.nextInt();
        System.out.println(circle.Area(radius));
        System.out.println(circle.perimeter(radius));
        
        
    }
}
