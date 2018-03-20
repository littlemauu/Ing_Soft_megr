package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Habilidad;
import modelo.HabilidadDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class EliminarHabilidad {
    private int idhabilidad;

    public int getIdhabilidad() {
        return idhabilidad;
    }

    public void setIdhabilidad(int idhabilidad) {
        this.idhabilidad = idhabilidad;
    }
    
    public void eliminarHabilidad() {
        HabilidadDAO empDAO = new HabilidadDAO();
        Habilidad emp = empDAO.select(idhabilidad);
        empDAO.delete(emp);
    }
}
