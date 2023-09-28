package Core.MVP;

import Core.Models.Command;

import java.text.ParseException;
import java.util.Date;

public interface View {
    public int getType();
    public String getName();
    public String getDateOfBirthday();
    public Command getCommand();
}
