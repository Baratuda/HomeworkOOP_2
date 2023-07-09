package Queue;
import Market.User;
import java.util.List;
import Market.Market;
import Market.Order;

public interface MarketBehavior {
   void addShoper(List<User> byuer);
   void byuerDeleter(User byuer);
   void updateMarket(Market market, List<Order> order, String action);
   void deleteOrder(List<Order> orders);
   void addOrder(List<Order> orders);
}
