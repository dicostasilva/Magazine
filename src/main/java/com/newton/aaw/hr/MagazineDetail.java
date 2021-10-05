package com.newton.aaw.hr;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class MagazineDetail {


    private String magazineId;
    private String magazineTitulo;
    private String editora;
    private Integer ano;
    private Integer mes;
    private DateTime dataDePublicacao;
    private Integer status;
    
    public String getMagazineID() {
        return magazineId;
    }
    
    public void setMagazineID(String magazineId) {
        this.magazineId = magazineId;
    }
    
    
    public String getMagazineTitulo() {
        return magazineTitulo;
    }
    public void setProductName(String MagazineTitulo) {
        this.magazineTitulo = magazineTitulo;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public Integer getMes() {
        return mes;
    }
    public void setMes(Integer inventoryId) {
        this.mes = mes;
    }
    public DateTime getDataDePublicacao() {
        return dataDePublicacao;
    }
    public void setdataDePublicacao(DateTime inventoryId) {
        this.dataDePublicacao = dataDePublicacao;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer inventoryId) {
        this.status = status;
    }
 

    }
    

   
    

