
package curp;

import java.util.HashMap;

public class Datos {
   private String nombre,apellido_paterno,apellido_materno;
    private char sexo;
    private String dia,mes,axo;
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
        String diaa=dia;
        return diaa;
    }
    public void setDia(String d){
        dia=d;
       
    }
    
    public String getMes(){
        return mes; 
    }
    public void setMes(String m){
        mes=m;
       
    }
    public String getAxo(){
        return axo;
    }
    public void setAxo(String a){
        axo=a;
       
    }
   public char getLugar_nac(){
       char a=lugar_nac.trim().charAt(0);
     return a;
    }
   public char getLugar_nac2(){
       int n=lugar_nac.length();
       // Determina la ultima letra de la palabra y la almecena en la variable b
       char b=lugar_nac.trim().charAt(n-1);
     return b;
    }
    public void setLugar_nac(String ln){
        lugar_nac=ln;
       
    }
   
    //array de estados
    public String[] arrayEstados={"AGUASCALIENTES", "BAJACALIFORNIA","BAJACALIFORNIASUR","CAMPECHE","COAHUILA",
                                  "COLIMA","CHIAPAS", "CHIHUAHUA", "DISTRITOFEDERAL", "DURANGO", "GUANAJUATO", 
                                  "GUERRERO", "HIDALGO","JALISCO","MEXICO" ,"MICHOACAN","MORELOS", "NAYARIT",
                                  "NUEVOLEON", "OAXACA","PUEBLA","QUERETARO","QUINTANAROO","SANLUISPOTOSI",
                                  "SINALOA","SONORA", "TABASCO","TAMAULIPAS","TLAXCALA","VERACRUZ",
                                  "YUCATAN","ZACATECAS","EXTRANJERO"};
    
    
    //array de codificacion de estados
    public String[] valor={"AS","BC","BS","CC", "CL","CM","CS","CH","DF","DG","GT","GR","HG",
                             "JC","MC","MN","MS","NL","OC" ,"PL","QT","QR","SP","SL","SR","TC",
                             "TS","TL","VZ","YN" ,"ZS","NE" };
   
    
    public String generarCodigoEstado(String lugar_nac){
        // Coleccion de key-value
        HashMap<String,String> estados=new HashMap<String,String>();
        
        //Llenado de Coleccion con elementos de los arrays anteriores
            for(int i=0;i<valor.length;i++){
                 estados.put(arrayEstados[i] ,valor[i]);   
            }
         // busqueda de key que sea igual al lugar de Nacimiento
         //  para rtornar el codigo del Estado
        return estados.get(lugar_nac);
    }
    
    
public char consonantes(String nombre){
    int cons=0;
    char[] charnom;
   
    int v=nombre.length();
    charnom= new char[v];
    
    char consonante='-';
    
    // llenado de un array de Tipo caracter 
    for (int i = 0; i < v; i++) {
        charnom[i]=nombre.charAt(i);
    }
    
    // Recorrido del array para determinar si es consonante
    for (int i = 0; i < v; i++) {
         if (charnom[i] =='A'|| charnom[i]=='E'||charnom[i]=='I'|| charnom[i]=='O'||charnom[i]=='U'){
               
         }else{
            // System.out.println("letra "+charnom[i]+" posicion "+i);
            // llevar conteo de cuantas consonates hay en la palabra
            cons++;
            // determina si es la Segunda consonante de la palabra
            if (cons==2){
                //guarda la Segunda consonante
                consonante=charnom[i];
            }
            
         }
    }
    
    //System.out.println("HAy "+cons+ " consonantes en la palaba");
    //System.out.println(consonante);
    return consonante;
}    
  
    












    
}
