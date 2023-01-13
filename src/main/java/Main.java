import dao.PublisherDao;
import dao.PublisherDaoImpl;
import global.Global;
import pstate.MainMenu;
import pstate.Menu;

public class Main {
    public static void main(String[] args) {
        PublisherDao pDao = new PublisherDaoImpl();
        Global.publisherDao = pDao;
        Menu menu = new MainMenu();
        while (menu != null) {
            menu = menu.run();
        }
    }
}
