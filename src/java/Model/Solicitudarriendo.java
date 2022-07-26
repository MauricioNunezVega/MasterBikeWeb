package Model;
// Generated 29-10-2021 20:24:25 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Solicitudarriendo generated by hbm2java
 */
public class Solicitudarriendo  implements java.io.Serializable {


     private long idSolArriendo;
     private Usuario usuario;
     private String tipobicicleta;
     private Date feciniArriendo;
     private Date fecfinArriendo;
     private String formapagoArri;
     private Integer depositogarantia;
     private String estado;

    public Solicitudarriendo() {
    }

	
    public Solicitudarriendo(long idSolArriendo, Usuario usuario, String tipobicicleta, Date feciniArriendo, Date fecfinArriendo, String formapagoArri,String estado) {
        this.idSolArriendo = idSolArriendo;
        this.usuario = usuario;
        this.tipobicicleta = tipobicicleta;
        this.feciniArriendo = feciniArriendo;
        this.fecfinArriendo = fecfinArriendo;
        this.formapagoArri = formapagoArri;
        this.estado = estado;
    }
    public Solicitudarriendo(long idSolArriendo, Usuario usuario, String tipobicicleta, Date feciniArriendo, Date fecfinArriendo, String formapagoArri, Integer depositogarantia, String estado) {
       this.idSolArriendo = idSolArriendo;
       this.usuario = usuario;
       this.tipobicicleta = tipobicicleta;
       this.feciniArriendo = feciniArriendo;
       this.fecfinArriendo = fecfinArriendo;
       this.formapagoArri = formapagoArri;
       this.depositogarantia = depositogarantia;
       this.estado = estado;
    }
   
    public long getIdSolArriendo() {
        return this.idSolArriendo;
    }
    
    public void setIdSolArriendo(long idSolArriendo) {
        this.idSolArriendo = idSolArriendo;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTipobicicleta() {
        return this.tipobicicleta;
    }
    
    public void setTipobicicleta(String tipobicicleta) {
        this.tipobicicleta = tipobicicleta;
    }
    public Date getFeciniArriendo() {
        return this.feciniArriendo;
    }
    
    public void setFeciniArriendo(Date feciniArriendo) {
        this.feciniArriendo = feciniArriendo;
    }
    public Date getFecfinArriendo() {
        return this.fecfinArriendo;
    }
    
    public void setFecfinArriendo(Date fecfinArriendo) {
        this.fecfinArriendo = fecfinArriendo;
    }
    public String getFormapagoArri() {
        return this.formapagoArri;
    }
    
    public void setFormapagoArri(String formapagoArri) {
        this.formapagoArri = formapagoArri;
    }
    public Integer getDepositogarantia() {
        return this.depositogarantia;
    }
    
    public void setDepositogarantia(Integer depositogarantia) {
        this.depositogarantia = depositogarantia;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


