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
public class GuardarProfesionista {
    private int idprofesionista;
    private String nombre;
    private String apellidop;
    private String nacionalidad;
    private String carrera;
    private String telefono;
    private String contrasenia;
    private String foto;

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

    public void guardarProfesionista() {
        Profesionista prof = new Profesionista();
	prof.setIdprofesionista(idprofesionista);
        prof.setNombre(nombre);
        prof.setApellidop(apellidop);
        prof.setNacionalidad(nacionalidad);
        prof.setCarrera(carrera);
        prof.setTelefono(telefono);
        prof.setContrasenia(contrasenia);
        prof.setFoto(foto);
        ProfesionistaDAO profDAO = new ProfesionistaDAO();
        profDAO.insert(prof);
    }
    
}
