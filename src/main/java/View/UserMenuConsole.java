package View;

import Models.Nursery;

import java.util.Scanner;

public class UserMenuConsole {
    private String userSelection;
    private Nursery nursery;


    Scanner scanner = new Scanner(System.in);

    public UserMenuConsole(Nursery nursery) {
        this.nursery = nursery;
    }


    /**
     * method of user interaction with the main menu
     **/
    public void start() {
        UserMenuCommands userMenuCommands = new UserMenuCommands(nursery);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MenuTemplates.printMenuTitle("Main menu: Select a item:");
            MenuTemplates.printMenuBody(
                    "1 - Show pet nursery.\n" +
                            "2 - Add new pet in to the nursery \n" +
                            "3 - Add new command for the pet.\n" +
                            "4 - Change date of pet from nursery.\n" +
                            "5 - Delete pet from nursery.\n" +
                            "6 - Exit without saving ...");
            MenuTemplates.printMenuLine();


            userSelection = scanner.next();

            if (userSelection.equals("1")) {
                userMenuCommands.showPetNursery();
            } else if (userSelection.equals("2")) {
                userMenuCommands.addNewAnimal();
            } else if (userSelection.equals("3")) {
                userMenuCommands.addCommandsToExistAnimal();

            } else if (userSelection.equals("4")) {
                userMenuCommands.changePetFromNursery();

            } else if (userSelection.equals("5")) {
                userMenuCommands.deletePetFromNursery();

            } else if (userSelection.equals("6")) {
                System.out.println("program completed");
                break;

            } else {
                MenuTemplates.printResponseTemplate("Error! Input correct value!");

            }

        }
    }
}

