package org.example;

public class PacienteEstadoVivo extends PacienteEstado {

    private PacienteEstadoVivo(){}
    private static PacienteEstadoVivo instance = new PacienteEstadoVivo();

    public static PacienteEstadoVivo getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Vivo";
    }

    public boolean morrer(Paciente paciente){
        paciente.setEstado(PacienteEstadoMorto.getInstance());
        return true;
    }

    public boolean ficarInstavel(Paciente paciente){
        paciente.setEstado(PacienteEstadoInstavel.getInstance());
        return true;
    }

    public boolean ficarEstavel(Paciente paciente){
        paciente.setEstado(PacienteEstadoEstavel.getInstance());
        return true;
    }

}
