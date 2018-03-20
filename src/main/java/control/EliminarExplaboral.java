package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Explaboral;
import modelo.ExplaboralDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class EliminarExplaboral {
    private int idexplaboral;

    public int getIdexplaboral() {
        return idexplaboral;
    }

    public void setIdexplaboral(int idexplaboral) {
        this.idexplaboral = idexplaboral;
    }
    
    public void eliminarExplaboral() {
        ExplaboralDAO empDAO = new ExplaboralDAO();
        Explaboral emp = empDAO.select(idexplaboral);
        empDAO.delete(emp);
    }
}
