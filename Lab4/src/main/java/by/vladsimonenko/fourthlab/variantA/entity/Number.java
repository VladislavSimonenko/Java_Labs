package by.vladsimonenko.fourthlab.variantA.entity;

/**
 * Class that represent the number for simple fraction
 */
public class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public Number() {
        super();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Number number1 = (Number) o;

        return number == number1.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
