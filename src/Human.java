public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;

    private final String job;

    Human(String name, String town, int yearOfBirth, String job) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;
    }

    public int getYearOfBirth() {
        return 2022 - yearOfBirth;
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
