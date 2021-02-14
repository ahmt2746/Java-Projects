package subClasses;

public class subCalculator {

    public class Ops {
        float FirstNumber;
        float SecondNumber;
        float Result;
    };

    public Ops GetOperations () {
        Ops operations = new Ops();
        return operations;
    }

    public float AdditionOperation (float firsNumber, float secondNumber) {
        float result = firsNumber + secondNumber;
        return result;
    }
    public float SummingOperation (float firsNumber, float secondNumber) {
        float result = firsNumber - secondNumber;
        return result;
    }
    public float MultiplierOperation (float firsNumber, float secondNumber) {
        float result = firsNumber * secondNumber;
        return result;
    }
    public float DividerOperation (float firsNumber, float secondNumber) {
        float result = firsNumber / secondNumber;
        return result;
    }

}
