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
public class PostularDAO {
    
    private SessionFactory sessionFactory;
    
    public PostularDAO() {
        this.sessionFactory = NewHibernateUtil.getSessionFactory();
    }
    
    public void update(Postular pst) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.update(pst);
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
    
    public void insert(Postular pst) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.persist(pst);
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
    
    public void delete(Postular pst) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        
        try {
           transaction = session.beginTransaction();
           session.delete(pst);
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
    
    public Postular select(int id) {
        Postular resultado = null;
        Transaction transaccion = null;
        Session session = sessionFactory.openSession();
        
        try {
            transaccion = session.beginTransaction();
            String hql = "from Postular as p where p.idpostular = " + id;
            Query query = session.createQuery(hql);
            resultado = (Postular)query.uniqueResult();
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