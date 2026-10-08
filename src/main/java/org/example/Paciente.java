package org.example;

import java.util.Observable;

public class Paciente extends Observable {

    private String nome;
    private PacienteEstado estado;

    public Paciente(String nome){
        this.nome = nome;
        this.estado = PacienteEstadoVivo.getInstance();
    }
    public void setEstado(PacienteEstado estado){
        this.estado = estado;
    }

    @Override
    public String toString(){
        return "Paciente: " + this.nome + " foi para o estado " + this.estado.getEstado() + ".";
    }

    public boolean morrer(){
        estado.morrer(this);
        setChanged();
        notifyObservers();
        return estado.morrer(this);
    }
    public boolean viver(){
        estado.viver(this);
        setChanged();
        notifyObservers();
        return estado.viver(this);
    }
    public boolean ficarInstavel(){
        estado.ficarInstavel(this);
        setChanged();
        notifyObservers();
        return estado.ficarInstavel(this);
    }
    public boolean ficarEstavel(){
        estado.ficarEstavel(this);
        setChanged();
        notifyObservers();
        return estado.ficarEstavel(this);
    }
}
