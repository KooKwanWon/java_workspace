package game;


import java.util.Scanner;

public class Game {

    private static int playerHealth = 100;
    private static boolean hasWeapon = false;
    private static boolean hasTreasure = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("어드벤처 게임에 오신 것을 환영합니다!");
        System.out.print("캐릭터의 이름을 입력하세요: ");
        name = scanner.nextLine();

        System.out.println("\n" + name + "님, 모험을 시작합니다!");
        System.out.println("당신은 마법의 성에 갇혔습니다.");
        System.out.println("목표는 보물을 찾아 성을 탈출하는 것입니다.");

        while (playerHealth > 0 && !hasTreasure) {
            System.out.println("\n당신은 현재 방 A에 있습니다.");
            System.out.println("어느 방으로 이동하시겠습니까? (B 또는 C)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("B")) {
                roomB(scanner);
            } else if (choice.equalsIgnoreCase("C")) {
                roomC(scanner);
            } else {
                System.out.println("\n잘못된 선택입니다. 다시 선택해주세요.");
            }
        }

        if (hasTreasure) {
            System.out.println("\n축하합니다! 보물을 획득하여 게임을 성공적으로 마쳤습니다!");
        } else {
            System.out.println("\n체력이 모두 소진되었습니다. 게임 오버!");
        }
    }

    private static void roomB(Scanner scanner) {
        System.out.println("\n당신은 방 B로 이동했습니다.");
        if (!hasWeapon) {
            System.out.println("방 안에는 무기가 있습니다.");
            System.out.println("1. 무기를 집는다.");
        } else {
            System.out.println("방 안에는 빈 테이블이 있습니다.");
        }
        System.out.println("2. 방 A로 돌아간다.");

        int weaponChoice = scanner.nextInt();
        scanner.nextLine();

        if (weaponChoice == 1 && !hasWeapon) {
            hasWeapon = true;
            System.out.println("\n무기를 획득하였습니다!");
            System.out.println("이제 보물을 찾아 탈출하세요!");
        } else if (weaponChoice == 2) {
            System.out.println("\n방 A로 돌아갑니다.");
        } else {
            System.out.println("\n잘못된 선택입니다. 다시 선택해주세요.");
        }
    }

    private static void roomC(Scanner scanner) {
        System.out.println("\n당신은 방 C로 이동했습니다.");
        if (!hasTreasure) {
            System.out.println("방 안에는 보물 상자가 있습니다.");
            System.out.println("1. 보물 상자를 열어본다.");
        } else {
            System.out.println("방 안에는 아무것도 없습니다.");
        }
        System.out.println("2. 방 A로 돌아간다.");

        int treasureChoice = scanner.nextInt();
        scanner.nextLine();

        if (treasureChoice == 1 && hasWeapon && !hasTreasure) {
            hasTreasure = true;
            System.out.println("\n보물을 획득하였습니다!");
            System.out.println("이제 성을 탈출하세요!");
        } else if (treasureChoice == 2) {
            System.out.println("\n방 A로 돌아갑니다.");
        } else {
            System.out.println("\n잘못된 선택입니다. 다시 선택해주세요.");
        }
    }
}

