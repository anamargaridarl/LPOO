import java.util.ArrayList;
import java.util.List;

public class StringTransformerGroup implements StringTransformer {

    private List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers= new ArrayList<>();
        this.transformers= transformers;
    }

    public void execute()
    {
        for(StringTransformer drinkprep: transformers)
        {
            drinkprep.execute();
        }
    }


}
