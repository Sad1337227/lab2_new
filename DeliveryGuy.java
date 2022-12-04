import java.util.Random;

public class DeliveryGuy {

  private String Name;
  private int Money;

  public String GetName() { return Name; };
  public void SetName(String Name) { this.Name = Name; };

  public int GetMoney() { return Money; };

  public void TryDeliver(Shop shop) {

    Random rand = new Random();

    for (int i = 0; i < shop.Products.size(); ++i) {
      Product prod = shop.Products.get(i);
      if (prod.GetQuantity() < 1 && (rand.nextInt(2)) == 1) {

        int rand_quantity = rand.nextInt(10 - 3) + 3;
        prod.SetQuantity(rand_quantity);

        int price_to_pay = rand_quantity * prod.GetPrice();
        shop.SetBank(shop.GetBank() - price_to_pay);

        System.out.println(GetName() + " has delivered " + rand_quantity + " " +
                           prod.GetName());
      }
    }

    return;
  }
  
  DeliveryGuy() {
    Random rand = new Random();

    int rand_name_ind = rand.nextInt(Names.cust_names.length);
    SetName(Names.cust_names[rand_name_ind]);
  }
}