import java.util.Scanner;

public class ClericCharacter extends RPGCharacter {
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
        return CharacterClass.ClassType.CLERIGO;
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
        // Implementação para Clerigo
    }

    void equipGear() {
        // Implementação para Clerigo
    }

    String getName() {
        return name;
    }

    String getClassType() {
        return "Clérigo";
    }

    String getAttributes() {
        return "Gerando Atributos Aleatórios (D20):" + "Força: " + strength + ", Constituição: " + constitution + ", Inteligência: " + intelligence + ", Sabedoria: " + wisdom + ", Carisma: " + charisma + ", Destreza: " + dexterity;
    }

    String getAbilities() {
        return "Definindo habilidades iniciais: Cura, Proteção Divina, Canalizar Energia";
    }

    String getGear() {
        return "Armazenando equipamentos iniciais: Manto Sagrado, Símbolo Divino, Poção de Cura";
    }

    public static void main(String[] args) {
        ClericCharacter Cleric = new ClericCharacter();
        Cleric.createCharacter();
    }

}