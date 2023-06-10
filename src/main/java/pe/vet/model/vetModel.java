
package pe.vet.model;

public class vetModel {
    
    private Integer id;
    private String nombre;
    private String descripcion;
    private String horario;
    private String direccion;
    private String logo;
    private Integer destacado;
    
    
    @Override
    public String toString() {
        return "vetModel{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", horario=" + horario + ", direccion=" + direccion + ", logo=" + logo + ", destacado=" + destacado + '}';
    }
    
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getDestacado() {
        return destacado;
    }

    public void setDestacado(Integer destacado) {
        this.destacado = destacado;
    }
    
    
    
}
