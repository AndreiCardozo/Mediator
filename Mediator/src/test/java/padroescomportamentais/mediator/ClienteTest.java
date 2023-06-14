package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarGerencia() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Gerência agradece a mensagem: Ótimo atendimento",
                cliente.elogiarGerencia("Ótimo atendimento"));
    }

    @Test
    void deveReclamarGerencia() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Gerência vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarGerencia("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirGerencia() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Gerência respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Gerência vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.sugerirGerencia("Ampliar horário funcionamento"));
    }

}
