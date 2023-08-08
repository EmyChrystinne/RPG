import java.util.Scanner;

public class HalfElfCharacter extends RPGCharacter {
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
        return CharacterClass.ClassType.MEIOELFO;
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
        // Implementação para meio-elfo
    }

    void equipGear() {
        // Implementação para meio-elfo
    }

    String getName() {
        return name;
    }

    String getClassType() {
        return "Meio-Elfo";
    }

    String getAttributes() {
        return "Gerando Atributos Aleatórios (D20):" + "Força: " + strength + ", Constituição: " + constitution + ", Inteligência: " + intelligence + ", Sabedoria: " + wisdom + ", Carisma: " + charisma + ", Destreza: " + dexterity;
    }

    String getAbilities() {
        return "Definindo habilidades iniciais: Herança Dupla, Diplomacia, Adaptabilidade";
    }

    String getGear() {
        return "Armazenando equipamentos iniciais: Espada Curta, Vestes Elegantes, Medalhão de Ancestralidade";
    }

    public static void main(String[] args) {
        HalfElfCharacter halfelf = new HalfElfCharacter();
        halfelf.createCharacter();
    }

}