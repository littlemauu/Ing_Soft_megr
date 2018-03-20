package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Vacante;
import modelo.VacanteDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class EliminarVacante {
    private int idvacante;

    public int getIdvacante() {
        return idvacante;
    }

    public void setIdvacante(int idvacante) {
        this.idvacante = idvacante;
    }
    
    public void eliminarVacante() {
        VacanteDAO empDAO = new VacanteDAO();
        Vacante emp = empDAO.select(idvacante);
        empDAO.delete(emp);
    }
    
}
