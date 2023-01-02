class Stringtask2{
 public static void  main(String [] agrs){
  String word = "HELLO";
  String word2 = "Hello";
  String word3 = "hello";

  boolean res = word.equals(word2);
  boolean res1= word.equals(word3);

  boolean res3= word.equalsIgnoreCase(word3);

  System.out.println(res);
  System.out.println(res1);
  System.out.println(res3);
  }
 }