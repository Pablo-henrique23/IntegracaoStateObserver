package org.example;

import java.util.Observable;

public class Paciente extends Observable {

    private PacienteEstado estado;

    public Paciente(){
        this.estado = PacienteEstadoVivo.getInstance();
    }

    public void setEstado(PacienteEstado estado){
        this.estado = estado;
    }

    public boolean morrer(){
        setChanged();
        notifyObservers();
        return estado.morrer(this);
    }
    public boolean viver(){
        setChanged();
        notifyObservers();
        return estado.viver(this);
    }
    public boolean ficarInstavel(){
        setChanged();
        notifyObservers();
        return estado.ficarInstavel(this);
    }
    public boolean ficarEstavel(){
        setChanged();
        notifyObservers();
        return estado.ficarEstavel(this);
    }
}
