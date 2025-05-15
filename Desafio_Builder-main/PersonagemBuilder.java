package Builder;

public interface PersonagemBuilder {

    //Faça o restante do builder

    PersonagemBuilder comNome(String nome);
    PersonagemBuilder comVida(int vida);
    PersonagemBuilder comMana(int mana);

    PersonagemBuilder comInteligencia(int inteligencia);
PersonagemBuilder comAgilidade (int agilidade);
    PersonagemBuilder comForca (int forca);

    Personagem build();
}