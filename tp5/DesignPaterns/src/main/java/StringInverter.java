public class StringInverter implements StringTransformer {

    private StringDrink drink;

    public StringInverter(StringDrink drink) {
        this.drink = drink;
    }

    public void execute()
    {
        StringBuffer text = new StringBuffer(this.drink.getText());
        this.drink.setText(text.reverse().toString());
    }

    public void undo()
    {
        execute();
    }
}
