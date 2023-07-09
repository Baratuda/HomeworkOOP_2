package Market;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Market implements Queue.MarketBehavior, Queue.QueueBehavior {
   private String name;
   private List<User> userList = new ArrayList<>();
   private List<Order> orderList = new ArrayList<>();;
   
   public Market(String name) {
      this.name = name;
   }
   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<User> getUserList() {
      return this.userList;
   }

   public void setUserList(List<User> userList) {
      this.userList = userList;
   }

   public List<Order> getOrderList() {
      return this.orderList;
   }

   public void setOrderList(List<Order> orderList) {
      this.orderList = orderList;
   }
   
   @Override
   public void addShoper(List<User> byuers){
      for(User i: byuers)
        this.userList.add(i);
   }
   @Override
   public void byuerDeleter(User byuer){
      this.userList.remove(byuer);
   }
   @Override
   public void updateMarket(Market market, List<Order> orders, String action){
       if(action.equals("add")) addOrder(orders);
       if(action.equals("delete")) deleteOrder(orders);
       System.out.printf("Market %s was update.", getName());
   }

   @Override
   public void deleteOrder(List<Order> orders){
      for(Order i: orders){
         this.orderList.remove(i);
         System.out.printf(" The order (%s) was given to %s %s. \n", i.getNameOrder(), i.getOrderOwner().getFirstName(), i.getOrderOwner().getSecondName());
      }
   }

   @Override
   public void addOrder(List<Order> orders){
      for(Order i: orders){
         this.orderList.add(i);
         System.out.printf(" The order on (%s) was created by  %s %s. \n", i.getNameOrder(), i.getOrderOwner().getFirstName(), i.getOrderOwner().getSecondName());
      }
   }

   @Override
   public void queue(){
      List<Order> orders = this.orderList; 
      List<User> users = this.userList;
      for(int i =0; i<users.size(); i++){
         int res = i;
         if(orders.size()!=0){
            deleteOrder(orders.stream()
                                      .filter(x->x.getOrderOwner().getPhoneNumber().equals(users.get(res).getPhoneNumber()))
                                      .collect(Collectors.toList()));
            byuerDeleter(users.get(i));                         
         }
         else System.out.printf("market dosen't have orders.");
      }
   }

}   