import dao.PublisherDao;
import dao.PublisherDaoImpl;
import global.Global;
import pstate.MainMenu;
import pstate.Menu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // init global objects
        PublisherDao pDao = null;
        try {
            pDao = new PublisherDaoImpl();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        Global.publisherDao = pDao;

        // start program
        Menu menu = new MainMenu();
        while (menu != null) {
            menu = menu.run();
        }
    }
}
