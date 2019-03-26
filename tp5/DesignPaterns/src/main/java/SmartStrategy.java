import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    List<StringRecipe> recipes;

    public SmartStrategy()
    {
        this.recipes= new ArrayList<>();
    }

    public void wants(StringRecipe recipe, StringBar bar)
    {
        if(bar.isHappyHour()) {
            bar.order(recipe);
        }
        else {
            recipes.add(recipe);
        }

    }

    public void happyHourStarted(StringBar bar)
    {
        for (Iterator<StringRecipe> iter = recipes.listIterator(); iter.hasNext(); ) {
            StringRecipe a = iter.next();
                bar.order(a);
                iter.remove();
            }

    }
    public void happyHourEnded(StringBar bar)
    {

    }

}
