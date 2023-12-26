import java.util.Arrays;

public class App<T extends Comparable<T>> { 

    T a[],max ;

    App(T a[]){
        this.a =a;
        findMaximum(a);
    }
    App(){

    } 

    public void findMaximum(T []values) {
       
        Arrays.sort(values);

        int size = values.length;
           
        this.max = values[size-1]; 
        printMax();
    }
    public void printMax(){
        System.out.println("Maximum element of all is " + max);
    }

    public static void main(String[] args) {  

        //...........   Integer ......
        Integer []a = {5,10,12} ;
        Integer []b = {5,12,10} ;
        Integer []c = {12,10,1} ;
        App<Integer> integerFinderTc1 = new App<>(a);  
        App<Integer> integerFinderTc2 = new App<>(b); 
        App<Integer> integerFinderTc3 = new App<>(c); 
    

        //  .......Double......... 

        Double p[] ={5.5,6.5,7.5} ;
        Double q []= {6.5,7.5,5.5} ;
        Double r[] ={7.5,6.5,5.5} ;

          App<Double> DoubleFinderTc1 = new App<>(p);  
     
        App<Double> DoubleFinderTc2 = new App<>(q); 
     
        App<Double> DoubleFinderTc3 = new App<>(r); 
        

         // ....string ..........

         String x[]={"Apple","App","Appp"} ;
         String y[]={"App","Apple","Appp"} ;
         String z[]={ "Appp","App","Apple"} ;
         
          App<String> StringFinderTc1 = new App<>(x);  
          App<String> StringFinderTc2 = new App<>(y); 
          App<String> StringFinderTc3 = new App<>(z); 
       

    }
}
