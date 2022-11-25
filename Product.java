import java.util.Random;

public class Product {

  private String Name;
  private int Price;
  private int Quantity;

  public String GetName() { return Name; };
  public void SetName(String Name) { this.Name = Name; };

  public int GetPrice() { return Price; };
  public int GetQuantity() { return Quantity; };
  public Boolean CanSell() { return Quantity > 0; };
  public void Subtract() {
    if (Quantity > 0)
      Quantity -= 1;
    return;
  }

  Product() {
    Random rand = new Random();

    int rand_name_ind = rand.nextInt(Names.prod_names.length);
    Name = Names.prod_names[rand_name_ind];
    Quantity = rand.nextInt(100 - 25) + 25;
    Price = rand.nextInt(100 - 25) + 25;
  }
}