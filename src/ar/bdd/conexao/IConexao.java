/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.bdd.conexao;

import ar.*;


public interface IConexao {
    public String MYSQL = "mysql";
    //public String POSTGRES= "postgresql";
    public String CLASSNAME_MYSQL = "com.mysql.jdbc.Driver";
    //public String CLASSNAME_POSTGRESQL="org.postgresql.Driver";
    public String PORT_MYSQL = "3306";
    //public String PORT_POSTGRESQL = "5432";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    public void configurar();
}   