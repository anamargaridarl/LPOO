public class ImpatientStrategy implements OrderingStrategy{


    public void wants(StringRecipe recipe, StringBar bar)
    {
        bar.order(recipe);
    }
    public void happyHourStarted(StringBar bar)
    {

    }
    public void happyHourEnded(StringBar bar)
    {

    }

}
