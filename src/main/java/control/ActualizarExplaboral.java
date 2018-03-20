package control;

import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Explaboral;
import modelo.ExplaboralDAO;
import modelo.Profesionista;
import modelo.ProfesionistaDAO;
import java.util.Date;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped

public class ActualizarExplaboral {
    private int idexplaboral;
    private Profesionista profesionista;
    private int idProfesionista;
    private String empresa;
    private String cargo;
    private Date periodoc;
    private Date periodot;

    public int getIdexplaboral() {
        return idexplaboral;
    }

    public void setIdexplaboral(int idexplaboral) {
        this.idexplaboral = idexplaboral;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getPeriodoc() {
        return periodoc;
    }

    public void setPeriodoc(Date periodoc) {
        this.periodoc = periodoc;
    }

    public Date getPeriodot() {
        return periodot;
    }

    public void setPeriodot(Date periodot) {
        this.periodot = periodot;
    }
    
    public void actualizarExplaboral() {
        Explaboral exp = new Explaboral();
        ExplaboralDAO expDAO = new ExplaboralDAO();
	ProfesionistaDAO profDAO = new ProfesionistaDAO();
	profesionista = profDAO.select(idProfesionista);
        exp.setEmpresa(empresa);
        exp.setCargo(cargo);
        exp.setPeriodoc(periodoc);
        exp.setPeriodot(periodot);
        expDAO.update(exp);
        exp.setIdexplaboral(idexplaboral);
        exp.setProfesionista(profesionista);
        

    }
    
}
