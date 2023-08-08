import java.util.Scanner;

    public class ElfCharacter extends RPGCharacter {
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
        return CharacterClass.ClassType.ELFO;
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
        // Implementação para Elfo
    }

    void equipGear() {
        // Implementação para Elfo
    }

    String getName() {
        return name;
    }

    String getClassType() {
        return "Elfo";
    }

    String getAttributes() {
        return "Gerando Atributos Aleatórios (D20):" + "Força: " + strength + ", Constituição: " + constitution + ", Inteligência: " + intelligence + ", Sabedoria: " + wisdom + ", Carisma: " + charisma + ", Destreza: " + dexterity;
    }

        String getAbilities() {
            return "Definindo habilidades iniciais: Agilidade Élfica, Visão Aguçada, Conexão com a Natureza";
        }

        String getGear() {
            return "Armazenando equipamentos iniciais: Arco Élfico, Vestes Leves, Amuleto Ancestral";
        }

    public static void main(String[] args) {
        ElfCharacter elf = new ElfCharacter();
        elf.createCharacter();
    }

}