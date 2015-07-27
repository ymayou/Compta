package compta;

import dao.CategorieDao;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Categorie;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Tfk
 */
public class Compta {
    public static int YEAR;
    public static int MONTH;
    
    private static final Logger LOGGER = LogManager.getLogger(Compta.class);
    
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("run.properties"));
            LOGGER.trace("reading run properties");
            MONTH = Integer.parseInt(props.getProperty("lastMonth"));
            YEAR = Integer.parseInt(props.getProperty("lastYear"));
        } catch (IOException io) {
            LOGGER.log(Level.INFO, "Run properties file doesn't exit\n" + io.getMessage() + "\n" + io.getLocalizedMessage());
            MONTH = Calendar.getInstance().get(Calendar.MONTH);
            YEAR = Calendar.getInstance().get(Calendar.YEAR);
        }
        props.setProperty("lastMonth", String.valueOf(Calendar.getInstance().get(Calendar.MONTH)));
        props.setProperty("lastYear", String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
        try {
            props.store(new FileOutputStream("run.properties"), null);
            LOGGER.log(Level.TRACE, "Saving new run properties file");
        } catch (IOException ex) {
            LOGGER.log(Level.ERROR, "Can't store run properties file\n" + ex.getMessage() + "\n" + ex.getLocalizedMessage());
        }
        
        CategorieDao catDao  = new CategorieDao();
        Categorie cat = catDao.getCategorieById(1);
       
        try {
            // Use the system Look&Feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Main main = new Main();
            main.setYear();
            main.setExtendedState(JFrame.MAXIMIZED_BOTH);
            main.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println(e.toString());
        }
    }
}
