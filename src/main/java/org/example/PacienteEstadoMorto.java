package org.example;

public class PacienteEstadoMorto extends PacienteEstado{
    private PacienteEstadoMorto(){}
    private static PacienteEstadoMorto instance = new PacienteEstadoMorto();

    public static PacienteEstadoMorto getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Morto";
    }

}
