package onlineshop.ec;
public class Producto {

    private int producto_id;// (PK)
    private String categoria_id; // (FK)
    private String descripcion;
    private int precio_unit;
    private int cantidad_minima;
    private int cantidad_disponible;
    private String fecha_actualizacion;
    private String imagen_url;//url de la imagen

    public Producto() {
    }

    public Producto(int producto_id, String categoria_id, String descripcion, int precio_unit, int cantidad_minima, int cantidad_disponible, String fecha_actualizacion, String imagen_url) {
        this.producto_id = producto_id;
        this.categoria_id = categoria_id;
        this.descripcion = descripcion;
        this.precio_unit = precio_unit;
        this.cantidad_minima = cantidad_minima;
        this.cantidad_disponible = cantidad_disponible;
        this.fecha_actualizacion = fecha_actualizacion;
        this.imagen_url = imagen_url;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(String categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(int precio_unit) {
        this.precio_unit = precio_unit;
    }

    public int getCantidad_minima() {
        return cantidad_minima;
    }

    public void setCantidad_minima(int cantidad_minima) {
        this.cantidad_minima = cantidad_minima;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(String fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }


    
}
