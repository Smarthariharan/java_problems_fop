public class findGreaterNumber {
  public static void main(String[] args) {
    int a = 95;
    int b = 150;
    int c = 1;

    int result = (a > b && a > c) ? a : (b > c) ? b : c;
    System.out.println(result + " is greater ");

    // if(a > b && a > c){
    // System.out.println(a +" is greater one");
    // }
    // else if (b > c){
    // System.out.println( b +" is greater one");
    // }
    // else{
    // System.out.println(c + " is greater one");
    // }
  }
}