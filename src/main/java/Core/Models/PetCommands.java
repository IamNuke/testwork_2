package Core.Models;

import java.util.ArrayList;

public class PetCommands {
    private ArrayList<Command> commands;

    public void addCommand(Command newCommand){
        this.commands.add(newCommand);
    }
    public void  PetCommands(){
        System.out.println(this.commands);
    }

}
