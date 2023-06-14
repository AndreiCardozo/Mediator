package padroescomportamentais.mediator;
public class Gerencia {
    private static Gerencia instancia = new Gerencia();

    private Gerencia() {}

    public static Gerencia getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Gerência vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Gerência agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Gerência vai analisar a sugestão: " + mensagem;
    }
}