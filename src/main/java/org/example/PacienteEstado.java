package org.example;

public abstract class PacienteEstado {

    public abstract String getEstado();

    public boolean morrer(Paciente paciente) {
        return false;
    }

    public boolean viver(Paciente paciente) {
        return false;
    }

    public boolean ficarInstavel(Paciente paciente) {
        return false;
    }

    public boolean ficarEstavel(Paciente paciente){
        return false;
    }

}
