package pgdp.collections;

interface DataStructureConnector<T> {
  boolean hasNextElement ();
  void addElement (T value);
  T removeNextElement ();//

}
