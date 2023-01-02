class Stringtask9{
 public static void  main(String [] agrs){
  String word = "I love Cpp and Cpp";
  String newWord = word.replaceAll("Cpp","Java");
  
  System.out.println("Word: "+word);
  System.out.println("New word: "+newWord);

  System.out.println();
  System.out.println();

  String newWord2 = word.replaceFirst("Cpp","Java");
  System.out.println("NewWord2: "+newWord2);
  }
 }