
public class ParameterValidator {

    public boolean validateIfPositive(double localParameter) {

        if (localParameter > 0) return true;
        else return false;
    }
    public boolean validateIfZero(double localParameter)
    {
        if (localParameter == 0) return true;
        else return false;
    }


}
