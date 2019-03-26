public class ServicoSemEnjoos implements ServicoABordo{

    private String description;

    protected ServicoSemEnjoos() {
        this.description = "Servico sem enjoos.";
    }

    public String getDescription()
    {
        return description;
    }
}
