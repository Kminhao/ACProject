
package ar.sistema;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Arduino {
    private double litros;
    private Calendar calendario;
    private int hora;
    private int minuto;
    private int dia;
    private int mes;
    private int ano;
    private String dataPorExtenso;
    
    public Arduino(double peso, Calendar data){
        this.litros = peso;
        this.calendario = data;
        this.dia = calendario.get(Calendar.DAY_OF_MONTH);
        this.mes = calendario.get(Calendar.MONTH);
        this.ano = calendario.get(Calendar.YEAR);
        this.hora = calendario.get(Calendar.HOUR_OF_DAY);
        this.minuto = calendario.get(Calendar.MINUTE);
        this.dataPorExtenso = dia+"/"+mes+"/"+ano;
        
    }
    public Arduino(){
        
    }
    public static void main(String args[]){ //main para testar as variaveis...
        
        
        Calendar calendario = Calendar.getInstance();  /*o sistema vai ter que atribuir aqui na hora e a 
                                                            agua for pra outro lugar a instancia do calendar*/
        Arduino arduino = new Arduino(40, calendario);
        System.out.println("Data: " + arduino.dataPorExtenso + "\r\nHora: " + arduino.hora + "h" + arduino.minuto);
        
    }
    
}
