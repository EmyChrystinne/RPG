import java.util.Scanner;

public class WarriorCharacter extends RPGCharacter {
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
        return CharacterClass.ClassType.GUERREIRO;
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
        // Implementação para guerreiro
    }

    void equipGear() {
        // Implementação para guerreiro
    }

    String getName() {
        return name;
    }

    String getClassType() {
        return "Guerreiro";
    }

    String getAttributes() {
        return "Gerando Atributos Aleatórios (D20):" + "Força: " + strength + ", Constituição: " + constitution + ", Inteligência: " + intelligence + ", Sabedoria: " + wisdom + ", Carisma: " + charisma + ", Destreza: " + dexterity;
    }

    String getAbilities() {
        return "Definindo habilidades iniciais: Camarada, Longas Noites";
    }

    String getGear() {
        return  "Armazenando equipamentos iniciais: Espada Longa, Escudo, Armadura de Couro";
    }

    public static void main(String[] args) {
        WarriorCharacter warrior = new WarriorCharacter();
        warrior.createCharacter();
    }

}