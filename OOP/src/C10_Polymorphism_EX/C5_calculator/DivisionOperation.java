package C10_Polymorphism_EX.C5_calculator;

import java.util.ArrayList;
import java.util.List;

public class DivisionOperation implements Operation{

    private List<Integer> operands;
    private int result;

    public DivisionOperation(){

        this.operands = new ArrayList<> ();
    }

    @Override
    public void addOperand(int operand) {
        this.operands.add(operand);

        if (this.isCompleted()) {
            this.result = this.operands.get(0) / this.operands.get(1);
        }
    }

    @Override
    public boolean isCompleted() {

        return this.operands.size() == 2;
    }

    @Override
    public int getResult()
    {
        return this.result;
    }
}
