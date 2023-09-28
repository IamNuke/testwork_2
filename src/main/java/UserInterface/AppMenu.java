package UserInterface;

import Core.Config;
import Core.MVP.Presenter;
import Core.MVP.View;

import java.util.Scanner;

public class AppMenu {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - show  2 - add  3 - add command");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.showListOfPets();
                        break;
                    case "2":
                        presenter.add();
                        break;
                    case "3":

                        return;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
