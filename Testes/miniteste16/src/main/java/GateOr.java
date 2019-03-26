public class GateOr extends LogicGate {
    public GateOr(LogicVariable w2, LogicVariable w1, LogicVariable x3) throws Exception{
        super();
        this.output= w2;
        this.inputs =  new LogicVariable[2];
        this.inputs[0] = w1;
        this.inputs[1] = x3;
        this.symbol = "OR";

        if(w2.getCalculatedBy() == null)
            w2.addGate(this);
        else
            throw new ColisionException();



    }

    @Override
    public void CalculateValueOutput() {

        boolean value = inputs[0].getValue() || inputs[1].getValue();
        setOutputValue(value);

    }

}
