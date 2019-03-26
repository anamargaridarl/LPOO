import java.util.ArrayList;
import java.util.List;

public class LogicVariable {

    private String name;
    private Boolean value;
    private LogicGate gate;

    public LogicVariable(String name, boolean value) {
        this.name= name;
        this.value = value;
        this.gate = null;

    }

    public LogicVariable(String name) {
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public boolean getValue() {

        if(gate != null)
        gate.CalculateValueOutput();

        return value;
    }

    public void setValue(boolean b) {
        value = b;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        LogicVariable p = (LogicVariable) o;
        return name == p.getName();
    }

    public LogicGate getCalculatedBy() {
        return gate;
    }

    public void addGate(LogicGate gate)
    {
        this.gate =  gate;

        if(value == null)
            gate.CalculateValueOutput();
    }


}
