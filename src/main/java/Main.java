import pstate.MainMenu;
import pstate.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new MainMenu();
        while (menu != null) {
            menu = menu.run();
        }
    }
}
