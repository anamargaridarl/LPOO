public class ServicoPrioritario implements   ServicoABordo{

    private String description;

    protected ServicoPrioritario() {
        this.description = "Servico prioritario.";
    }

    public String getDescription()
    {
        return description;
    }
}
