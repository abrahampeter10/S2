class Complex {
    int real, imag;
    int real1,imag1;
    Complex(int real, int imag){
        this.real=real;
        this.imag=imag;
    }
    void add(Complex c) {
         real1 = this.real + c.real;
         imag1 = this.imag + c.imag;
        display();
        }

    void display() {
        System.out.println(real1 + " + " + imag1 + "i");
    }
}

public class AddComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(5,6);


        c1.add(c2);

    }
}
