package models.mercadeo;
package models.mercadeo;

import java.time.LocalDate;

public class Cupon {
    public Long id;
    public String codigo;
    public Double porcentajeDescuento;
    public LocalDate fechavencimiento;
    public Integer usoMaximo;
    public Long idCampaña;
    public Cupon() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public LocalDate getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(LocalDate fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Integer getUsoMaximo() {
        return usoMaximo;
    }

    public void setUsoMaximo(Integer usoMaximo) {
        this.usoMaximo = usoMaximo;
    }

    public Long getIdCampaña() {
        return idCampaña;
    }

    public void setIdCampaña(Long idCampaña) {
        this.idCampaña = idCampaña;
    }

    @Override
    public String toString() {
        return "Cupon [id=" + id + ", codigo=" + codigo + ", porcentajeDescuento=" + porcentajeDescuento
                + ", fechavencimiento=" + fechavencimiento + ", usoMaximo=" + usoMaximo + ", idCampaña=" + idCampaña
                + ", getId()=" + getId() + ", getCodigo()=" + getCodigo() + ", getPorcentajeDescuento()="
                + getPorcentajeDescuento() + ", getFechavencimiento()=" + getFechavencimiento() + ", getUsoMaximo()="
                + getUsoMaximo() + ", getIdCampaña()=" + getIdCampaña() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

}

public class Cupon {
    
}
