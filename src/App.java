public class App {

     private static float maxEement(float a,float b,float c) {
        
        float maxOfTwo = (a>b ? a:b) ;
        float maximumElement = (maxOfTwo > c? maxOfTwo :c) ;
        return maximumElement ;
     
    }
    public static void main(String[] args) throws Exception {
      

          System.out.println("Program to find max of 3 over differnt data types");
        
          float a=10.20f ;
          float b=20.5f ;
          float c=30.5f ;
        float maxTC1 = maxEement(a,b,c) ; 
        System.out.println(maxTC1);
        float  maxTC2 = maxEement(a,c,b) ; 
        System.out.println(maxTC2);
        float maxTC3 = maxEement(c,b,a) ; 
        System.out.println(maxTC3);
    
       
   

    }

   
}
