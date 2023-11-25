package exceptions.example1;

public class ExeptionHandlingExample1 {

    /**
     * Expetionai JAVA kalboje yra tam tikras ivykis, Eventas.
     *
     * Pagrindiniai, eventai ara exceptionai programoje gali nutikti del keletos dalyku:
     * 1. Dinges internetas.
     * 2. Invalid input data.
     * 3. Kodo klaidos.
     * 4. Nepakanka atminties
     *
     * Egzsituoja du exceptionu tipai  - unchecked ir checked.
     *
     * Unchecked exception:
     * 1. ARithmeticException
     * 2. IndexOutOfBoundsException
     * 3.ClassCastException
     * 4. NullPointerException
     * 5. IllegalArgumentException
     *
     * Unchecked exceptions SHOULD NOT BE HANDLED with try/catch blocks. They should be threated as code bugs and should be fixed.
     *
     *
     *Checked Exceptions:
     *
     * 1. FileNotFoundExceptions
     * 2. IOExceptions
     * 3.SQLExceptions
     * 4.RomasCustomException
     *
     * Checked types of exceptions should be handled with try/catch blocks.
     *
     * @param args
     */
    public static void main(String[] args) {

    }
}
