import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        enum Menu {
            START, SAVEGAME, LOADGAME, HIGHSCORES, QUIT
        }

        System.out.println(Menu.START);
        System.out.println(Menu.SAVEGAME);
        System.out.println(Menu.LOADGAME);
        System.out.println(Menu.HIGHSCORES);
        System.out.println(Menu.QUIT);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando: ");
        String line = scanner.nextLine();
        Menu menu = Menu.valueOf(line);


        /*if (command.equals("START")) {
            System.out.println("Começou o jogo");
        } else if (command.equals("SAVEGAME")) {
            System.out.println("Guardou o jogo");
        } else if (command.equals("LOADGAME")) {
            System.out.println("A carregar...");
        } else if (command.equals("HIGHSCORES")) {
            System.out.println("Highscores: ");
        } else if (command.equals("QUIT")) {
            System.out.println("a sair...");
        }*/

        switch (menu){
            case START:
                System.out.println("starting...");
                break;

            case SAVEGAME:
                System.out.println("saving...");
                break;
            case LOADGAME:
                System.out.println("loading...");
            case HIGHSCORES:
                System.out.println("HighScores: ");
            case QUIT:
                    System.out.println("Quiting...");
                    break;
        }

    }
}

