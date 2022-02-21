Package palindromo;
	

	import java.util.Scanner;
	public class Palindromo {
	

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	       Scanner s = new Scanner (System.in);
	       String palabra;
	       char [] palindromo;
	       int izq, der;
	       System.out.println("Ingresa la palabra");
	       palabra = s.nextLine();
	       palabra = palabra.toLowerCase();
	       palabra = palabra.replace(" ","");
	       palindromo = palabra.toCharArray();
	       izq = 0;
	       der = palindromo.length - 1 ;
	       
	       
	       while(izq < der){
	           if(palindromo[izq] == palindromo[der]){
	               der --;
	               izq++;
	           }else{
	               System.out.println("La palabra no es un palindromo");
	               break;
	           }
	       }
	       
	       if (izq == der){
	           System.out.println("La palabra es un palindromo");
	       }
	    }
	    
	}

        
        
       
        
        
    }
    
}
