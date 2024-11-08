
package busquedabinaria;

public class BusquedaBinaria {


    public static void main(String[] args) {
        
        int A [] = {104,213,358,479,511,630,721,845,923,1023,1154,1300,1450};
        int pos = BusquedaBinaria(A, 630);
        
        if (pos == -1){
            System.out.println("El dato no se encuentra en el Vector");
        }else{
            System.out.println("El dato se encuenta en la posicion " +pos);
        }
    }   
    
    public static int BusquedaBinaria(int [] A, int dato){
        int inicio,fin,mitad;
        inicio = 0;
        fin = A.length - 1;
        
        while(inicio <= fin){
            mitad = (inicio + fin)/2;
            if(A[mitad] == dato){
                return mitad;
            }else if(A[mitad] < dato){
                inicio = mitad + 1;
            }else{
                fin = mitad - 1;
            }
        }
        return - 1;
    }
    
}
