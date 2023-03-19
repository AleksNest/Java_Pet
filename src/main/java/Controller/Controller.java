package Controller;

import Models.Nursery;
import Repository.LoadFromFile;
import Service.Counter;
import View.UserMenuConsole;

import java.io.FileNotFoundException;

public class Controller {
    private UserMenuConsole consoleView;


    public Controller(int flag) throws FileNotFoundException {
        Nursery nursery = new Nursery(new Counter());
        if (flag == 1) {
            new LoadFromFile(nursery).loadNurseryFromFile();
        }
        new UserMenuConsole(nursery).start();

    }


}
