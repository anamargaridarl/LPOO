import java.util.ArrayList;
import java.util.List;

public class StringRecipe {

    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = new ArrayList<>();
        this.transformers = transformers;
    }

    public void mix() {

        for(StringTransformer drinkprep: transformers)
        {
            drinkprep.execute();
        }
    }
}
