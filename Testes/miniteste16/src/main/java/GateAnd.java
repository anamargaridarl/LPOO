public class GateAnd extends LogicGate {
    public GateAnd(LogicVariable w1, LogicVariable x1, LogicVariable x2) throws Exception {
        super();
        this.output= w1;
        this.inputs =  new LogicVariable[2];
        this.inputs[0] = x1;
        this.inputs[1] = x2;
        this.symbol = "AND";

        if(w1.getCalculatedBy() == null)
            w1.addGate(this);
        else
            throw new ColisionException();


    }

    @Override
    public void CalculateValueOutput() {

        boolean value = inputs[0].getValue() && inputs[1].getValue();
        setOutputValue(value);

    }
}
