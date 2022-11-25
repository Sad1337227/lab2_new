import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Random;

public class Main {

  public static void print_int(String message, int sz) {
    System.out.println(message + sz);
    return;
  }
  public static void main(String[] args) {
    Shop shop = new Shop();
    Random rand = new Random();

    ArrayList<PoorCustomer> customers_p = new ArrayList<PoorCustomer>();
    ArrayList<MediumCustomer> customers_m = new ArrayList<MediumCustomer>();
    ArrayList<RichCustomer> customers_r = new ArrayList<RichCustomer>();
    ArrayList<Robber> robbers = new ArrayList<Robber>();

    for (int i = 0; i < 15; ++i) {
      customers_p.add(new PoorCustomer());
      customers_m.add(new MediumCustomer());
      customers_r.add(new RichCustomer());
      robbers.add(new Robber());
    }

    // fill the  lists

    // print_int("There are poor customers : ", customers_p.size());
    // print_int("There are med customers : ", customers_m.size());
    // print_int("There are rich customers : ", customers_r.size());
    // print_int("There are robbers : ", robbers.size());

    while (true) {
      int rand_ind = -1;
      int rand_list = rand.nextInt(3);

      Product prod = shop.ServeCustomer(rand_list);

      switch (rand_list) {
      case 0: {
        rand_ind = rand.nextInt(customers_p.size());
        customers_p.get(rand_ind).Buy(prod);
        break;
      }
      case 1: {
        rand_ind = rand.nextInt(customers_m.size());
        customers_m.get(rand_ind).Buy(prod);
        break;
      }
      case 2: {
        rand_ind = rand.nextInt(customers_r.size());
        customers_r.get(rand_ind).Buy(prod);
        break;
      }
      }
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      }
    }
  }
}