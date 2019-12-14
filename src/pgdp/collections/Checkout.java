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

    public Queue<FishyProduct> getGetBandAfterCashier() {
        return getBandAfterCashier;
    }


    public Checkout(Queue<PenguinCustomer> queue, Queue<FishyProduct> bandBeforeCashier, Queue<FishyProduct> getBandAfterCashier) {
        this.queue = queue;
        this.bandBeforeCashier = bandBeforeCashier;
        this.getBandAfterCashier = getBandAfterCashier;
    }

    public  int queueLength(Queue<PenguinCustomer> t){
        return t.size();
    }

    void serveNextCustomer()
    {   int totalPay = 0;
        PenguinCustomer customer = queue.dequeue();
        var producte =customer.products;
        while (!producte.isEmpty()) {
            var nextel = producte.pop();
            totalPay += nextel.getPrice();// sum price
            bandBeforeCashier.enqueue(nextel);
        }

        customer.pay(totalPay);

    }

}

