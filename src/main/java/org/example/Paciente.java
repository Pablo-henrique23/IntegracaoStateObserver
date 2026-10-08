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
        boolean state = estado.morrer(this);
        setChanged();
        notifyObservers();
        return state;
    }
    public boolean viver(){
        boolean state = estado.viver(this);
        setChanged();
        notifyObservers();
        return state;
    }
    public boolean ficarInstavel(){
        boolean state = estado.ficarInstavel(this);
        setChanged();
        notifyObservers();
        return state;
    }
    public boolean ficarEstavel(){
        boolean state = estado.ficarEstavel(this);
        setChanged();
        notifyObservers();
        return state;
    }
}
