package org.techcomlari;

class ExameTriglicerideos extends Exame {
    private double quantidadeTriglicerideos;

    public ExameTriglicerideos(Paciente paciente, double valorExame, double quantidadeTriglicerideos) {
        super(paciente, valorExame);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public void classificarResultado() {
        if (paciente.calcularIdade() <= 9) {
            if (quantidadeTriglicerideos < 75) {
                System.out.println("Classificação: Bom");
            } else {
                System.out.println("Classificação: Ruim");
            }
        } else if (paciente.calcularIdade() <= 19) {
            if (quantidadeTriglicerideos < 90) {
                System.out.println("Classificação: Bom");
            } else {
                System.out.println("Classificação: Ruim");
            }
        } else {
            if (quantidadeTriglicerideos < 150) {
                System.out.println("Classificação: Bom");
            } else {
                System.out.println("Classificação: Ruim");
            }
        }
    }
}
