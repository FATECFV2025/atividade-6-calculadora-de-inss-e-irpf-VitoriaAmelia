public class AppFolhaPagamento {
    public static void main(String[] args) {

        // VALORES 
        String nome = "Lucas";
        String cpf = "123.456.789-00";
        double salario = 8000.00;
        int tipo = 3; // 1 = CLT, 2 = Estagiário e 3 = Prestador

        Contribuinte c; // Variável  que poderá guardar qualquer tipo de contribuidor

          // Seleciona a classe escolhida
        switch (tipo) {
            case 1:
                c = new FuncionarioCLT(nome, cpf, salario);
                break;
            case 2:
                c = new Estagiario(nome, cpf, salario);
                break;
            case 3:
                c = new PrestadorServico(nome, cpf, salario);
                break;
            default:
                System.out.println("Inválido!");
                return;
        }

        // // Saída. Chama o resumo.
        c.exibirResumo();
    }
}
