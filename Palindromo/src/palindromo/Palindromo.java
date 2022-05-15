
package palindromo;
import java.util.*;
/**
 *
 * @author jarvi
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println ("Determinar si una palabra es un palindromo: ");
  Scanner sc1=new Scanner(System.in);
  System.out.println("Escriba una palabra:");
  String palabra=sc1.next();
  char[] a=palabra.toCharArray();
  char[] ab=new char[palabra.length()];
  int i,j;
  for(i=0,j=palabra.length()-1;i<=palabra.length()-1;i++,j--) {
   ab[j]=a[i];
  }

  String compar=new String(ab);
  if(palabra.equals(compar)==true){
  System.out.println ("La palabra es un palindromo");

  
  }else{
       System.out.println ("La palabra no es un palindromo");} 
     
    }
    
}
