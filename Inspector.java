import java.util.ArrayList;
import java.util.Random;

public class Inspector {
  private String Name;
  private int Defections;

  public String GetName() {
    return Name;
  };
  public void SetName(String Name) {
    this.Name = Name;
  };

  public int GetDefections() {
    return Defections;
  };
  public void IssueDefect(Shop _shop) {
    for (int i = 0; i < _shop.Products.size(); ++i)
      if (_shop.Products.get(i).IsExpired()) {
        _shop.Products.get(i).Subtract();
        Defections++;
      }
    // System.out.println(GetName() + " has issued a defect for " + product.GetName()
    //     + " because of its expiration date.");
  }

  Inspector() {
    Random rand = new Random();

    int rand_name_ind = rand.nextInt(Names.cust_names.length);
    SetName(Names.cust_names[rand_name_ind]);
    Defections = 0;
  }
}