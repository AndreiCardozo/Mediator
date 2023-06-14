package padroescomportamentais.mediator;
public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioGerencia(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Gerência respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Gerencia.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoGerencia(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Gerência respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Gerencia.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoGerencia(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Gerência respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Gerencia.getInstancia().receberSugestao(mensagem);
    }

}