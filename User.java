import java.util.Scanner;

public class User{
   private String firstName;
   private String secondName;
   private String phoneNumber;
   private int age;

public User(String firstName, String secondName, String phoneNumber, int age) {
      this.firstName = firstName;
      this.secondName = secondName;
      this.phoneNumber = phoneNumber;
      this.age = age;
}


   public String getFirstName() {
      return this.firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getSecondName() {
      return this.secondName;
   }

   public void setSecondName(String secondName) {
      this.secondName = secondName;
   }

   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int age) {
      this.age = age;
   }
   
   
   public int sortusers(User o, String option){
      int result = 0;
     switch (option) {
         case "1":
            result = this.firstName.compareTo(o.getFirstName());
            break;
         case "2":
            result = this.secondName.compareTo(o.getSecondName());
            break;
         case "3":
            result = this.phoneNumber.compareTo(o.getPhoneNumber());
            break;
         case "4":
            Integer age = this.age;
            result = age.compareTo(o.getAge());
            break;      
         default:
            System.out.println("Данной опции не существует, попробуйте еще раз.");
            break;
       }
       return result;
   }

   @Override
   public String toString() {
      return "{" +
         " firstName='" + getFirstName() + "'" +
         ", secondName='" + getSecondName() + "'" +
         ", phoneNumber='" + getPhoneNumber() + "'" +
         ", age='" + getAge() + "'" +
         "}";
   }

}
