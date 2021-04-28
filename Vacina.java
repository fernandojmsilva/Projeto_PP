/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Silva
 */

public class Vacina {
  
  private String nome;
  private String codigo;
  private String fabricante;
  private int dose;
  private String restricao;
  private int n_administracao;
  private int limite_min_entredoses;
  private int limite_max_entredoses;
  private String efeito_secundario; //String ou ArrayList)

  public Vacina(String nome, String codigo, String fabricante, int dose, String restricao, int n_administracao, int limite_min_entredoses, int limite_max_entredoses, String efeito_secundario) {
     this.nome = nome;
     this.codigo = codigo;
     this.fabricante = fabricante;
     this.dose = dose;
     this.restricao = restricao;
     this.n_administracao = n_administracao;
     this.limite_min_entredoses = limite_min_entredoses;
     this.limite_max_entredoses = limite_max_entredoses;
     this.efeito_secundario = efeito_secundario;
  }

  public String getNome() {
     return nome;
  }

  public void setNome(String nome) {
     this.nome = nome;
  }

  public String getCodigo() {
     return codigo;
  }

  public void setCodigo(String codigo) {
     this.codigo = codigo;
  }

  public String getFabricante() {
     return fabricante;
  }

  public void setFabricante(String fabricante) {
     this.fabricante = fabricante;
  }

  public int getDose() {
     return dose;
  }

  public void setDose(int dose) {
     this.dose = dose;
  }

  public String getRestricao() {
     return restricao;
  }

  public void setRestricao(String restricao) {
     this.restricao = restricao;
  }

  public int getN_administracao() {
     return n_administracao;
  }

  public void setN_administracao(int n_administracao) {
     this.n_administracao = n_administracao;
  }

  public int getLimite_min_entredoses() {
     return limite_min_entredoses;
  }

  public void setLimite_min_entredoses(int limite_min_entredoses) {
     this.limite_min_entredoses = limite_min_entredoses;
  }

  public int getLimite_max_entredoses() {
     return limite_max_entredoses;
  }

  public void setLimite_max_entredoses(int limite_max_entredoses) {
     this.limite_max_entredoses = limite_max_entredoses;
  }

  public String getEfeito_secundario() {
     return efeito_secundario;
  }

  public void setEfeito_secundario(String efeito_secundario) {
     this.efeito_secundario = efeito_secundario;
  }

   
  
  @Override
    public String toString() {
        return "Vacina{" + "nome=" + nome + ", codigo=" + codigo + ", fabricante=" + fabricante + ", dose=" + dose + ", restricao=" + restricao + ", n_administracao=" + n_administracao + ", limite_min_entredoses=" + limite_min_entredoses + ", limite_max_entredoses=" + limite_max_entredoses + ", efeito_secundario=" + efeito_secundario + '}';
    }
  
  
}




