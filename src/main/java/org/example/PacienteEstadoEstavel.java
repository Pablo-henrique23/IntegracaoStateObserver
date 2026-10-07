package org.example;

public class PacienteEstadoEstavel extends PacienteEstado {
    private PacienteEstadoEstavel(){}
    private static PacienteEstadoEstavel instance = new PacienteEstadoEstavel();

    public static PacienteEstadoEstavel getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Estavel";
    }

    public boolean morrer(Paciente paciente){
        paciente.setEstado(PacienteEstadoMorto.getInstance());
        return true;
    }

    public boolean ficarEstavel(Paciente paciente){
        paciente.setEstado(PacienteEstadoEstavel.getInstance());
        return true;
    }

}
