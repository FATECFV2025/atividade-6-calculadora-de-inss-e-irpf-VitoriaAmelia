public abstract class Contribuinte implements CalculadoraTributo {

    // Atributos 
    protected String nome;
    protected String cpf;
    protected double salarioBruto;

     // Construtor da classe 
    public Contribuinte(String nome, String cpf, double salarioBruto) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    // Método para exibir o resumo de acordo com a subclasses
    public void exibirResumo() {
    System.out.println("\nresumo:");
    System.out.println("Tipo: " + getTipo());
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
    System.out.printf("INSS: R$ %.2f\n", calcularINSS());
    System.out.printf("IRPF: R$ %.2f\n", calcularIRPF());
    System.out.printf("Salário Líquido: R$ %.2f\n", calcularSalarioLiquido()); 
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getSalarioBruto() { return salarioBruto; }
    public String getTipo() {
    return this.getClass().getSimpleName();
}

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }

    
}

