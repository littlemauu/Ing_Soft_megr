package control;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Formacionac;
import modelo.FormacionacDAO;
import modelo.Profesionista;
import modelo.ProfesionistaDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class ActualizarFormacionac {
    private int idformacionac;
    private Profesionista profesionista;
    private int idProfesionista;
    private String colegio;
    private Integer nivel;
    private Date periodoc;
    private Date periodot;

    public int getIdformacionac() {
        return idformacionac;
    }

    public void setIdformacionac(int idformacionac) {
        this.idformacionac = idformacionac;
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

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
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
    
    public void actualizarFormacionac() {
        Formacionac frm = new Formacionac();
        FormacionacDAO frmDAO = new FormacionacDAO();
	ProfesionistaDAO profDAO = new ProfesionistaDAO();
	profesionista = profDAO.select(idProfesionista);
        frm.setIdformacionac(idformacionac);
        frm.setProfesionista(profesionista);
        frm.setColegio(colegio);
        frm.setNivel(nivel);
        frm.setPeriodoc(periodoc);
        frm.setPeriodoc(periodot);
        frmDAO.update(frm);
    }
    
}
