package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Formacionac;
import modelo.FormacionacDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class EliminarFormacionac {
    private int idformacionac;

    public int getIdformacionac() {
        return idformacionac;
    }

    public void setIdformacionac(int idformacionac) {
        this.idformacionac = idformacionac;
    }
    
    public void eliminarFormacionac() {
        FormacionacDAO empDAO = new FormacionacDAO();
        Formacionac emp = empDAO.select(idformacionac);
        empDAO.delete(emp);
    }
}
