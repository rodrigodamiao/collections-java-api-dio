package map.ordenacao;

public class Evento {
    private String eventoNome;
    private String atracaoNome;

    public Evento(String eventoNome, String atracaoNome) {
        this.eventoNome = eventoNome;
        this.atracaoNome = atracaoNome;
    }

    public String getEventoNome() {
        return eventoNome;
    }

    public String getAtracaoNome() {
        return atracaoNome;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "eventoNome='" + eventoNome + '\'' +
                ", atracaoNome='" + atracaoNome + '\'' +
                '}';
    }
}
