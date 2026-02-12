package BasicProgramming.Jobsheet01;

import java.util.Scanner;

public class duty1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        char[] CODE = {'A','B','D','E','F','G','H','L','N','T'};

        char[][] KOTA = {
            {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
            {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
            {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
            {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
            {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
            {'P','E','K','A','L','O','N','G','A','N',' ',' '},
            {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
            {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
            {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
            {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
        };

        System.out.print("Enter license plate: ");
        String plate = inp.nextLine().toUpperCase();

        char firstCode = plate.charAt(0);

        for (int i = 0; i < CODE.length; i++) {

            if (firstCode == CODE[i]) {

                String city = new String(KOTA[i]).trim();

                if (plate.endsWith(city)) {
                    plate = plate.substring(0, plate.length() - city.length());
                }
                break;
            }
        }

        System.out.println("Plate without city name: " + plate);

        inp.close();
    }
}
