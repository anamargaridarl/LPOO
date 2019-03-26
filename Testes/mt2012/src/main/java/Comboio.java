import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Comboio {

    private String nome;
    private List<Carruagem> carruagens;
    private int passageiros;
    private int lugaresLivres;
    private ServicoABordo servico;

    public Comboio(String nome) {

        this.nome = nome;
        this.servico = new ServicoRegular();
        this.passageiros = 0;
        carruagens = new ArrayList<>();
        this.lugaresLivres=0;
    }


    public String getNome() {
        return nome;
    }

    public int getNumLugares() {

        int num = 0;

        for(Carruagem c: carruagens)
            num += c.getNumLugares();

        return num;
    }

    public int getNumCarruagens() {
        return carruagens.size();
    }

    public void addCarruagem(Carruagem a1) {
        carruagens.add(a1);

        this.lugaresLivres = this.lugaresLivres +  a1.getNumLugares();
    }

    public Carruagem getCarruagemByOrder(int i) {
        return carruagens.get(i);
    }

    public void removeAllCarruagens(int i) {

        for (Iterator<Carruagem> iter = carruagens.listIterator(); iter.hasNext(); ) {
            Carruagem a = iter.next();
            if (a.getNumLugares() == i) {
                iter.remove();
            }
        }
    }

    public int getNumPassageiros() {
        return passageiros;
    }

    public int getLugaresLivres() {

        return lugaresLivres;
    }

    public void addPassageiros(int i) throws PassengerCapacityExceeded{

        if(this.lugaresLivres < i)
            throw new PassengerCapacityExceeded();

        this.passageiros += i;
        this.lugaresLivres -= i;




    }

    public void removePassageiros(int i) {
        this.passageiros -= i;
        this.lugaresLivres += i;
    }

    public void removePassageiros() {

        this.lugaresLivres += this.passageiros;
        this.passageiros = 0;
    }

    @Override
    public String toString()
    {
        String traintype= "";
        String c = "";
        String lug = "";
        if(this.getClass() == TGV.class)
            traintype = "TGV ";
        if(this.getClass() == Pendular.class)
            traintype = "Pendular ";
        if(this.getClass() == Comboio.class)
            traintype = "Comboio ";

        if(carruagens.size() == 1)
            c = " carruagem, ";
        else
            c = " carruagens, ";

        if(getNumLugares() == 1)
            lug = " lugar, ";
        else
            lug = " lugares, ";


        return traintype + nome +", " +carruagens.size()+ c + getNumLugares()+ lug + passageiros+" passageiros";
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)return true;

        if(this ==null)return false;

        if(this.getClass() != o.getClass()) return false;

        Comboio c = (Comboio) o;

        if(carruagens.size() != c.carruagens.size()) return false;

        int n = carruagens.size();

        for(int i = 0; i < n; i++)
        {
            if(carruagens.get(i).getNumLugares() != c.carruagens.get(i).getNumLugares())
                return false;
        }




        return true;
    }

    public ServicoABordo getServicoABordo() {
        return servico;
    }

    public String getDescricaoServico() {
       return servico.getDescription();

    }

    public void setServicoABordo(ServicoABordo servico) {

        this.servico = servico;
    }
}
