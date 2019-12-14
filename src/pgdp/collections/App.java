package pgdp.collections;

public class App{
  public static void main(String[] args){
    var fp = new FishyProduct("Micro Mac with Soft Fish", 1254);

    var penguinCustomer = new PenguinCustomer("Tux", 1337);
    penguinCustomer.addProductToBasket(fp);

    var penguinSupermarket = new PenguinSupermarket(2);

    penguinCustomer.goToCheckOut(penguinSupermarket);
    penguinSupermarket.closeCheckout(1);
    penguinSupermarket.serveCustomers();
  }
}
