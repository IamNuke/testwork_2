package UserInterface;

import Core.MVP.View;
import Core.Models.Command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleView implements View {

    Scanner in;
    @Override
    public int getType() {
        System.out.println("Hamster: 1");
        System.out.println("Cat: 2");
        System.out.println("Dog: 3");
        System.out.println("Horse: 4");
        System.out.println("Camel: 5");
        System.out.println("Donkey: 6");

        return Integer.parseInt(in.nextLine());
    }

    @Override
    public String getName() {
        System.out.print("Name: ");
        return in.nextLine();
    }

    @Override
    public String getDateOfBirthday()  {
        System.out.print("Date: ");
        return in.nextLine();
    }

    @Override
    public Command getCommand() {

        for (Command allCommands : Command.values()) {
            System.out.println(allCommands);
        }
        int commandNum = Integer.parseInt(in.nextLine());

        return switch (commandNum) {
            case 1 -> Command.GO;
            case 2 -> Command.STOP;
            case 3 -> Command.RUN_AWAY;
            case 4 -> Command.COME_UP;
            case 5 -> Command.LIE;
            case 6 -> Command.JUMP;
            case 7 -> Command.TRUP;
            case 8 -> Command.STAND_UP;
            default -> null;
        };

    }

}
