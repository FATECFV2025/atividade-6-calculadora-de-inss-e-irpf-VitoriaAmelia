public class FuncionarioCLT extends Contribuinte {

     // Construtor com os valores da superclasse
    public FuncionarioCLT(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

      // Aqui sobrescrevemos o método para aplicar a regra dos funcionários CLT.
    @Override
    public double calcularINSS() {
        // Lógica de cálculo do CLT, com percentual nas faixas de salário
        double salario = this.salarioBruto;
        double inss = 0.0;
        
        double faixa1 = 1412.00;
        double faixa2 = 2666.68;
        double faixa3 = 4000.03;
        double faixa4 = 7786.02;


        // abaixo calcula a parcela de cada faixa.

        // 7,5% até 1412,00
        if (salario > 0) {
            double base = Math.min(salario, faixa1);
            inss += base * 0.075;
        }

        // 9% entre 1412.01 e 2666.68
        if (salario > faixa1) {
            double base = Math.min(salario, faixa2) - faixa1;
            if (base > 0) inss += base * 0.09;
        }

        // 12% entre 2666.69 e 4000.03
        if (salario > faixa2) {
            double base = Math.min(salario, faixa3) - faixa2;
            if (base > 0) inss += base * 0.12;
        }

        // 14% entre 4000.04 e 7786.02
        if (salario > faixa3) {
            double base = Math.min(salario, faixa4) - faixa3;
            if (base > 0) inss += base * 0.14;
        }

        return inss;
    }

    // Cálculo  IRPF. Outro método sobrescrito
    @Override
    public double calcularIRPF() {
        double base = salarioBruto - calcularINSS();

        if (base <= 2259.20) {
            return 0;
        } else if (base <= 2826.65) {
            return base * 0.075 - 169.44;
        } else if (base <= 3751.05) {
            return base * 0.15 - 381.44;
        } else if (base <= 4664.68) {
            return base * 0.225 - 662.77;
        } else {
            return base * 0.275 - 896.00;
        }
    }

    // Método sobrescrito para calcular o salário líquido.
    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }
}
