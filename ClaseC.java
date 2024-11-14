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
        System.out.println("Sistema encendido.");
    }

    @Override
    public void apagar() {
        estado = false;
        System.out.println("Sistema apagado.");
    }

    @Override
    public void ajustarTemperatura(int incremento) {
        if (estado) {
            temperatura += incremento;
            System.out.println("Temperatura ajustada a: " + temperatura + "°C");
        } else {
            System.out.println("El sistema está apagado.");
        }
    }

    @Override
    public void activarModoAutomatico() {
        if (estado) {
            modoA = true;
            System.out.println("Modo automático activado.");
        } else {
            System.out.println("El sistema está apagado.");
        }
    }

    @Override
    public void configurarDistribucionAire(String distribucion) {
        if (estado) {
            this.distribucion = distribucion;
            System.out.println("Distribución de aire configurada a: " + distribucion);
        } else {
            System.out.println("El sistema está apagado.");
        }
    }

    @Override
    public void activarDesempañador() {
        if (estado) {
            desempañador = true;
            System.out.println("Desempañador activado.");
        } else {
            System.out.println("El sistema está apagado.");
        }
    }

    @Override
    public void desactivarDesempañador() {
        if (estado) {
            desempañador = false;
            System.out.println("Desempañador desactivado.");
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
            System.out.println("Nivel de ventilación ajustado a: " + nivel_vent);
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
            System.out.println("Zona de ventilación configurada a: " + zona_vent);
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
            System.out.println("Modo silencioso activado.");
        } else {
            System.out.println("El sistema está apagado.");
        }
    }

    public String getNivelHumedad() {
        return nivel_humedad;
    }

    public void setNivelHumedad(String nivel_humedad) {
        if (estado) {
            this.nivel_humedad = nivel_humedad;
            System.out.println("Nivel de humedad ajustado a: " + nivel_humedad);
        } else {
            System.out.println("El sistema está apagado.");
        }
    }

    public float getIndicadorHumedad() {
        return indicador_humedad;
    }

    public void actualizarIndicadorHumedad(float indicador_humedad) {
        if (estado) {
            this.indicador_humedad = indicador_humedad;
            System.out.println("Indicador de humedad actualizado a: " + indicador_humedad + "%");
        } else {
            System.out.println("El sistema está apagado.");
        }
    }

}
