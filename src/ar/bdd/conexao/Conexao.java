/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.bdd.conexao;

import ar.*;

public class Conexao extends ConexaoAbstract {

    public Conexao() {

    }

    @Override
    public void configurar() {
        this.port = PORT_MYSQL;
        this.className = CLASSNAME_MYSQL;
        this.setConexao(MYSQL, "Teste", "localhost"); //MYSQL, NOMECONEXÃO, IP
        this.setLogin("root", "aluno123");        //LOGIN, SENHA 
    }

}