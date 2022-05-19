import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.DaoException;
import dao.VertragspartnerDAO;
import dao.WareDAO;

import java.sql.SQLException;

public class ProgrammDAO {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, DaoException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        Vertragspartner vertragspartner= vertragspartnerDAO.read("12345678");
        System.out.println(vertragspartner.getVorname());

        WareDAO wareDAO = new WareDAO();
        Ware ware = wareDAO.read("1");
        System.out.println(ware);


    }
}
