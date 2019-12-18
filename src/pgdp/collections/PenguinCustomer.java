package pgdp.collections;

public class PenguinCustomer {
    String Name;
    int Money;
    Stack<FishyProduct> products;
    Stack<FishyProduct> band;


    public PenguinCustomer(String name, int money) {
        this.Name = name;
        this.Money = money;

        products = new LinkedStack<FishyProduct>() ;
        band = new LinkedStack<FishyProduct>() ;
    }

    public String getName() {

        return Name;
    }

    public void goToCheckout(PenguinSupermarket supermarket){
        var checkout = supermarket.getCheckoutWithSmallestQueue();
        checkout.getQueue().enqueue(this);
    } 

    public int getMoney() {
        return Money;
    }

    public Stack<FishyProduct> getProducts() {
        return products;
    }

    public void addProductToBasket(FishyProduct fishyProduct) {
        products.push(fishyProduct);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> fishyProductQueue) {

            var link = new DataStructureLink(new StackConnector(products), new QueueConnector(fishyProductQueue));
        link.moveAllFromAToB();

    }

    public void takeAllProductsFromBand(Queue<FishyProduct> fishyProductQueue) {
        var link = new DataStructureLink(new QueueConnector(fishyProductQueue), new StackConnector(products));
        link.moveAllFromAToB();
    }
     

    public void pay(int sumToPay) {
        var money = this.Money;
        if (sumToPay<0){ throw new UnsupportedOperationException("sum is less than 0");}
        money -= sumToPay;
        if (money<0){throw  new UnsupportedOperationException("pengu in debt, error!");}
        this.Money =money;
    }   

    public int getFullPrice() {
        int totalPay = 0;
        while (!products.isEmpty()) {
            FishyProduct product = products.pop();
            totalPay += product.getPrice();// sum prices
            products.push(product);
        }


        return totalPay;
    }


}


