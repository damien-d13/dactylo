package fr.damien.entity;
public class User {

   private int user_id;
   private String user_name;
   private String user_password;
   private Float user_typing_speed;



public int getIdUser() {
       return user_id;
   };

   public String getUserName() {
       return user_name;
   };

   public void setUserName(String user_name) {
       this.user_name = user_name;
   };

   public String getUserPassword() {
       return user_password;
   };

   public void setUserPassword(String user_password) {
       this.user_password = user_password;
   };

   public Float getUserTypingSpeed() {
       return user_typing_speed;
   };

   public void setUserTypingSpeed(Float user_typing_speed) {
       this.user_typing_speed = user_typing_speed;
   }
}
