import Modelo.DirecDAO;
import Modelo.UserDAO;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.userDAO = new UserDAO();
        menu.direcDAO = new DirecDAO();

        menu.iniciar();

    }
}