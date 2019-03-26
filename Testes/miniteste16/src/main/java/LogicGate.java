public abstract class LogicGate {

    protected LogicVariable output;
    protected LogicVariable[] inputs;
    protected String symbol;


    public LogicVariable getOutput() {
        return output;
    }

    public LogicVariable[] getInputs() {
        return inputs;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setOutputValue(boolean value) {

        this.output.setValue(value);
    }

    public abstract void CalculateValueOutput();

}
