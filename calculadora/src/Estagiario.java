public class Estagiario extends Contribuinte {

    // Construtor com os valores da superclasse
    public Estagiario(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    // Estagiário não paga. Método sobrescrito.
    @Override
    public double calcularINSS() {
        return 0; 
    }

    // Estagiário não paga. Método sobrescrito.
    @Override
    public double calcularIRPF() {
        return 0; 
    }

    // Semdescontos, o salário líquido é igual ao bruto. Metodo sobrescrito
    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto;
    }
}
