    package pgdp.collections;

    public class PenguinSupermarket {
        public Checkout[] getCheckouts() {
            return checkouts;
        }

        public Checkout[] checkouts;

        public PenguinSupermarket(int numberOfCheckouts){
            checkouts = new Checkout[numberOfCheckouts];
            for (int x = 0; x < checkouts.length; x++) {
                checkouts[x] = new Checkout();
            } 
        }

       public Checkout getCheckoutWithSmallestQueue() {
            int minLen = 99999;
            Checkout ch = null  ;
            for (var checkout : checkouts) {
                if (checkout.queueLength() < minLen) {
                    ch = checkout;
                    minLen = checkout.queueLength();
                }
            }
            return ch; 
        }

       public void closeCheckout(int index){
            if (index > checkouts.length - 1) {
                ExceptionUtil.illegalArgument("Checkout index is larger than the number of checkout available");
            }

            if (checkouts.length == 1) {
                ExceptionUtil.illegalArgument("Cannot close the checkout, only one available");
            }

            var targetCheckout = checkouts[index];
            var queue = targetCheckout.getQueue();

            var stack = new LinkedStack<PenguinCustomer>();
            for (int x = 0; x < queue.size(); x++) {
                stack.push(queue.dequeue());
            }

            // remove checkout by allocating a new array
            Checkout[] newCheckouts = new Checkout[checkouts.length - 1];
            var nextIndex = 0;
            for (int x = 0; x < checkouts.length; x++) {
                if (x != index) {
                    newCheckouts[nextIndex++] = checkouts[x];
                }
            }

            checkouts = newCheckouts;
            while (!stack.isEmpty()) {
                var customer = stack.pop();
                customer.goToCheckout(this);
            }
        } 

        public void  serveCustomers (){
            for (var checkout :
                    checkouts) {
                while(checkout.queueLength() != 0) {
                    checkout.serveNextCustomer();
                }
            }
        }
    }
