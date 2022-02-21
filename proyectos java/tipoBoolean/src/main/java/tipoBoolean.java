
public class tipoBoolean {
    
    public static void main(String[] args) {
        
        //boolean
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);
        
        boolean booleanVar = false;
        
        if(booleanVar){
            System.out.println("si el valor es verdadero");
        }
        else{
            System.out.println("si el valor es falso");
        }
        
        System.out.println("");
        
        var edad = 30;
        var esAdulto = edad >= 18;
        System.out.println("esAdulto = " + esAdulto);
        
        
        
    }
    
    
    
}
