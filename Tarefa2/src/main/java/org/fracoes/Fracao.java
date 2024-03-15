public class Fracao {


    // Atributos 

    private int numerador;;
    private int denominador;


    // Construtor

    public Fracao (int n, int d){
        this.numerador = n;
        this.denominador = d;
    }


    // Metodos

    public Fracao somar (Fracao F) {
        if (this.denominador == F.denominador) {
            int novoNumerador = this.numerador + F.numerador;
            return new Fracao(novoNumerador, this.denominador);
        } else {
            novoNumerador = this.numerador * F.denominador + F.numerador * this.denominador;
            novoDenominador = this.denominador * F.denominador;
            return new Fracao(novoNumerador, novoDenominador);
        }
    }

    public Fracao subtrair (Fracao F){
        if (this.denominador == F.denominador) {
            int novoNumerador = this.numerador - F.numerador;
            return new Fracao(novoNumerador, this.denominador);
        } else {
            int novoNumerador = this.numerador * F.denominador - F.numerador * this.denominador;
            int novoDenominador = this.denominador * F.denominador;
            return new Fracao(novoNumerador, novoDenominador);
        }
    }
    
    public Fracao multiplicar (Fracao F){
        int novoNumerador = this.novoNumerador * F.denominador;
        int novoDenominador = this.novoDenominador * F.numerador;
        return new Fracao (novoNumerador, novoDenominador);
    }

    public Fracao dividir(Fracao F) {
        int novoNumerador = this.numerador * F.denominador;
        int novoDenominador = this.denominador * F.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }
}
