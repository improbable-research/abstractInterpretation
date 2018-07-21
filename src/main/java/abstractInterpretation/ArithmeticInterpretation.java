package abstractInterpretation;

import abstractInterpretation.concreteInterpretation.ABool;
import abstractInterpretation.concreteInterpretation.ADouble;
import abstractInterpretation.concreteInterpretation.AInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

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

    @Override
    public void If(@NotNull ABool condition, @NotNull Function0<Unit> ifLambda) {

    }
}
