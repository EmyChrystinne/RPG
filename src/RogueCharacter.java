import java.util.Scanner;

public class RogueCharacter extends RPGCharacter {
    private String name;
    private int strength;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int dexterity;


    void chooseName(String name) {
        this.name = name;
    }

    @Override
    CharacterClass chooseClass(Scanner scanner) {
        return null;
    }

    CharacterClass.ClassType chooseClass() {
        return CharacterClass.ClassType.LADINO;
    }

    void assignAttributes() {
        strength = rollD20();
        constitution = rollD20();
        intelligence = rollD20();
        wisdom = rollD20();
        charisma = rollD20();
        dexterity = rollD20();
    }

    void selectAbilities() {
        // Implementação para Ladino
    }

    void equipGear() {
        // Implementação para Ladino
    }

    String getName() {
        return name;
    }

    String getClassType() {
        return "Ladino";
    }

    String getAttributes() {
        return "Gerando Atributos Aleatórios (D20):" + "Força: " + strength + ", Constituição: " + constitution + ", Inteligência: " + intelligence + ", Sabedoria: " + wisdom + ", Carisma: " + charisma + ", Destreza: " + dexterity;
    }

    String getAbilities() {
        return "Definindo habilidades iniciais: Furtividade, Golpe Surpresa, Trapaças";
    }

    String getGear() {
        return "Armazenando equipamentos iniciais: Adaga, Capa de Camuflagem, Kit de Ferramentas de Ladrão";
    }

    public static void main(String[] args) {
        RogueCharacter rogue = new RogueCharacter();
        rogue.createCharacter();
    }

}