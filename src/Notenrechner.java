import java.util.Scanner;

public class Notenrechner {


    public static void main(String[] args) {
        boolean run  = true;
        while (run) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("WAS WOTSCH FÜR E NOTE BRATAN?");
            double wunschnote = scanner.nextDouble();

            System.out.println("Was hast du bei der Gruppenarbeit?");
            double noteGruppe = scanner.nextDouble();

            System.out.println("Was hast du bei den Hausaufgaben?");
            double noteHausaufgaben = scanner.nextDouble();

            if(noteGruppe == 0.0 || noteHausaufgaben == 0.0){
                run =  false;

            }


            double benötigt = (wunschnote - (noteGruppe * 0.3 + noteHausaufgaben * 0.3)) / 0.4;

            System.out.printf("Du benötigst mind. ein %.2f du NOOB \n\n",benötigt);
        }
    }


}
