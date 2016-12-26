package pk.edu.nust.seecs.gradebook;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;

/**
 * My main App. 
 * <p>
 This executes everything.
 */

public class App {
    public static void main(String[] args) {
        CloDao clodao = new CloDao();
        Clo clo = new Clo();
        clo.setName("CLO 1");
        clo.setDescription("Design efficient solutions for algorithmic problems");
        clo.setPlo("2");
        clodao.addClo(clo);
        clodao.updateClo(clo);
        for (Clo iter : clodao.getAllClos()) {
            System.out.println((Object)iter);
        }
        System.out.println((Object)clodao.getCloById(1));
    }
}