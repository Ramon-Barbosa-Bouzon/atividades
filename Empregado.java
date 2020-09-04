public class Empregado {
    private String nome;
    private int idade;
    private double comicao;
    private double salario;
    private double bonus;
    private int tipo;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalario() {
        return salario;
    }

    public double getComicao() {
        return comicao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setComicao(double comicao) {
        this.comicao = comicao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double CalculaSalario(){

        switch( getTipo() ){

            case 1:
            return salario;
            
            case 2:
            return salario * comicao;
            
            case 3:
            return salario + bonus;

            default:
            return 0;
        
        }
        

    }

}