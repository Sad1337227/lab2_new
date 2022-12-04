import java.util.Random;
import java.util.Timer;

public class Rent {
  private int Area;
  private int PricePerSqM;

  public void Pay(Shop _shop) {
    System.out.println(Area * PricePerSqM + " has been payed");
    _shop.SetBank(_shop.GetBank() - Area * PricePerSqM);
    return;
  }

  Rent() {
    Random rand = new Random();

    Area = rand.nextInt(200 - 75) + 75;
    PricePerSqM = rand.nextInt(500 - 250) + 250;
  }
}