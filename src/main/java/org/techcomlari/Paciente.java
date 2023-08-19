package org.techcomlari;

class Paciente {
    public String nome;
    public String tipoSanguineo;
    public int anoNascimento;

    public Paciente(String nome, String tipoSanguineo, int anoNascimento) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public int calcularIdade() {
        int anoAtual = java.time.LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }
}
