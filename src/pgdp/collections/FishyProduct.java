package pgdp.collections;

public class FishyProduct {

    public FishyProduct(String Name, int price) {
        this.Name = Name;
        Price = price;

        Name = Name;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }
      
    final String Name;
    final int Price;

    @Override
    public String toString() {
      if (Name == null && Price == 0){
          throw new IllegalArgumentException("wrong price or name");
      }
        String result = "[" + Name + "," + Price;
        return result + "]";
    }
}   