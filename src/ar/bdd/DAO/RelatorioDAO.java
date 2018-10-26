/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.bdd.DAO;

import ar.bdd.conexao.*;
import ar.bdd.model.Relatorio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RelatorioDAO {

    private Conexao conexao;
    
    public Relatorio cidadao;
    
    public RelatorioDAO(){
        conexao = new Conexao();
        conexao.configurar();
    }

    
    
    
    public boolean inserir(String data, String hora, double litros){
      String sql = "insert into Relatorio(data, hora, litros)"
              + "values('"  + data + "','" + hora +"', '" + litros +"')" ;
        

        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    
}

