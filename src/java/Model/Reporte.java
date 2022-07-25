package Model;
// Generated 10-10-2021 15:45:08 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reporte generated by hbm2java
 */
@Entity
@Table(name="REPORTE"
    ,schema="BDCLETA"
)
public class Reporte  implements java.io.Serializable {


     private long idReporte;
     private Sucursal sucursal;
     private Usuario usuario;
     private String tiporeporte;
     private Date fecinicio;
     private Date fecfin;
     private Date fecemision;
     private String sucursalreporte;
     private Long bicicletain;
     private Long bicicletaout;
     private Long accesorioin;
     private Long accesorioout;
     private Long totalventa;

    public Reporte() {
    }

	
    public Reporte(long idReporte, Sucursal sucursal, Usuario usuario, String tiporeporte, Date fecemision) {
        this.idReporte = idReporte;
        this.sucursal = sucursal;
        this.usuario = usuario;
        this.tiporeporte = tiporeporte;
        this.fecemision = fecemision;
    }
    public Reporte(long idReporte, Sucursal sucursal, Usuario usuario, String tiporeporte, Date fecinicio, Date fecfin, Date fecemision, String sucursalreporte, Long bicicletain, Long bicicletaout, Long accesorioin, Long accesorioout, Long totalventa) {
       this.idReporte = idReporte;
       this.sucursal = sucursal;
       this.usuario = usuario;
       this.tiporeporte = tiporeporte;
       this.fecinicio = fecinicio;
       this.fecfin = fecfin;
       this.fecemision = fecemision;
       this.sucursalreporte = sucursalreporte;
       this.bicicletain = bicicletain;
       this.bicicletaout = bicicletaout;
       this.accesorioin = accesorioin;
       this.accesorioout = accesorioout;
       this.totalventa = totalventa;
    }
   
     @Id 

    
    @Column(name="ID_REPORTE", unique=true, nullable=false, precision=10, scale=0)
    public long getIdReporte() {
        return this.idReporte;
    }
    
    public void setIdReporte(long idReporte) {
        this.idReporte = idReporte;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_SUCURSAL", nullable=false)
    public Sucursal getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_USUARIO", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="TIPOREPORTE", nullable=false, length=10)
    public String getTiporeporte() {
        return this.tiporeporte;
    }
    
    public void setTiporeporte(String tiporeporte) {
        this.tiporeporte = tiporeporte;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECINICIO", length=7)
    public Date getFecinicio() {
        return this.fecinicio;
    }
    
    public void setFecinicio(Date fecinicio) {
        this.fecinicio = fecinicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECFIN", length=7)
    public Date getFecfin() {
        return this.fecfin;
    }
    
    public void setFecfin(Date fecfin) {
        this.fecfin = fecfin;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECEMISION", nullable=false, length=7)
    public Date getFecemision() {
        return this.fecemision;
    }
    
    public void setFecemision(Date fecemision) {
        this.fecemision = fecemision;
    }

    
    @Column(name="SUCURSALREPORTE", length=200)
    public String getSucursalreporte() {
        return this.sucursalreporte;
    }
    
    public void setSucursalreporte(String sucursalreporte) {
        this.sucursalreporte = sucursalreporte;
    }

    
    @Column(name="BICICLETAIN", precision=10, scale=0)
    public Long getBicicletain() {
        return this.bicicletain;
    }
    
    public void setBicicletain(Long bicicletain) {
        this.bicicletain = bicicletain;
    }

    
    @Column(name="BICICLETAOUT", precision=10, scale=0)
    public Long getBicicletaout() {
        return this.bicicletaout;
    }
    
    public void setBicicletaout(Long bicicletaout) {
        this.bicicletaout = bicicletaout;
    }

    
    @Column(name="ACCESORIOIN", precision=10, scale=0)
    public Long getAccesorioin() {
        return this.accesorioin;
    }
    
    public void setAccesorioin(Long accesorioin) {
        this.accesorioin = accesorioin;
    }

    
    @Column(name="ACCESORIOOUT", precision=10, scale=0)
    public Long getAccesorioout() {
        return this.accesorioout;
    }
    
    public void setAccesorioout(Long accesorioout) {
        this.accesorioout = accesorioout;
    }

    
    @Column(name="TOTALVENTA", precision=10, scale=0)
    public Long getTotalventa() {
        return this.totalventa;
    }
    
    public void setTotalventa(Long totalventa) {
        this.totalventa = totalventa;
    }




}

