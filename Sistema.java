public class Sistema{
    private boolean estado;
    private int temperature;
    private boolean modoA;
    private String distribucion_aire;
    private boolean desempañador;

    public Sistema(boolean estado, int temperature, boolean modoA, String distribucion_aire, boolean desempañador){
        this.estado = estado;
        this.temperature = temperature;
        this.modoA = modoA;
        this.distribucion_aire = distribucion_aire;
        this.desempañador = desempañador;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public boolean isModoA() {
        return modoA;
    }
    
    public String getDistribucion_aire() {
        return distribucion_aire;
    }

    public boolean isDesempañador() {
        return desempañador;
    }

    
}