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
public class HabilidadDAO {
    private SessionFactory sessionFactory;
    
    public HabilidadDAO() {
        this.sessionFactory = NewHibernateUtil.getSessionFactory();
    }
    public void update(Habilidad hab) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.update(hab);
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
    public void insert(Habilidad hab) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.persist(hab);
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
    public void delete(Habilidad hab) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.delete(hab);
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
    public Habilidad select(int id) {
        Habilidad resultado = null;
        Transaction transaccion = null;
        Session session = sessionFactory.openSession();
        
        try {
            transaccion = session.beginTransaction();
            String hql = "from Habilidad as h where h.idhabilidad = " + id;
            Query query = session.createQuery(hql);
            resultado = (Habilidad)query.uniqueResult();
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
}