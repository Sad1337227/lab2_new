import java.util.Random;

public class RichCustomer {

  private String Name;
  private int Money;

  public String GetName() { return Name; };
  public void SetName(String Name) { this.Name = Name; };

  public int GetMoney() { return Money; };
  public int Buy(Product product) {
    System.out.println(GetName() + " has bought " + product.GetName() +
                       " for " + product.GetPrice() + " yuans");
    Money -= product.GetPrice();
    return product.GetPrice();
  };
  RichCustomer() {
    Random rand = new Random();

    int rand_name_ind = rand.nextInt(Names.cust_names.length);
    SetName(Names.cust_names[rand_name_ind]);
    Money = rand.nextInt(10000 - 2500) + 2500;
  }
}