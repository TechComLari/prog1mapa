package org.techcomlari;

public class Exame {
    public Paciente paciente;
    public double valorExame;

    public Exame(Paciente paciente, double valorExame) {
        this.paciente = paciente;
        this.valorExame = valorExame;
    }

    public void classificarResultado() {
        System.out.println("Resultado indefinido");
    }

    public void mostrarResultado() {
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Idade: " + paciente.calcularIdade());
        System.out.println("Valor do Exame: " + valorExame);
        classificarResultado();
        System.out.println("----------------------");
    }
}
