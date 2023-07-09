package Market;

public class Order {
   String nameOrder;
   String descriptionOrder;
   User orderOwner;
   int indexOrder;

   public Order(String nameOrder, String descriptionOrder, User orderOwner, int indexOrder) {
      this.nameOrder = nameOrder;
      this.descriptionOrder = descriptionOrder;
      this.orderOwner = orderOwner;
      this.indexOrder = indexOrder;
   }

   public String getNameOrder() {
      return this.nameOrder;
   }

   public void setNameOrder(String nameOrder) {
      this.nameOrder = nameOrder;
   }

   public String getDescriptionOrder() {
      return this.descriptionOrder;
   }

   public void setDescriptionOrder(String descriptionOrder) {
      this.descriptionOrder = descriptionOrder;
   }

   public User getOrderOwner() {
      return this.orderOwner;
   }

   public void setOrderOwner(User orderOwner) {
      this.orderOwner = orderOwner;
   }

   public int getIndexOrder() {
      return this.indexOrder;
   }

   public void setIndexOrder(int indexOrder) {
      this.indexOrder = indexOrder;
   }

}
