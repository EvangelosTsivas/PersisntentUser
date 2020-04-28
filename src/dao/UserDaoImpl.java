/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Vagos
 */
public class UserDaoImpl implements IUserDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UserDaoImpl() {
        emf = Persistence.createEntityManagerFactory("PersistentUserPU");
        em = emf.createEntityManager();
    }

    @Override
    public User findById(int id) {
        User user = em.find(User.class, id);    // thelei User.class ..dld to class arxeio 
        return user;

    }

    @Override
    public List<User> findAll() {
       return  em.createQuery("SELECT u From User u",User.class).getResultList();  //to createQuery douleyei gia oles tiw vaseis (agnostic)
                                 // h metavlhth u einai fere ola ta object typou user pou exeis parei ap th vash 
                                 //kai vazeis se metavlhth u apo th class User kai tha ta valeis sto u 
    }

    @Override
    public boolean deleteById(int id) {
       em.getTransaction().begin();    //se delete h update thelw transaction 
       User user = em.find(User.class, id); 
       if(user != null){
           em.remove(user); 
           em.getTransaction().commit();  //kanei commit to remove kai kleinei to transaction
           return true;
       }else{
           em.getTransaction().commit();  // to theloume ki edw gia na kleisei to transaction
           return false;
       }
    }

    @Override
    public boolean updateById(int id, User user) {
         em.getTransaction().begin();    
        User us = em.find(User.class, id); 
       if(us != null){
           us.setFirstName(user.getFirstName());
           us.setLastName(user.getLastName());
           us.setTel(user.getTel());
           us.setEmail(user.getEmail());
           em.getTransaction().commit();  
           return true;
       }else{
           em.getTransaction().commit();  
           return false;
       }
    }

    @Override
    public boolean save(User user) {
       em.getTransaction().begin();
       em.persist(user);
       em.getTransaction().commit();
       return true;
    }
 
    
    
    
}
