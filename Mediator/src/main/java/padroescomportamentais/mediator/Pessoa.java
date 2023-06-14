package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarGerencia(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioGerencia(mensagem);
    }

    public String reclamarGerencia(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoGerencia(mensagem);
    }

    public String sugerirGerencia(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoGerencia(mensagem);
    }


}