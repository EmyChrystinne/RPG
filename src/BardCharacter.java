import java.util.Scanner;

public class BardCharacter extends RPGCharacter {
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
        return CharacterClass.ClassType.BARDO;
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
        // Implementação para Bardo
    }

    void equipGear() {
        // Implementação para Bardo
    }

    String getName() {
        return name;
    }

    String getClassType() {
        return "Bardo";
    }

    String getAttributes() {
        return "Gerando Atributos Aleatórios (D20):" + "Força: " + strength + ", Constituição: " + constitution + ", Inteligência: " + intelligence + ", Sabedoria: " + wisdom + ", Carisma: " + charisma + ", Destreza: " + dexterity;
    }

    String getAbilities() {
        return "Definindo habilidades iniciais: Encantar, Improvisar, Manipular Energia Musical";
    }

    String getGear() {
        return "Armazenando equipamentos iniciais: Alaúde, Manto Colorido, Kit de Instrumentos";
    }

    public static void main(String[] args) {
        BardCharacter bard = new BardCharacter();
        bard.createCharacter();
    }

}