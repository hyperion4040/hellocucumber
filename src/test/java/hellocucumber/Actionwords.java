package hellocucumber;

import org.junit.Assert;

class AbsoluteValue{
    static int absoluteValue(int value){
        return Math.abs(value);
    }
}


public class Actionwords {

    private int testValue,returnValue;

    public void enteredValue() {
        this.testValue = 2;
    }

    public void valueIsPositive() {
        this.returnValue = AbsoluteValue.absoluteValue(testValue);
    }

    public void returnedValuesIsPositive() {
        Assert.assertEquals(2,returnValue);
    }

    public void valueIsNegative() {
        this.returnValue = AbsoluteValue.absoluteValue(-testValue);
    }
}