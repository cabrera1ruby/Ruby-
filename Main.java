import java.util.*; 
public class Main {
   public static void main(String[] args) {  
// create a hashmap mapping charcters of twilight to a fact about them
  HashMap<Character, String> twilightCharacter= new HashMap<>();
  twilightCharacter.put('B', "Bella swan - main protagonist of the twilight movie");
    twilightCharacter.put('D', "Edward Cullen - vapire that wanted bella");
   // Jesus Gamarra
  Scanner scanner = new Scanner(System.in);
  System.out.println("which twilight character would you like to know facts about?(Enter the first letter of the character)");
  char character = scanner.next().charAt(0);
  // print the fact related to the chosen character 
  String fact = twilightCharacter.get(character);
  if(fact != null){
       System.out.println(fact);
  }else{
    System.out.println("character not found. please enter vaild character.");
      }
}}
