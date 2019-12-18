package pgdp.collections;

public class DataStructureLink<T> {
  DataStructureConnector a,b;
  
  public DataStructureLink(DataStructureConnector a,DataStructureConnector b) {
	  this.a =a;
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
               