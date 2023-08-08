import java.util.Scanner;

public class RPGCharacterCreatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Criador de Personagens de RPG!");
        System.out.print("Digite o nome do personagem: ");
        String name = scanner.nextLine();

        System.out.println("Escolha a classe do personagem: (Guerreiro/Mago/Bardo/...)");
        String classChoice = scanner.nextLine();

        RPGCharacter character = createCharacter(classChoice);

        character.chooseName(name);
        character.assignAttributes();
        character.selectAbilities();
        character.equipGear();
        character.displayCharacterSheet();

        scanner.close();
    }

    public static RPGCharacter createCharacter(String classChoice) {
        switch (classChoice.toUpperCase()) {
            case "GUERREIRO" -> {
                return new WarriorCharacter();
            }
            case "MAGO" -> {
                return new MageCharacter();
            }
            case "BARDO" -> {
                return new BardCharacter();
            }
            case "LADINO" -> {
                return new RogueCharacter();
            }
            case "CLERIGO" -> {
                return new ClericCharacter();
            }
            case "DRUIDA" -> {
                return new DruidCharacter();
            }
            case "ELFO" -> {
                return new ElfCharacter();
            }
            case "ANAO" -> {
                return new DwarfCharacter();
            }
            case "MEIOELFO" -> {
                return new HalfElfCharacter();
            }
            default -> {
                System.out.println("Classe desconhecida. Criando um guerreiro por padrão.");
                return new WarriorCharacter();
            }
        }
    }
}
