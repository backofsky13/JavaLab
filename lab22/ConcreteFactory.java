package lab22;
public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new ComplexNumber(10, 3);
    }
    @Override
    public Complex createComplex(int real, int imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}