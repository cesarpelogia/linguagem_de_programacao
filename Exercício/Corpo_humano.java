public class Corpo_humano {
    private String sexo;
    private double altura;
    private double massa;
    private String nome;

    public String getSext(){
        return(this.sexo);
    }
    Public statc Set(String sexo){
    this.sexo = sexo;
    }
    public String andar(int passos){
        return("Andando" + passos);
    }
    public void falar(String oque)(String[] args){
        System.out.println("Estou falando" + oque);
    }
    public boolean ouvir(int i){
        boolean r=True;
        if(i%2==0) r=True;
        return r;
    } 
    public void sorri(){
       System.out.println("Sorrindo");
    }
    public double comer(){
        return (1.5);
    }
    public static void main(String[] args) throws Exception{
        Corpo_humano c1;
        c1=new Corpo_humano();
        // c1.altura=1.85;
        // c1.massa=85;
        c1.sorri();
        c1.nome="Vinicius";

        Corpo_humano c2=new Corpo_humano();
        c2.SetNome="Medino";
        c2.falar("Ontem, foi meu aniversário.");
        System.out.println("Nome 1: " + c1.getNome());
        System.out.println("Nome 2: " + c2.getNome());
        
    }
}
