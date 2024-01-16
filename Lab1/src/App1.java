
import java.util.Random;

public class App1 {

    public static void main(String[] args) {
        int[] sumFrequency = new int[11]; // En array för att hålla reda på frekvensen av varje möjlig summa

        // Simulera 100 tärningskast
        for (int i = 0; i < 100; i++) {
            int tarning1 = kastaTarning();
            int tarning2 = kastaTarning();
            int summa = tarning1 + tarning2;

            // Öka frekvensräknaren för den beräknade summan
            sumFrequency[summa - 2]++;
        }

        // Skriv ut resultaten
        for (int i = 0; i < sumFrequency.length; i++) {
            System.out.println((i + 2) + " gånger blev tärningssumman " + (i + 2));
        }
    }

    // Funktion för att generera ett slumptal mellan 1 och 6
    private static int kastaTarning() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
