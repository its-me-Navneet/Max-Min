public class App {

     private static int maxEement(Integer a,Integer b,Integer c) {
        
        Integer maxOfTwo = (a.compareTo(b)==-1 ? b:a) ;
        int maximumElement = (maxOfTwo.compareTo(c) == -1 ? c:maxOfTwo) ;
        return maximumElement ;
     
    }
    public static void main(String[] args) throws Exception {
      

          System.out.println("Program to find max of 3 over differnt data types");
        
          Integer a=10 ;
          Integer b=20 ;
          Integer c=30 ;
        int maxTC1 = maxEement(a,b,c) ; 
        System.out.println(maxTC1);
        int maxTC2 = maxEement(a,c,b) ; 
        System.out.println(maxTC2);
        int maxTC3 = maxEement(c,b,a) ; 
        System.out.println(maxTC3);
    
       
   

    }

   
}
