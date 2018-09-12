
package curp;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Curp {

    
    public static void main(String[] args) {
       Datos dat=new Datos();
       Scanner lec=new Scanner(System.in);
       Random ran=new Random();
       
       
        System.out.println("   ******* Generador de Curp ******");
        System.out.println("Todos los datos que proporciones deven ser Mayusculas");
        
        System.out.println("Apellido paterno");
        String ap=lec.next();
        dat.setApellidoPaterno(ap);
        
        System.out.println("Apellido materno");
        String am=lec.next();
        dat.setApellidoMaterno(am);
        
        System.out.println("Nombre");
        String no =lec.next();
        dat.setNombre(no);
        
        System.out.println("Sexo   ('H' para hombre y 'M' para mujer)");
        char s=lec.next().charAt(0);
        dat.setSexo(s);
        
        System.out.println("   ****  FECHA DE NACIMIENTO ****");
        System.out.println("Dia");
        int d=lec.nextInt();
        dat.setDia(d);
        
        System.out.println("Mes"+"(Ejemplo : Febrero = 02)");
        int m=lec.nextInt();
        dat.setMes(m);
        
        System.out.println("Año"+"(Ejemplo: 1994= 94<-Solo los 2 ultimos digitos)");
        int a=lec.nextInt();
        dat.setAño(a);
        
        System.out.println("Estado de nacimiento");
        String ln=lec.next();
        dat.setLugar_nac(ln);
        
       
     int digito=ran.nextInt(1000);  
       
        JOptionPane.showMessageDialog(null,"SU CURP ES:  " + (dat.getApellidoPaterno()+""+dat.getApellidoPaterno2()+
                           ""+dat.getApellidoMaterno()+dat.getNombre()+""+dat.getAño()+
                ""+dat.getMes()+""+dat.getDia()+""+dat.getSexo()
                +dat.getLugar_nac()+""+dat.getLugar_nac2()+digito));
       
    }
    
}
