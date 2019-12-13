package pgdp.collections;

public class PenguinSupermarket {
    public Checkout[] getCheckouts() {
        return checkouts;
    }

    public Checkout[] checkouts;

    public PenguinSupermarket(int money){

    }


   // Checkout getCheckoutWithSmallestQueue (){
  //  return Checkout null;}

    public static Checkout[] removeTheElement(Checkout[] arr,
                                         int index)
    {
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }


        Checkout[] anotherArray = new Checkout[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {


            if (i == index) {
                continue;
            }


            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    void CloseCheckout (int index){
        removeTheElement(checkouts, index);
        }



    void  serveCustomers (){
        serveNextCustomer ();
    }

    void serveNextCustomer(){

    }
}
