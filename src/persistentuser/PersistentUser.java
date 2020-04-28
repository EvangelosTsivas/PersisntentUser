/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistentuser;

import entities.User;
import java.util.List;

/**
 *
 * @author Vagos
 */
public class PersistentUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*   
        findById(int id)
        findAll()
        save(User user)   //insert into
        update(int id, User user)
        deleteById(int id)   
        */
      
      services.UserImpl userService = new services.UserImpl();   // den vazw panw import giati mia fora tha to xrhsimopoihsw
      //tha kanw ena object ap to opoio kalw methodous
      
//      User user = userService.findById(1);
//      if(user == null){
//          System.out.println("Oh!!! Something is not found!!");
//      }else{
//          System.out.println(user);
//      }
//      
//      List<User> users = userService.findAll();
//      for(User user1 :users){
//          System.out.println(user1);
//      }
      
//      int i =1;
//      boolean delete = userService.deleteById(i);
//      if(delete)
//         System.out.println("User with id: "+i +" deleted successfully");
      
      int j =2;
      User user = new User("Vagelis","Tsivas","2319323","www@ggg.gr");
      boolean update = userService.updateById(j, user);  
      if(update){
          System.out.println("User with id "+ j+ " was updated!!");
      }
      
      User user2 = new User("Thomas","Dalton","210777711","aaa@mmm.com");
      boolean save = userService.save(user2);
      if(save){
          System.out.println("User "+ user2.getFirstName() + " inserted!!");
      }
      
      
      
    }
    
}
