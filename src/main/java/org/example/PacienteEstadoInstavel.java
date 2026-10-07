package org.example;

public class PacienteEstadoInstavel extends PacienteEstado {

    private PacienteEstadoInstavel(){}
    private static PacienteEstadoInstavel instance = new PacienteEstadoInstavel();

    public static PacienteEstadoInstavel getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Instavel";
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
