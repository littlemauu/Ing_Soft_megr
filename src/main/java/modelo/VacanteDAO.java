/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author maurichini
 */
public class VacanteDAO {
    //private final SessionFactory ssf;
    private SessionFactory sessionFactory;
    
    public Vacante select(int id) {
        Vacante resultado = null;
        Transaction transaccion = null;
        Session session = sessionFactory.openSession();
        
        try {
            transaccion = session.beginTransaction();
            String hql = "from Vacante as v where v.idvacante = " + id;
            Query query = session.createQuery(hql);
            resultado = (Vacante)query.uniqueResult();
            transaccion.commit();
        }
        catch (Exception e) {

            if (transaccion!=null) {
                transaccion.rollback();
            }
            
            e.printStackTrace(); 
        }
        finally {
            session.close();
        }
        
        return resultado;
    }
    
    public void insert(Vacante vac) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.persist(vac);
           transaction.commit();
        }
        catch (Exception e) {
            
           if (transaction != null){ 
               transaction.rollback();
           }
           
           e.printStackTrace(); 
        }
        finally {
           session.close();
        }
        
    }
    
    public VacanteDAO() {
        this.sessionFactory = NewHibernateUtil.getSessionFactory();
    }
    
    public void delete(Vacante vac) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.delete(vac);
           transaction.commit();
        }
        catch (Exception e) {
            
           if (transaction != null){ 
               transaction.rollback();
           }
           
           e.printStackTrace(); 
        }
        finally {
           session.close();
        }
        
    }
    
    public void update(Vacante vac) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.update(vac);
           transaction.commit();
        }
        catch (Exception e) {
            
           if (transaction != null){ 
               transaction.rollback();
           }
           
           e.printStackTrace(); 
        }
        finally {
           session.close();
        }
        
    }
}