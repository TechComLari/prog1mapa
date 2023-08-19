package org.techcomlari;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o tipo sanguíneo do paciente: ");
        String tipoSanguineo = scanner.nextLine();

        System.out.print("Informe o ano de nascimento do paciente: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Informe a quantidade de triglicerídeos: ");
        double quantidadeTriglicerideos = scanner.nextDouble();

        Paciente paciente = new Paciente(nome, tipoSanguineo, anoNascimento);

        Exame exameTriglicerideos = new ExameTriglicerideos(paciente, 0, quantidadeTriglicerideos);

        exameTriglicerideos.mostrarResultado();

        scanner.close();
    }
}