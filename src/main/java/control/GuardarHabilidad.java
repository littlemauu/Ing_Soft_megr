package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Habilidad;
import modelo.HabilidadDAO;
import modelo.Profesionista;
import modelo.ProfesionistaDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class GuardarHabilidad {
    private int idhabilidad;
    private Profesionista profesionista;
    private int idProfesionista;
    private String nombre;
    private Integer nivel;

    public int getIdhabilidad() {
        return idhabilidad;
    }

    public void setIdhabilidad(int idhabilidad) {
        this.idhabilidad = idhabilidad;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    public void guardarHabilidad() {
        Habilidad hab = new Habilidad();
	ProfesionistaDAO profDAO = new ProfesionistaDAO();
	profesionista = profDAO.select(idProfesionista);        
        hab.setIdhabilidad(idhabilidad);
        hab.setProfesionista(profesionista);
        hab.setNombre(nombre);
        hab.setNivel(nivel);
        HabilidadDAO habDAO = new HabilidadDAO();
        habDAO.insert(hab);
    }
    
}
