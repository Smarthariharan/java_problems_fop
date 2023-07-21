public class findMonthSwitchCase {
  
   public static void main(String[] args) {
    
   
    int number = 2; 

    switch (number) {
        case 1,3,5,7,8,10,12:
            System.out.println("31");
            break;

        case 4,6,9,11:
            System.out.println("30");
            break;


          case 2:
          System.out.println("28");
          break;
          

         default:
        System.out.println("Invalid month");
            break;
    }
}
}
