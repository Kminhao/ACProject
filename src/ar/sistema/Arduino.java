
package ar.sistema;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Arduino {
    private double litros;
    private double litragemTotal;
    private Calendar calendario;
    private int hora;
    private int minuto;
    private int dia;
    private int mes;
    private int ano;
    private String dataPorExtenso;
    //private ArrayList<double, Calendar> consumo;
    
    public Arduino(double litro, Calendar data){
        this.litros = litro;
        this.litragemTotal += litro;
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
    
    public double getLitros() {
        return litros;
    }
    public void setLitros(double litros) {
        this.litros += litros;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void alterarData(Calendar cal){
        
        this.dia = cal.get(Calendar.DAY_OF_MONTH);
        this.mes = cal.get(Calendar.MONTH);
        this.ano = cal.get(Calendar.YEAR);
        this.hora = cal.get(Calendar.HOUR_OF_DAY);
        this.minuto = cal.get(Calendar.MINUTE);
        this.dataPorExtenso = dia+"/"+mes+"/"+ano;
        
    }

    public String getDataPorExtenso() {
        return dataPorExtenso;
    }
    public static void main(String args[]){ //main para testar as variaveis...
        
        
        Calendar calendario = Calendar.getInstance();  /*o sistema vai ter que atribuir aqui na hora e a 
                                                            agua for pra outro lugar a instancia do calendar*/
        Arduino arduino = new Arduino(40, calendario);
        System.out.println("Data: " + arduino.dataPorExtenso + "\r\nHora: " + arduino.hora + "h" + arduino.minuto);
        
    }
    
}
