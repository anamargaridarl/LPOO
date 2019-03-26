public class TGV extends Comboio {

    public TGV(String nome) {
        super(nome);
        setServicoABordo(new ServicoPrioritario());
    }
}
