import java.io.IOException;

public interface Sistema {
    void encender();

    void apagar();

    boolean ajustarTemperatura(int incremento);

    boolean activarModoAutomatico();

    boolean configurarDistribucionAire(String distribucion);

    boolean activarDesempañador();

    boolean desactivarDesempañador();

    boolean isEstado();

    int getTemperatura();

    boolean isModoAutomatico();

    String getDistribucionAire();

    boolean isDesempañadorActivo();

    void mostrarHistorialMantenimiento() throws IOException;
    
    void programarMantenimiento(String fecha, String tipoMantenimiento) throws IOException;

}
