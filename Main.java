import java.util.ArrayList;
import java.util.List;

import Market.Market;
import Market.Order;
import Market.User;

public class Main {


   public static void main(String[] args) {
       List<User> users = new ArrayList<>();
       List<Order> orders = new ArrayList<>();
       users.add(new User("Олег","Невзоров","+375445476534",25));
       users.add(new User("Aндрей","Панов","+375445476535",21));
       users.add(new User("Иван","Киреев","+375445476536",18));
       users.add(new User("Кристина","Фамина","+375445476537",19));
       users.add(new User("Марина","Баранова","+375445476538",34));
       orders.add(new Order("Пылесос","Дайсон 213",users.get(0),23452452));
       orders.add(new Order("Фен","Дайсон 3456",users.get(1),23452452));
       orders.add(new Order("Соковыжималка","Дайсон 2345",users.get(2),23452452));
       orders.add(new Order("Блендерс","Дайсон 567",users.get(3),23452452));
       orders.add(new Order("Стиральная машина","Дайсон 1233",users.get(1),23452452));
       orders.add(new Order("Ноутбук","Дайсон 6433",users.get(2),23452452));
       orders.add(new Order("ПК","Дайсон 543563",users.get(0),23452452));
       orders.add(new Order("Чайник","Дайсон 1341",users.get(1),23452452));
       orders.add(new Order("Электроплита","Дайсон 36535",users.get(4),23452452));
       orders.add(new Order("Венилятор","Дайсон 356",users.get(0),23452452));
       Market internetMarket = new Market("BestShop");
       internetMarket.addShoper(users);
       internetMarket.addOrder(orders);
       internetMarket.queue();

   }
}
