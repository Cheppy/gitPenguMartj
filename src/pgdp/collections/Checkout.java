package pgdp.collections;

public class Checkout {
    Queue<PenguinCustomer> queue;
    Queue<FishyProduct> bandBeforeCashier;
    Queue<FishyProduct> getBandAfterCashier;


    public Queue<PenguinCustomer> getQueue() {
        return queue;
    }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return bandBeforeCashier;
    }

    public Queue<FishyProduct> getBandAfterCashier() {
        return getBandAfterCashier;
    }
 
  

    public Checkout() {
        queue = new LinkedQueue<PenguinCustomer>();
        bandBeforeCashier = new LinkedQueue<FishyProduct>();
        getBandAfterCashier = new LinkedQueue<FishyProduct>();
    }

    public  int queueLength(){
        return queue.size();
    }

    public void serveNextCustomer() 
    {
        PenguinCustomer customer = queue.dequeue();
        while (!customer.products.isEmpty()) {
            bandBeforeCashier.enqueue(customer.products.pop());
        }

        int amountToPay = 0;
        while(!bandBeforeCashier.isEmpty())  {
            var item = bandBeforeCashier.dequeue();
            amountToPay += item.getPrice();
            getBandAfterCashier.enqueue(item);
        }
        customer.pay(amountToPay);
        customer.takeAllProductsFromBand(getBandAfterCashier);
    }

}


