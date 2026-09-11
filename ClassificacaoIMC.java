void main() {
    String NomeStr = IO.readln("Informe o nome: ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefio não informar): ").charAt(0);
    String AlturaStr = IO.readln("Informe sua altura (em metros): ");
    String PesoStr = IO.readln("Informe seu peso (em kg): ");
    
    double Altura = Double.valueOf(AlturaStr);
    double Peso = Double.valueOf(PesoStr);

    double imc = ( Peso / (Altura * Altura));

    switch (genero) {
        case 'm', 'M':
            if (imc < 20) {
                IO.println("Abaixo do Normal");}
            else if (imc < 25) {
                IO.println("Normal");}
            else if (imc < 30) {
                IO.println("Obesidade Leve");}
            else if (imc < 40) {
                IO.println("Obesidade Moderada");}
            else { 
                IO.println("Obesidade Mórbida");}
            break;

        case 'f', 'F', 'n', 'N':
            if (imc < 19) {
                IO.println("Abaixo do Normal");}
            else if (imc < 24) {
                IO.println("Normal");}
            else if (imc < 29) {
                IO.println("Obesidade Leve");}
            else if (imc < 39) {
                IO.println("Obesidade Moderada");}
            else { 
                IO.println("Obesidade Mórbida");}
            break;

        default:
            IO.println("Gênero inválido");
    }

    IO.println("Nome: " + NomeStr);
    IO.println("Gênero: " + genero);
    System.out.printf("IMC: %.1f%n", imc);
}