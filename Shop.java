import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {

  private String Name;
  private int Bank;
  private int CustomersServed;
  private int TimesRobbed;
  public List<Product> Products;

  public String GetName() { return Name; };
  public void SetName(String Name) { this.Name = Name; };

  public int GetBank() { return this.Bank; };
  public void SetBank(int bank) {
    Bank = bank;
    return;
  };
  public Product ServeCustomer(int Index) {

    Random rand = new Random();
    Product prod;
    int rand_product = -1;

    switch (Index) {
    case 0:
    case 1:
    case 2: {
      rand_product = rand.nextInt(3 - 0) + 0;
      break;
    }
    case 3:
    case 4:
    case 5: {
      rand_product = rand.nextInt(6 - 3) + 3;
      break;
    }
    case 6:
    case 7:
    case 8: {
      rand_product = rand.nextInt(9 - 6) + 6;
      break;
    }
    }

    prod = Products.get(rand_product);

    if (!prod.CanSell())
      ServeCustomer(Index);

    Products.get(rand_product).Subtract();

    System.out.println("There are " + prod.GetQuantity() + " " +
                       prod.GetName());

    return prod;
  };

  Shop() {
    Random rand = new Random();
    SetName("Chop-chop!");
    Bank = rand.nextInt(20000 - 5000) + 5000;
    CustomersServed = 0;
    TimesRobbed = 0;

    Products = new ArrayList<>();

    for (int i = 0; i < 9; i++) {
      Product _prod = new Product();
      Products.add(_prod);
    }
  }
}