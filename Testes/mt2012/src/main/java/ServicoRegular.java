public class ServicoRegular implements ServicoABordo {

    private String description;

    protected ServicoRegular() {
        this.description = "Servico regular.";
    }

    public String getDescription()
    {
        return description;
    }


}
