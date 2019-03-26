public class StringReplacer implements StringTransformer{

    private StringDrink drink;
    private char oldchar;
    private char newchar;


    public StringReplacer(StringDrink drink, char a, char b) {
        this.drink=drink;
        this.oldchar=a;
        this.newchar=b;
    }

    public void execute() {

        String name = this.drink.getText();

        this.drink.setText(name.replace(oldchar,newchar));

    }
    public void undo()
    {
        Character oldc = this.oldchar;
        Character newc = this.newchar;
        this.oldchar=newc;
        this.newchar=oldc;
        execute();
        oldc = this.oldchar;
        newc = this.newchar;
        this.oldchar=newc;
        this.newchar=oldc;

    }


}
