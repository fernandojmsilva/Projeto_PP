
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Silva
 */
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CentroVacinacao {
  
  private String codigo;
  private String morada;
  private String localidade;
  private Gestor gestor;
  private Map<String, Vacina> stock = new HashMap<>();
  private Map<LocalDate, Marcacao> agenda_marcacao = new HashMap<>();
  private int num_posto_atend;

  public CentroVacinacao(String codigo, String morada, String localidade, Gestor gestor, Map<String,Vacina> stock, Map<LocalDate, Marcacao> agenda_marcacao, int num_posto_atend) {
     this.codigo = codigo;
     this.morada = morada;
     this.localidade = localidade;
     this.gestor = gestor;
     this.stock = stock;
     this.agenda_marcacao = agenda_marcacao;
     this.num_posto_atend = num_posto_atend;
  }

  public String getCodigo() {
     return codigo;
  }

  public void setCodigo(String codigo) {
     this.codigo = codigo;
  }

  public String getMorada() {
     return morada;
  }

  public void setMorada(String morada) {
     this.morada = morada;
  }

  public String getLocalidade() {
     return localidade;
  }

  public void setLocalidade(String localidade) {
     this.localidade = localidade;
  }

  public Gestor getGestor() {
     return gestor;
  }

  public void setGestor(Gestor gestor) {
     this.gestor = gestor;
  }

  public Map<String, Vacina> getStock() {
     return stock;
  }

  public void setStock(Map<String, Vacina> stock) {
     this.stock = stock;
  }

  public Map<LocalDate, Marcacao> getAgenda_marcacao() {
     return agenda_marcacao;
  }

  public void setAgenda_marcacao(Map<LocalDate, Marcacao> agenda_marcacao) {
     this.agenda_marcacao = agenda_marcacao;
  }

  public int getNum_posto_atend() {
     return num_posto_atend;
  }

  public void setNum_posto_atend(int num_posto_atend) {
     this.num_posto_atend = num_posto_atend;
  }
 

}

