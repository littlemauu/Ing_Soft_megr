package control;

import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;
import modelo.Vacante;
import modelo.VacanteDAO;

/**
 *
 * @author maurichini
 */
@ManagedBean
@ViewScoped
public class ActualizarVacante {
    private int idvacante;
    private Empresa empresa;
    private int idEmpresa;
    private String puesto;
    private String lugar;
    private Integer salario;
    private String horario;
    private String descripcion;
    private String actividades;
    private Set postulars;

    public int getIdvacante() {
        return idvacante;
    }

    public void setIdvacante(int idvacante) {
        this.idvacante = idvacante;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public Set getPostulars() {
        return postulars;
    }

    public void setPostulars(Set postulars) {
        this.postulars = postulars;
    }
    
    public void actualizarVacante() {
        Vacante vac = new Vacante();
        VacanteDAO vacDAO = new VacanteDAO();
	EmpresaDAO empresaDAO = new EmpresaDAO();
        postulars = vacDAO.select(idvacante).getPostulars();
	empresa = empresaDAO.select(idEmpresa);
	vac.setIdvacante(idvacante);
	vac.setEmpresa(empresa);
	vac.setPuesto(puesto);
	vac.setLugar(lugar);
	vac.setSalario(salario);
	vac.setHorario(horario);
	vac.setDescripcion(descripcion);
	vac.setActividades(actividades);
	vac.setPostulars(postulars);
        vacDAO.update(vac);
    }
    
}
