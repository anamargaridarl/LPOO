public class GateNot extends LogicGate {
    public GateNot(LogicVariable y1, LogicVariable w2) throws Exception {
        super();
        this.output= y1;
        this.inputs =  new LogicVariable[1];
        this.inputs[0] = w2;
        this.symbol = "NOT";


        if(y1.getCalculatedBy() == null)
            y1.addGate(this);
        else
            throw new ColisionException();


    }

    @Override
    public void CalculateValueOutput() {

        boolean value = !(inputs[0].getValue());
        setOutputValue(value);

    }
}
