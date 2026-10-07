package org.example;

public class Paciente {

    private PacienteEstado estado;

    public Paciente(){
        this.estado = PacienteEstadoVivo.getInstance();
    }

    public void setEstado(PacienteEstado estado){
        this.estado = estado;
    }

    public boolean morrer(){
        return estado.morrer(this);
    }
    public boolean viver(){
        return estado.viver(this);
    }
    public boolean ficarInstavel(){
        return estado.ficarInstavel(this);
    }
    public boolean ficarEstavel(){
        return estado.ficarEstavel(this);
    }
}
