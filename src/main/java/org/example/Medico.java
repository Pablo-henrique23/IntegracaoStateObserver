package org.example;

import java.util.Observable;
import java.util.Observer;

public class Medico implements Observer {

    private String ultimaNotificacao;

    public void cuidarDePaciente(Paciente paciente) {
        paciente.addObserver(this);
    }

    @Override
    public void update(Observable paciente, Object arg) {
        this.ultimaNotificacao = paciente.toString();
    }

    public String getUltimaNotificacao(){
        return this.ultimaNotificacao;
    }
}
