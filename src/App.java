import java.util.Arrays;

public class App<T extends Comparable<T>> { 

    T a[],max ;

    App(T a[]){
        this.a =a;
        
        this.max = this.findMaximum(a) ;
    }
    App(){

    } 

    public T findMaximum(T []values) {
       
        Arrays.sort(values);

        int size = values.length;

        return values[size-1];
    }

    public static void main(String[] args) {  

        //...........   Integer ......
        Integer []a = {5,10,12} ;
        Integer []b = {5,12,10} ;
        Integer []c = {12,10,1} ;
        App<Integer> integerFinderTc1 = new App<>(a);  
        System.out.println("maximum value is " + integerFinderTc1.max);
        App<Integer> integerFinderTc2 = new App<>(b); 
         System.out.println("maximum value is " + integerFinderTc2.max);
        App<Integer> integerFinderTc3 = new App<>(c); 
         System.out.println("maximum value is " + integerFinderTc3.max);
    

        //  .......Double......... 

        Double p[] ={5.5,6.5,7.5} ;
        Double q []= {6.5,7.5,5.5} ;
        Double r[] ={7.5,6.5,5.5} ;

          App<Double> DoubleFinderTc1 = new App<>(p);  
        System.out.println("maximum value is " + DoubleFinderTc1.max);
        App<Double> DoubleFinderTc2 = new App<>(q); 
         System.out.println("maximum value is " + DoubleFinderTc2.max);
        App<Double> DoubleFinderTc3 = new App<>(r); 
         System.out.println("maximum value is " + DoubleFinderTc3.max); 


         // ....string ..........

         String x[]={"Apple","App","Appp"} ;
         String y[]={"App","Apple","Appp"} ;
         String z[]={ "Appp","App","Apple"} ;
         
          App<String> StringFinderTc1 = new App<>(x);  
        System.out.println("maximum value is " + StringFinderTc1.max);
        App<String> StringFinderTc2 = new App<>(y); 
         System.out.println("maximum value is " + StringFinderTc2.max);
        App<String> StringFinderTc3 = new App<>(z); 
         System.out.println("maximum value is " + StringFinderTc3.max); 


    }
}
