import java.util.Random;
import java.util.Scanner;

public abstract class RPGCharacter {
    final void createCharacter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do personagem: ");
        String name = scanner.nextLine();

        System.out.println("Escolha a classe do personagem: (Guerreiro/Mago/Bardo/Ladino/Clerigo/Druida/Elfo/Anao/MeioElfo)");
        String classChoice = scanner.nextLine().toUpperCase();
        ;

        chooseName(name);
        assignAttributes();
        selectAbilities();
        equipGear();

        displayCharacterSheet();

        scanner.close();
    }

    abstract void chooseName(String name);
    abstract CharacterClass chooseClass(Scanner scanner);
    abstract void assignAttributes();
    abstract void selectAbilities();
    abstract void equipGear();

    void displayCharacterSheet() {
        System.out.println("\nFicha do Personagem:");
        System.out.println("Nome: " + getName());
        System.out.println("Classe: " + getClassType());
        System.out.println("Atributos: " + getAttributes());
        System.out.println("Habilidades: " + getAbilities());
        System.out.println("Equipamento: " + getGear());
    }

    abstract String getName();
    abstract String getClassType();
    abstract String getAttributes();
    abstract String getAbilities();
    abstract String getGear();

    protected int rollD20() {
        return new Random().nextInt(20) + 1;
    }
}
