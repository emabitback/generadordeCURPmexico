
package curp;

public class Datos {
   private String nombre,apellido_paterno,apellido_materno;
    private char sexo;
    private int dia,mes,año;
    private String lugar_nac;
     private String entidad;
   
    
    public char getNombre(){
       char n=nombre.charAt(0);
        return n;
    }
    public void setNombre(String nom){
        nombre=nom;
       
    }
    
    public char getApellidoPaterno(){
        char ap=apellido_paterno.charAt(0);
        return ap ;
    }
    public char getApellidoPaterno2(){
        char ap=apellido_paterno.charAt(1);
        return ap ;
    }
    public void setApellidoPaterno(String apepat){
        apellido_paterno=apepat;
       
    }
    public char getApellidoMaterno(){
        char am=apellido_materno.charAt(0);
        return am;
    }
    public void setApellidoMaterno(String apemat){
        apellido_materno=apemat;
       
    }
    
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sex){
        sexo=sex;
       
    }
    public String getDia(){
        String diaa="0"+dia;
        return diaa;
    }
    public void setDia(int d){
        dia=d;
       
    }
    
    public int getMes(){
        return mes; 
    }
    public void setMes(int m){
        mes=m;
       
    }
    public int getAño(){
        return año;
    }
    public void setAño(int a){
        año=a;
       
    }
   public char getLugar_nac(){
       char a=lugar_nac.trim().charAt(0);
     return a;
    }
   public char getLugar_nac2(){
       int n=lugar_nac.length();
       char b=lugar_nac.trim().charAt(n-1);
     return b;
    }
    public void setLugar_nac(String ln){
        lugar_nac=ln;
       
    }
    
}
