package pstate;

import java.util.Scanner;

public class BookMenu implements Menu {
    @Override
    public Menu run() {
        System.out.println("--- Book Menu ---");
        System.out.println("1: Add a book");
        System.out.println("2. Delete a book");
        System.out.println("3. Search books");
        System.out.println("...");
        System.out.println("7. Go back");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equals("7")) {
            // TODO
            return new MainMenu();
        } else {
            // TODO
            return this;
        }
    }
}
