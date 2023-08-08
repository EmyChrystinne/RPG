import java.util.Scanner;

public class DruidCharacter extends RPGCharacter {
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
        return CharacterClass.ClassType.DRUIDA;
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
        // Implementação para Druida
    }

    void equipGear() {
        // Implementação para Druida
    }

    String getName() {
        return name;
    }

    String getClassType() {
        return "Druido";
    }

    String getAttributes() {
        return "Gerando Atributos Aleatórios (D20):" + "Força: " + strength + ", Constituição: " + constitution + ", Inteligência: " + intelligence + ", Sabedoria: " + wisdom + ", Carisma: " + charisma + ", Destreza: " + dexterity;
    }

    String getAbilities() {
        return "Definindo habilidades iniciais: Forma Selvagem, Magia da Natureza, Comunhão Animal";
    }

    String getGear() {
        return "Armazenando equipamentos iniciais: Cajado de Carvalho, Vestes Naturais, Pergaminho de Encantamentos da Natureza";
    }

    public static void main(String[] args) {
        DruidCharacter druid = new DruidCharacter();
        druid.createCharacter();
    }

}