public class PrestadorServico extends Contribuinte {
    // Construtor com os valores da superclasse
    public PrestadorServico(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    // Não paga. Método sobrescrito.
    @Override
    public double calcularINSS() {
        return 0; 
    }

    // IRPF fixo de 1,5%. Método sobrescrito.
    @Override
    public double calcularIRPF() {
        return salarioBruto * 0.015; 
    }

    // calcula salário liquido com valor do método anterior. Método sobrescrito
    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularIRPF();
    }
}
