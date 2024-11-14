public class ClaseC{
    public class ClaseC implements Sistema {
        private boolean estado;
        private int temperatura;
        private boolean modoA;
        private String distribucion;
        private boolean desempañador;
        private String nivel_vent;
        private String zona_vent;
        private boolean modoS;
        private String nivel_humedad;
        private float indicador_humedad;
    
        public ClaseC() {
            this.estado = false;
            this.temperatura = 20; 
            this.modoA = false;
            this.distribucion = "frontal";
            this.desempañador = false;
            this.nivel_vent = "medio";
            this.zona_vent = "pies";
            this.modoS = false;
            this.nivel_humedad = "medio";
            this.indicador_humedad = 50.0f; 
        }
    
        @Override
        public void encender() {
            estado = true;
        }
    
        @Override
        public void apagar() {
            estado = false;
        }
    
        @Override
        public void ajustarTemperatura(int incremento) {
            if (estado) {
                temperatura += incremento;
            } else {
                System.out.println("El sistema está apagado.");
            }
        }
    
        @Override
        public void activarModoAutomatico() {
            if (estado) {
                modoAutomatico = true;
            } else {
                System.out.println("El sistema está apagado.");
            }
        }
    
        @Override
        public void configurarDistribucionAire(String distribucion) {
            if (estado) {
                distribucionAire = distribucion;
            } else {
                System.out.println("El sistema está apagado.");
            }
        }
    
        @Override
        public void activarDesempañador() {
            if (estado) {
                desempañador = true;
            } else {
                System.out.println("El sistema está apagado.");
            }
        }
    
        @Override
        public void desactivarDesempañador() {
            if (estado) {
                desempañador = false;
            } else {
                System.out.println("El sistema está apagado.");
            }
        }
    
        @Override
        public boolean isEstado() {
            return estado;
        }
    
        @Override
        public int getTemperatura() {
            return temperatura;
        }
    
        @Override
        public boolean isModoAutomatico() {
            return modoA;
        }
    
        @Override
        public String getDistribucionAire() {
            return distribucion;
        }
    
        @Override
        public boolean isDesempañadorActivo() {
            return desempañador;
        }
    
        // Métodos específicos de ClaseC
        public String getNivelVentilacion() {
            return nivel_vent;
        }
    
        public void setNivelVentilacion(String nivel_vent) {
            if (estado) {
                this.nivel_vent = nivel_vent;
            } else {
                System.out.println("El sistema está apagado.");
            }
        }
    
        public String getZonaVentilacion() {
            return zona_vent;
        }
    
        public void setZonaVentilacion(String zona_vent) {
            if (estado) {
                this.zona_vent = zona_vent;
            } else {
                System.out.println("El sistema está apagado.");
            }
        }
    
        public boolean isModoSilencioso() {
            return modoS;
        }
    
        public void activarModoSilencioso() {
            if (estado) {
                modoS = true;
            } else {
                System.out.println("El sistema está apagado");
            }
        }
    
        public String getNivelHumedad() {
            return nivel_humedad;
        }
    
        public void setNivelHumedad(String nivel_humedad) {
            if (estado) {
                this.nivel_humedad = nivel_humedad;
            } else {
                System.out.println("El sistema está apagado");
            }
        }
    
        public float getIndicadorHumedad() {
            return indicador_humedad;
        }
    
        public void actualizarIndicadorHumedad(float indicador_humedad) {
            if (estado) {
                this.indicador_humedad = indicador_humedad;
            } else {
                System.out.println("El sistema está apagado");
            }
        }
    }

}