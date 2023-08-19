package org.techcomlari;

class ExameGlicemia extends Exame {
    private double quantidadeGlicose;

    public ExameGlicemia(Paciente paciente, double valorExame, double quantidadeGlicose) {
        super(paciente, valorExame);
        this.quantidadeGlicose = quantidadeGlicose;
    }

    @Override
    public void classificarResultado() {
        if (quantidadeGlicose < 100) {
            System.out.println("Classificação: Normoglicemia");
        } else if (quantidadeGlicose < 126) {
            System.out.println("Classificação: Pré-diabetes");
        } else {
            System.out.println("Classificação: Diabetes estabelecido");
        }
    }
}