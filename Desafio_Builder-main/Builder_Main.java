package Builder;

public class Builder_Main {
    public static void main(String[] args) {
        //Implemente a chamada do Builder

        Personagem guerreiro = new GuerreiroBuilder()
            .comNome("Thorfin")
                .comForca(5)
            .build();

        Personagem mago = new MagoBuilder()
            .comNome("Merlin")
                .build();


        Personagem arqueiro = new ArqueiroBuilder()
            .comNome("Ashe")
                    .build();

        System.out.println("=== GUERREIRO ===");
        System.out.println(guerreiro);

        System.out.println("=== MAGO ===");
        System.out.println(mago);

        System.out.println("=== ARQUEIRO ===");
        System.out.println(arqueiro);
    }
}