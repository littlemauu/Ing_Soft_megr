package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Postular;
import modelo.PostularDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class EliminarPostular {
    private int idpostular;

    public int getIdpostular() {
        return idpostular;
    }

    public void setIdpostular(int idpostular) {
        this.idpostular = idpostular;
    }
    
    public void eliminarPostular() {
        PostularDAO empDAO = new PostularDAO();
        Postular emp = empDAO.select(idpostular);
        empDAO.delete(emp);
    }
}
