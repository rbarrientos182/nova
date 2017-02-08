/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtilidades;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rbarrientos
 */
public class Herramientas {
    private int dato;
    private int cont=1;
    private String num="";
    
    
    public boolean validarEmail(String correo){
       boolean resp;
       Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
       Matcher mat = pat.matcher(correo);
       if(mat.find()){
          resp = true; 
          System.out.println("Correo Válido");
       }else{
          resp = false;
          System.out.println("Correo No Válido");
       }
        
        return resp;
    }
    
    public boolean validarPass(String pass){
        boolean resp;
        Pattern pat = Pattern.compile("[A-Za-z0-9]{5,10}");
        Matcher mat = pat.matcher(pass);
        if (mat.matches()) {
           resp= true; 
           System.out.println("SI");
        } else {
            resp = false;
            System.out.println("NO");
        }
        
        return resp;
        
    }
    
    public void generarCodigo(int dato) {
        this.dato = dato;
          
           if((this.dato>=1000) || (this.dato<10000)) 
           {
               int can=cont+this.dato;
               num = "" + can; 
           }
           if((this.dato>=100) || (this.dato<1000))
           {
               int can=cont+this.dato;
               num = "0" + can; 
           }
           if((this.dato>=9) || (this.dato<100)) 
           {
                int can=cont+this.dato;
               num = "00" + can; 
           }
           if (this.dato<9)
           {
               int can=cont+this.dato;
               num = "000" + can; 
           }
          
    }

    public String serie()
    {
        return this.num;
    }
    
    public String obtenerFechaActualAAAAMMDD(){
        Calendar c = new GregorianCalendar();
        String anio, mes, dia, fecha;
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        anio = Integer.toString(c.get(Calendar.YEAR));
        
        fecha = anio+"-"+mes+"-"+dia;
        return fecha;
        
    }
    
}
