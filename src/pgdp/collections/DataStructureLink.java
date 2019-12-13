package pgdp.collections;

public class DataStructureLink {
  DataStructureConnector a,b;

    public  DataStructureLink(DataStructureConnector a, DataStructureConnector b){
 // public  DataStructureLink(){
    this.a =a;  //?
    this.b =b;
  }



  public boolean moveNextFromAToB() {
    if (!a.hasNextElement()) {
      return false;
    }
    var val = a.removeNextElement();

    b.addElement(val);
    return true;
  }

  public void moveAllFromAToB() {
    while (moveNextFromAToB()) {
    }
  }
}
