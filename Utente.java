
import java.time.LocalDate;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Silva
 */
public class Utente extends Utilizador{

   private double num_SNS;
   private String nome;
   private String morada;
   private String localidade;
   private LocalDate data_nasc;
   private ArrayList<String> historico_doencas;
   private int contacto;
   private String email;
   private CentroVacinacao centro_vacinacao;
   private Vacina vacina_administrada;
   private LocalDate data_administracao;

   public Utente(double num_SNS, String nome, String morada, String localidade, LocalDate data_nasc, ArrayList<String> historico_doencas, int contacto, String email) {
       this.num_SNS = num_SNS;
       this.nome = nome;
       this.morada = morada;
       this.localidade = localidade;
       this.data_nasc = data_nasc;
       this.historico_doencas = null; 
       this.contacto = contacto;
       this.email = email;
       this.centro_vacinacao = null;
       this.vacina_administrada = null;
       this.data_administracao = null;
   }


   public double getNum_SNS() {
       return num_SNS;
   }

   public void setNum_SNS(double num_SNS) {
       this.num_SNS = num_SNS;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
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

   public LocalDate getData_nasc() {
       return data_nasc;
   }

   public void setData_nasc(LocalDate data_nasc) {
       this.data_nasc = data_nasc;
   }

   public ArrayList<String> getHistorico_doencas() {
       return historico_doencas;
   }

   public void setHistorico_doenças(ArrayList<String> historico_doencas) {    //corresponde à funcionalidade de Registar as Doenças Prévias
       this.historico_doencas = historico_doencas;
   }

   public int getContacto() {
       return contacto;
   }

   public void setContacto(int contacto) {
       this.contacto = contacto;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public CentroVacinacao getCentro_vacinacao() {
       return centro_vacinacao;
   }

   public void setCentro_vacinacao(CentroVacinacao centro_vacinacao) {
       this.centro_vacinacao = centro_vacinacao;
   }

   public Vacina getVacina_administrada() {
       return vacina_administrada;
   }

   public void setVacina_administrada(Vacina vacina_administrada) {
       this.vacina_administrada = vacina_administrada;
   }

   public LocalDate getData_administracao() {
       return data_administracao;
   }

   public void setData_administracao(LocalDate data_administracao) {
       this.data_administracao = data_administracao;
   }
   
   
   

   
   
   @Override
    public String toString() {
        return "Utente{" + "num_SNS=" + num_SNS + ", nome=" + nome + ", morada=" + morada + ", localidade=" + localidade + ", data_nasc=" + data_nasc + ", historico_doencas=" + historico_doencas + ", contacto=" + contacto + ", email=" + email + ", centro_vacinacao=" + centro_vacinacao + ", vacina_administrada=" + vacina_administrada + ", data_administracao=" + data_administracao + '}';
    }
   
    
        
    
}
