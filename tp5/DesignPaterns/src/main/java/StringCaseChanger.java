public class StringCaseChanger implements StringTransformer{

    private StringDrink drink;

    public StringCaseChanger(StringDrink drink) {
        this.drink = drink;
    }

    public void execute() {
        String name = this.drink.getText();
        StringBuilder newname = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            if(Character.isLowerCase(name.charAt(i)))
                newname.append(Character.toUpperCase(name.charAt(i)));
            else
                newname.append(Character.toLowerCase(name.charAt(i)));
        }

        this.drink.setText(newname.toString());

    }

    public void undo()
    {
        execute();
    }
}
