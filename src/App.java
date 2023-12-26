public class App {

     private static String maxEement(String a,String b,String c) {
        
        String maxOfTwo = (a.compareTo(b) >0 ? a:b) ; 
        String maximumElement = (maxOfTwo.compareTo(c) >0 ? maxOfTwo :c) ;
        return maximumElement ;
     
    }
    public static void main(String[] args) throws Exception {
      

          System.out.println("Program to find max of 3 over differnt data types");
        
          String a="Apple";
          String b="App";
          String c="Aaat" ;
        String maxTC1 = maxEement(a,b,c) ; 
        System.out.println(maxTC1);
        String  maxTC2 = maxEement(a,c,b) ; 
        System.out.println(maxTC2);
        String maxTC3 = maxEement(c,b,a) ; 
        System.out.println(maxTC3);
    
       
   

    }

   
}
