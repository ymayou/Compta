/*
 * Copyright Yacine Mayou
 * Software created by Yacine Mayou
 */
package compta;

import dao.Connect;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.getProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Properties;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import view.Options;

/**
 *
 * @author You
 */
public class OptionsController {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public OptionsController()
    {}
    
    public boolean displayData(Options opt)
    {
        boolean ret = false;
        Map<String, String> lProp = new HashMap();
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("options.properties"));
            lProp.put("SERVER", props.getProperty("SERVER"));
            lProp.put("PORT", props.getProperty("PORT"));
            lProp.put("TABLENAME", props.getProperty("TABLENAME"));
            lProp.put("USER", props.getProperty("USER"));
            lProp.put("PWD", props.getProperty("PWD"));
            opt.setData(lProp);
            ret = true;
        } catch (IOException io) {
            LOGGER.log(Level.INFO, "Options properties file doesn't exist\n" + io.getMessage() + "\n" + io.getLocalizedMessage());
            ret = false;
        }
        return ret;
    }
    
    public void saveOptions(Properties prop)
    {
        try {
            prop.store(new FileOutputStream("options.properties"), null);
            LOGGER.log(Level.TRACE, "Saving new options properties file");
        } catch (IOException ex) {
            LOGGER.log(Level.ERROR, "Can't store options properties file\n" + ex.getMessage() + "\n" + ex.getLocalizedMessage());
        }
    }
    
}
