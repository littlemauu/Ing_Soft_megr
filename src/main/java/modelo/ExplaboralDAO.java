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
public class ExplaboralDAO {
    private SessionFactory sessionFactory;
    
    public ExplaboralDAO() {
        this.sessionFactory = NewHibernateUtil.getSessionFactory();
    }
    
    public void delete(Explaboral exp) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.delete(exp);
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
    
    public void insert(Explaboral exp) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.persist(exp);
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
    
    public void update(Explaboral exp) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.update(exp);
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
    
    public Explaboral select(int id) {
        Explaboral resultado = null;
        Transaction transaccion = null;
        Session session = sessionFactory.openSession();
        
        try {
            transaccion = session.beginTransaction();
            String hql = "from Explaboral as e where e.idexplaboral = " + id;
            Query query = session.createQuery(hql);
            resultado = (Explaboral)query.uniqueResult();
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