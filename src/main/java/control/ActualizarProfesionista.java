package control;

import java.util.Set;
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
public class ActualizarProfesionista {
    private int idprofesionista;
    private String nombre;
    private String apellidop;
    private String nacionalidad;
    private String carrera;
    private String telefono;
    private String contrasenia;
    private String foto;
    private Set postulars;
    private Set habilidads;
    private Set formacionacs;
    private Set explaborals;

    public int getIdprofesionista() {
        return idprofesionista;
    }

    public void setIdprofesionista(int idprofesionista) {
        this.idprofesionista = idprofesionista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Set getPostulars() {
        return postulars;
    }

    public void setPostulars(Set postulars) {
        this.postulars = postulars;
    }

    public Set getHabilidads() {
        return habilidads;
    }

    public void setHabilidads(Set habilidads) {
        this.habilidads = habilidads;
    }

    public Set getFormacionacs() {
        return formacionacs;
    }

    public void setFormacionacs(Set formacionacs) {
        this.formacionacs = formacionacs;
    }

    public Set getExplaborals() {
        return explaborals;
    }

    public void setExplaborals(Set explaborals) {
        this.explaborals = explaborals;
    }
    
    public void actualizarProfesionista() {
        Profesionista prof = new Profesionista();
        ProfesionistaDAO profDAO = new ProfesionistaDAO();
	Profesionista profV = profDAO.select(idprofesionista);
        postulars = profV.getPostulars();
        habilidads = profV.getHabilidads();
        formacionacs = profV.getFormacionacs();
        explaborals = profV.getExplaborals();
        prof.setIdprofesionista(idprofesionista);
        prof.setNombre(nombre);
        prof.setApellidop(apellidop);
        prof.setNacionalidad(nacionalidad);
        prof.setCarrera(carrera);
        prof.setTelefono(telefono);
        prof.setContrasenia(contrasenia);
        prof.setFoto(foto);
        prof.setPostulars(postulars);
        prof.setHabilidads(habilidads);
        prof.setFormacionacs(formacionacs);
        prof.setExplaborals(explaborals);
        profDAO.update(prof);
    }
    
}
