package models.nutricion;

public class Tarjetas {

    private Long id;
    private String nombreTarjeta;
    private String numeroTarjeta;
    private String fechaVencimiento;
    private Double limiteCalorias;
    private Long idUsuario;

    public Tarjetas() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Double getLimiteCalorias() {
        return limiteCalorias;
    }

    public void setLimiteCalorias(Double limiteCalorias) {
        this.limiteCalorias = limiteCalorias;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
