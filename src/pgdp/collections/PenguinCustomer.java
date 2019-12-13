package pgdp.collections;

public class PenguinCustomer
{
    String Name;
    int Money;
    Stack<FishyProduct> products;
    Stack<FishyProduct> band;

    public String getName() {;
        return Name;
    }

    public int getMoney() {
        return Money;
    }

    public Stack<FishyProduct> getProducts() {
        return products;
    }

    public  void addProductToBasket (FishyProduct fishyProduct){
        products.push(fishyProduct);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> fishyProductQueue){
        DataStructureLink  dlink= new DataStructureLink();
        dlink.moveAllFromAToB();

    }

    public void takeAllProductsFromBand(Queue<FishyProduct> fishyProductQueue) {
    //take to bought
    }

    public void pay(){

        for (p:band) {
            this.Money-=p.();
        }
    }
}
