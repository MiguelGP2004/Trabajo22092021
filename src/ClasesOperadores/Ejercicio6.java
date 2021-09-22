
package ClasesOperadores;

public class Ejercicio6 {


    public static void main(String[] args) {
        
        int ladoCuadrado = 8; 
        int area = ladoCuadrado*ladoCuadrado;
        System.out.println("El area es : " + area);
        int perimetro = ladoCuadrado+ladoCuadrado+ladoCuadrado+ladoCuadrado; 
        System.out.println("el perimetro es : " + perimetro);
        
        int basetriangulo = 9;
        int alturatriangulo = 8; 
        int ladounotriangulo = 8;
        int ladodostriangulo = 8;
        int area1 =  basetriangulo*alturatriangulo;
        System.out.println("El area es : "+area1);
        int perimetro1 = ladounotriangulo+ladodostriangulo+basetriangulo; 
        System.out.println("El perimetro es : "+perimetro1);
        
        int baserectangulo = 8;
        int alturarectangulo = 6;
        int area2 = baserectangulo*alturarectangulo;
        System.out.println("El area es : "+area2);
        int perimetro2 = baserectangulo+baserectangulo+alturarectangulo+alturarectangulo; 
        System.out.println("El perimetro es : "+perimetro2);
        
        

    }
    
}
