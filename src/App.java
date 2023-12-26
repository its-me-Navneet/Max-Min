public class App<T extends Comparable<T>> { 

    T a,b,c ,max ;

    App(T a,T b,T c){
        this.a =a;
        this.b=b ;
        this.c =c;  
        this.max = this.findMaximum(a, b, c) ;
    }
    App(){

    } 
    public T findMaximum(T value1, T value2, T value3) {
        T max = value1;

        if (value2.compareTo(max) > 0) {
            max = value2;
        }

        if (value3.compareTo(max) > 0) {
            max = value3;
        }

        return max;
    }

    public static void main(String[] args) {  

        //...........   Integer ......
        Integer a=5 ;
        Integer b=8 ;
        Integer c=3 ;
        App<Integer> integerFinderTc1 = new App<>(a,b,c);  
        System.out.println("maximum value is " + integerFinderTc1.max);
        App<Integer> integerFinderTc2 = new App<>(b,a,c); 
         System.out.println("maximum value is " + integerFinderTc2.max);
        App<Integer> integerFinderTc3 = new App<>(a,c,b); 
         System.out.println("maximum value is " + integerFinderTc3.max);
    

        //  .......Double......... 

        Double p =5.5 ;
        Double q= 6.5 ;
        Double r =7.5 ;

          App<Double> DoubleFinderTc1 = new App<>(p,q,r);  
        System.out.println("maximum value is " + DoubleFinderTc1.max);
        App<Double> DoubleFinderTc2 = new App<>(p,r,q); 
         System.out.println("maximum value is " + DoubleFinderTc2.max);
        App<Double> DoubleFinderTc3 = new App<>(r,p,q); 
         System.out.println("maximum value is " + DoubleFinderTc3.max); 


         // ....string ..........

         String x="Apple" ;
         String y="App" ;
         String z= "Appp" ;
         
          App<String> StringFinderTc1 = new App<>(x,y,z);  
        System.out.println("maximum value is " + StringFinderTc1.max);
        App<String> StringFinderTc2 = new App<>(x,z,y); 
         System.out.println("maximum value is " + StringFinderTc2.max);
        App<String> StringFinderTc3 = new App<>(z,x,y); 
         System.out.println("maximum value is " + StringFinderTc3.max); 


    }
}
