package task3;

public class Task3 {
  String a = "Wow"; //changed the new Object String instance to string literal to store on String pool;
  String b = "Wow"; //String intern pool
  String c = a + "!"; // Heap object "Wow" then concatenate "!";
  String d = c; // Heap object "Wow"

  boolean b1 = a == b; // the new Object String is stored in the heap, b string is stored in the string intern pool resulting in false -> now true;
  boolean b2 = d.equals(b + "!"); // object "Wow" compared to String pool "Wow" but equals() method compares the content not the type -> now true;
  boolean b3 = !c.equals(a); // object "Wow" compared to object "Wow" -> concatenated "!" -> now true;

  public static void main(String[] args) {
    Task3 t = new Task3();

    if(t.b1&&t.b2&&t.b3) {
      System.out.println("Success!");
    }
    
  }
}
