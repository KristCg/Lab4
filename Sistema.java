public class Sistema{
    public interface Sistema {
        void encender();
        void apagar();
        void ajustarTemperatura(int incremento);
        void activarModoAutomatico();
        void configurarDistribucionAire(String distribucion);
        void activarDesempañador();
        void desactivarDesempañador();
        boolean isEstado();
        int getTemperatura();
        boolean isModoAutomatico();
        String getDistribucionAire();
        boolean isDesempañadorActivo();
    }
    
}