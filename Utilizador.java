/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Silva
 */
public class Utilizador {
    
    private String id_utilizador;
    private String password;

    public Utilizador(String id_utilizador, String password) {
        this.id_utilizador = id_utilizador;
        this.password = password;
    }

    public String getId_utilizador() {
        return id_utilizador;
    }

    public void setId_utilizador(String id_utilizador) {
        this.id_utilizador = id_utilizador;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "id_utilizador=" + id_utilizador + ", password=" + password + '}';
    }
    
 
    
}
