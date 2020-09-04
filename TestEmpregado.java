public class TestEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();
        //e agora, como configurar o tipo deles

        e1.setTipo(1);
        e2.setTipo(2);
        e3.setTipo(3);

        e1.setSalario(2000);

        e2.setSalario(1700);
        e2.setComicao(0.2);

        e3.setSalario(1500);
        e3.setBonus(400);

        System.out.println(e1.CalculaSalario());
        System.out.println(e2.CalculaSalario());
        System.out.println(e3.CalculaSalario());
        
    }
    
}
