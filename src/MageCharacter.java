import java.util.Scanner;

public class MageCharacter extends RPGCharacter {
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
        return CharacterClass.ClassType.MAGO;
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
        // Implementação para mago
    }

    void equipGear() {
        // Implementação para mago
    }

    String getName() {
        return name;
    }

    String getClassType() {
        return "Mago";
    }

    String getAttributes() {
        return "Gerando Atributos Aleatórios (D20):" + "Força: " + strength + ", Constituição: " + constitution + ", Inteligência: " + intelligence + ", Sabedoria: " + wisdom + ", Carisma: " + charisma + ", Destreza: " + dexterity;
    }

    String getAbilities() {
        return "Definindo habilidades iniciais: Linhagem Dracônica, Magia Selvagem";
    }

    String getGear() {
        return  "Armazenando equipamentos iniciais: Cajado, Livro de Magias, Poção de Mana";
    }

    public static void main(String[] args) {
        MageCharacter mage = new MageCharacter();
        mage.createCharacter();
    }

}