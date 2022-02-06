package Objectos;
public class Ciudad {
    private int codigo;
    private String NombreCiudad;
    private double poblacion;
    private float superficie;
     
    public Ciudad(int codigo, String NombreCiudad, double poblacion, float superficie) {
        this.codigo = codigo;
        this.NombreCiudad = NombreCiudad;
        this.poblacion = poblacion;
        this.superficie = superficie;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCiudad() {
        return NombreCiudad;
    }

    public void setNombreCiudad(String NombreCiudad) {
        this.NombreCiudad = NombreCiudad;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return NombreCiudad;
    }
    public String mostrarTodaLaInformacion() {
        return "Ciudad: " +NombreCiudad+ ";\n \tCódigo: "+codigo 
                + "\n \tPoblacion: " + poblacion 
                + "\n \tSuperficie: " + superficie+"km";
    }
}
