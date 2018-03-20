package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Postular;
import modelo.PostularDAO;
import modelo.Profesionista;
import modelo.ProfesionistaDAO;
import modelo.Vacante;
import modelo.VacanteDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class GuardarPostular {
    private int idpostular;
    private Profesionista profesionista;
    private int idProfesionista;
    private Vacante vacante;
    private int idVacante;
    private Boolean aceptado;

    public int getIdpostular() {
        return idpostular;
    }

    public void setIdpostular(int idpostular) {
        this.idpostular = idpostular;
    }

    public Profesionista getProfesionista() {
        return profesionista;
    }

    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }

    public int getIdProfesionista() {
        return idProfesionista;
    }

    public void setIdProfesionista(int idProfesionista) {
        this.idProfesionista = idProfesionista;
    }

    public Vacante getVacante() {
        return vacante;
    }

    public void setVacante(Vacante vacante) {
        this.vacante = vacante;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }

    public Boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }
    
    public void guardarPostular() {
        Postular pos = new Postular();
	ProfesionistaDAO profDAO = new ProfesionistaDAO();
        VacanteDAO vacDAO = new VacanteDAO();
	profesionista = profDAO.select(idProfesionista);
	vacante = vacDAO.select(idVacante);
        pos.setIdpostular(idpostular);
        pos.setProfesionista(profesionista);
        pos.setVacante(vacante);
        pos.setAceptado(aceptado);
        PostularDAO posDAO = new PostularDAO();
        posDAO.insert(pos);
    }
    
}
