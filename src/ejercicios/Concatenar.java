public class Concatenar{

     public static void main(String []args){
        
        String[] arreglo = new String[]{ "Am", "ad", "eus"};
        String resultado = concatenar(arreglo);
        System.out.println(resultado);
     }
     
     public static String concatenar(String a, String b){
         return a+b;
     }
     public static String concatenar(String[] arreglo){
         
         String resultado = ""; 
         
         for( String i : arreglo)
             resultado += i;
             
         return resultado;
     }
     
}
