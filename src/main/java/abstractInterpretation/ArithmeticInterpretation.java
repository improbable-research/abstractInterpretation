package abstractInterpretation;

import abstractInterpretation.concreteInterpretation.ABool;
import abstractInterpretation.concreteInterpretation.ADouble;
import abstractInterpretation.concreteInterpretation.AInt;

public class ArithmeticInterpretation implements AbstractInterpretation<ADouble,AInt,ABool> {
    @Override
    public ADouble newDouble(double x) {
        return new ADouble(x);
    }

    @Override
    public AInt newInt(int i) {
        return new AInt(i);
    }

    @Override
    public ABool newBool(boolean b) {
        return new ABool(b);
    }
}
