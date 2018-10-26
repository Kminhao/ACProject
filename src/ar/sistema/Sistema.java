
package ar.sistema;

import java.util.Calendar;
import java.util.Scanner;

public class Sistema extends Thread{
    private static Arduino arduino;
    private boolean boia;
    private Calendar data;
    Scanner in = new Scanner(System.in);
    public void statusBoia(boolean boia){
        if(boia){
            double litros = 10;
            System.out.println("Valvula aberta, ");
            valvulaAberta(litros);
        }else{
            System.out.println("Agua não atingiu o esperado, valvula se mantem fechada");
        }
    }
    public void valvulaAberta(double litros){
        Calendar cal = Calendar.getInstance(); 
        if(arduino == null){
            
            arduino = new Arduino(litros, cal);
            System.out.println(litros + "L foram reaproveitados em " + arduino.getDataPorExtenso() + " as " + arduino.getHora() + ":" + arduino.getMinuto());
        }else{
            arduino.setLitros(litros); 
            arduino.alterarData(cal);
            System.out.println(litros + "L foram reaproveitados em " + arduino.getDataPorExtenso() + " as " + arduino.getHora() + ":" + arduino.getMinuto());
        }
        enviarRelatorio(); 
            
    }
    
    public boolean enviarRelatorio(){
        //enviar o pdf para o usuario.
        return false;
    }
    
    public void run(){
        
       
        
        while(true){
            // boia = false; // = valor que vir do Serial do arduino (boolean ou int)
            boia = in.nextBoolean();
            statusBoia(boia);   
        }
        
        
    }
    
}
