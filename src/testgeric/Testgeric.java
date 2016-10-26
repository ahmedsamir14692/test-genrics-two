
package testgeric;


public class Testgeric {

    public static void main(String[] args) {
        
        NewClass ahmed  = new NewClass (); // ahmed is normal object of newclass
       ahmed.methode(ahmed);
       ahmed.o= ahmed;
         NewClass<Integer> ahmed2  = new NewClass<Integer> (); // ahmed is normal object of newclass
    //   ahmed2.methode(ahmed2);//  error
   int v= ahmed2.methode(56);
   Integer [] numes = new Integer [] {3,4,5};
  bounded<Integer> ahmed7  = new bounded<Integer> (numes);  
   
   
    }
    
}
