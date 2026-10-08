package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MedicoPacienteTest {

    @Test
    void deveNotificarMedicoQuandoPacienteFicarInstavel() {
        Paciente paciente = new Paciente("Joao");
        Medico medico = new Medico();

        medico.cuidarDePaciente(paciente);

        paciente.ficarInstavel();

        assertEquals("Paciente: Joao foi para o estado Instavel.", medico.getUltimaNotificacao());
    }

    @Test
    void deveNotificarMedicoQuandoPacienteFicarEstavel() {
        Paciente paciente = new Paciente("Joao");
        Medico medico = new Medico();

        medico.cuidarDePaciente(paciente);

        paciente.ficarEstavel();

        assertEquals("Paciente: Joao foi para o estado Estavel.", medico.getUltimaNotificacao());
    }

    @Test
    void deveNotificarMedicoQuandoPacienteMorrer() {
        Paciente paciente = new Paciente("Joao");
        Medico medico = new Medico();

        medico.cuidarDePaciente(paciente);

        paciente.morrer();

        assertEquals("Paciente: Joao foi para o estado Morto.", medico.getUltimaNotificacao());
    }

    @Test
    void deveAtualizarUltimaNotificacaoQuandoPacienteMudarDeEstado() {
        Paciente paciente = new Paciente("Joao");
        Medico medico = new Medico();

        medico.cuidarDePaciente(paciente);

        paciente.ficarInstavel();

        assertEquals("Paciente: Joao foi para o estado Instavel.", medico.getUltimaNotificacao());

        paciente.ficarEstavel();

        assertEquals("Paciente: Joao foi para o estado Estavel.", medico.getUltimaNotificacao());
    }

    @Test
    void medicoPodeObservarMaisDeUmPaciente() {
        Paciente paciente1 = new Paciente("Joao");
        Paciente paciente2 = new Paciente("Maria");

        Medico medico = new Medico();

        medico.cuidarDePaciente(paciente1);
        medico.cuidarDePaciente(paciente2);

        paciente1.ficarInstavel();

        assertEquals("Paciente: Joao foi para o estado Instavel.", medico.getUltimaNotificacao());

        paciente2.morrer();

        assertEquals("Paciente: Maria foi para o estado Morto.", medico.getUltimaNotificacao());
    }
}