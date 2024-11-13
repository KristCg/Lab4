public class ClaseC{
    private String  nivel_vent;
    private String zona_vent;
    private boolean modoS;
    private String nivel_humed;
    private float indicador_humed;

    public ClseC(String nivel_vent, String zona_vent, boolean modoS, String nivel_humed, float indicador_humed){
        this.nivel_vent = nivel_vent;
        this.zona_vent = zona_vent;
        this.modoS = modoS;
        this.nivel_humed = nivel_humed;
        this.indicador_humed = indicador_humed;
    }

    public String getNivel_vent() {
        return nivel_vent;
    }
    
    public String getZona_vent() {
        return zona_vent;
    }
    
    public boolean isModoS() {
        return modoS;
    }
    
    public String getNivel_humed() {
        return nivel_humed;
    }
    
    public float getIndicador_humed() {
        return indicador_humed;
    }
    

    

    
}