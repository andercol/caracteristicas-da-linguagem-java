package one.diditalinnovation.interfaces;

public class Fiesta implements Carro, Veiculo{

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "123AFG547TR";
    }

   /* quando uma classe implementa duas interfaces que tem métodos "default" iguais é obrigatório a implementação deste método
    pois o compilador não sabe qual utilizar.
    */
    @Override
    public void ligar(){
        //código - posso definir um comportamento

        Carro.super.ligar(); // ou posso delegar o comportamente de uma das duas interfaces

        Veiculo.super.ligar(); // ou posso delegar o comportamente de uma das duas interfaces
    }
}
