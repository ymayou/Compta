/*
 * Copyright Yacine Mayou
 * Software created by Yacine Mayou
 */
package compta;

import dao.CategorieDao;
import java.util.List;
import java.util.Vector;
import model.Categorie;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import view.Infos;

/**
 *
 * @author You
 */
public class CategorieController {
    
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public CategorieController()
    {}
    
    public void displayInfos(Infos infoPan)
    {
        CategorieDao catDao  = new CategorieDao();
        List<Vector> cats = catDao.getAll();
        infoPan.setData(cats);
    }
    
    public void insertData(Categorie cat)
    {
        CategorieDao catDao  = new CategorieDao();
        catDao.insert(cat);
        LOGGER.log(Level.TRACE, "Insert new Categorie");
    }
    
}
