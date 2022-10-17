public class Main {
    public static void main(String[] args) {
        Human [] humans = new Human[4];
        humans [0] = new Human("Аня", "Москва", 29, "методист образовательных программ");
        humans [1] = new Human("Максим", "Минск", 35, "бренд-менеджер");
        humans [2] = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        humans [3] = new Human("Артём", "Москва", 27, "директор по развитию бизнеса");

        printHuman(humans);
    }

    static void printHuman (Human[] humans) {
        for (Human human : humans) {
            System.out.println(human);
        }
    }
}