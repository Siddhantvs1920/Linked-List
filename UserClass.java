package LinkList;

public class UserClass {
  public static void main(String[] args) {
      MyLinkList m = new MyLinkList();
      m.add(10);
      m.add(20);
      m.add(30);
      m.add(40);
      m.add(50);

      System.out.println(m);
      //Conatins Method of linklist
      boolean isConatain = m.contains(20);
      System.out.println(isConatain);
      //index of
      int p=m.indexOf(20 );
      System.out.println(p);
      //get method
      int getData=m.getData(2);
      System.out.println(getData);
      // is empty
      System.out.println(m.isEmpty());
      //Set Elemtnt
      m.set(3,100);
      System.out.println("updated Linklist");
      System.out.println(m);
      //size of
      int size=m.size();
      System.out.println(size);
      //Last index of
      int lastIndex=m.lastIndexOf(20);
      System.out.println(lastIndex);
      //remove index
      m.remove(0);
      System.out.println("After removing one  element"+m);
      //Clear method
      m.clear();
      System.out.println(m);
      //Add at method
      m.addAt(0,100);


  }}