package pstate;

import global.Global;
import model.Publisher;

import java.io.IOException;
import java.util.Scanner;

public class PublisherMenu implements Menu {
    @Override
    public Menu run() {
        System.out.println("--- Publisher Menu ---");
        System.out.println("1: Add a publisher");
        System.out.println("2. Delete a publisher");
        System.out.println("...");
        System.out.println("7. Go back");
        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equals("1")) {
            // TODO
            Publisher p = new Publisher();
            try {
                Global.publisherDao.add(p);

            } catch (IOException e) {
                e.printStackTrace();
                // TODO
            }
            return new MainMenu();
        } else if (choice.equals("7")) { // TODO: handle other options
            // TODO
            return this;
        } else {
            // TODO
            return this;
        }
    }
}
