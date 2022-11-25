import java.util.Random;

public class Robber {

  private String Name;

  private Boolean Color;
  private int Money;
  private int ChanceToRob;

  public String GetName() { return Name; };
  public void SetName(String Name) { this.Name = Name; };

  public int GetMoney() { return Money; };
  public Boolean TryRob() { return true; };

  Robber() {
    Random rand = new Random();

    int rand_name_ind = rand.nextInt(Names.cust_names.length);
    SetName(Names.cust_names[rand_name_ind]);
    Money = 0;
    Color = true; // means the person is black (100% black)
    ChanceToRob = rand.nextInt(100);
  }
}