package control;

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
public class EliminarEmpresa {
    private int idempresa;

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }
    
    public void eliminarEmpresa() {
        EmpresaDAO empDAO = new EmpresaDAO();
        Empresa emp = empDAO.select(idempresa);
        empDAO.delete(emp);
    }
}
