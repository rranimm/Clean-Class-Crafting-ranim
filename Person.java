package personalinformationtest;

/**
 *
 * @author RANIM
 */
public class Person {
    //fields
     private String name ;
     private String addres ;
     private int age ;
     private String phoneNumber ;
     
     //constructor
     public Person(String na, String addr, int ag, String phone){
         name = na ;
         addres = addr ;
         age = ag ;
         phoneNumber = phone ;
     }
     
     //mutators
     public void setName(String na){
         name = na ;
     }
     public void setAddres(String addr){
         addres = addr ;
     }
     public void setAge(int ag){
         age = ag ;
     }
     public void setPhoneNumber(String phone){
         phoneNumber = phone ;
     }
     
     //accessor 
     public String getName(){
     return name ;
     }
    public String getAddres(){
     return addres ;
     }
    public int getAge(){
     return age ;
     }
    public String getPhOneNumber(){
     return phoneNumber ;
     }
}
