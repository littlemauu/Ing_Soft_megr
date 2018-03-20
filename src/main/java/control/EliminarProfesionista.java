package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Profesionista;
import modelo.ProfesionistaDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class EliminarProfesionista {
    private int idprofesionista;

    public int getIdprofesionista() {
        return idprofesionista;
    }

    public void setIdprofesionista(int idprofesionista) {
        this.idprofesionista = idprofesionista;
    }
    
    public void eliminarProfesionista() {
        ProfesionistaDAO empDAO = new ProfesionistaDAO();
        Profesionista emp = empDAO.select(idprofesionista);
        empDAO.delete(emp);
    }
    
}
