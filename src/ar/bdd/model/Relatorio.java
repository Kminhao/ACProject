/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.bdd.model;

import ar.bdd.DAO.RelatorioDAO;


public class Relatorio {
    
    private String data;
    private String hora;
    private double litros;       //MUDA PRA STRING DPS
    
    public Relatorio(){
        RelatorioDAO dao = new RelatorioDAO();
        
    }
    
    public Relatorio(String data, String hora, double litros){
            RelatorioDAO dao = new RelatorioDAO();
            this.data = data;
            this.hora = hora;
            this.litros = litros;
            
    }

        
    public boolean enviar(){
        
        boolean b = dao.inserir(data, hora, litros);
        return b;
    }
    
    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    
    
}
