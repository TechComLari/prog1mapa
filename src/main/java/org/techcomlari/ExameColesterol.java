package org.techcomlari;

class ExameColesterol extends Exame {
    private double quantidadeLDL;
    private double quantidadeHDL;
    private String risco;

    public ExameColesterol(Paciente paciente, double valorExame, double quantidadeLDL, double quantidadeHDL, String risco) {
        super(paciente, valorExame);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
        this.risco = risco;
    }

    @Override
    public void classificarResultado() {
        System.out.println("Classificação LDL: " + classificarLDL());
        System.out.println("Classificação HDL: " + classificarHDL());
    }

    private String classificarLDL() {
        if (risco.equals("B")) {
            return (quantidadeLDL < 100) ? "Baixo" : "Alto";
        } else if (risco.equals("M")) {
            return (quantidadeLDL < 70) ? "Baixo" : "Alto";
        } else { // risco alto
            return (quantidadeLDL < 50) ? "Baixo" : "Alto";
        }
    }

    private String classificarHDL() {
        if (paciente.calcularIdade() <= 19) {
            return (quantidadeHDL > 45) ? "BOM" : "RUIM";
        } else {
            return (quantidadeHDL > 40) ? "BOM" : "RUIM";
        }
    }
}