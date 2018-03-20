package control;

import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class ActualizarEmpresa {
    private int idempresa;
    private String nombre;
    private String oficinas;
    private Integer numempleados;
    private String contacto;
    private Set vacantes;

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficinas() {
        return oficinas;
    }

    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getNumempleados() {
        return numempleados;
    }

    public void setNumempleados(Integer numempleados) {
        this.numempleados = numempleados;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Set getVacantes() {
        return vacantes;
    }

    public void setVacantes(Set vacantes) {
        this.vacantes = vacantes;
    }
    
    public void actualizarEmpresa() {
        Empresa emp = new Empresa();
        EmpresaDAO empDAO = new EmpresaDAO();
        vacantes = empDAO.select(idempresa).getVacantes();
        emp.setIdempresa(idempresa);
        emp.setNombre(nombre);
        emp.setOficinas(oficinas);
        emp.setNumempleados(numempleados);
        emp.setContacto(contacto);
        emp.setVacantes(vacantes);
        empDAO.update(emp);
    }
    
}
