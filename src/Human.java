public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    Human(String name, String town, int yearOfBirth, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    public int getYearOfBirth() {
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }
        return 2022 - yearOfBirth;
    }

    public String getName() {
        if (name.equals("")) {
            name = "Информация не указана";
        }
        return name;
    }

    public String getTown() {
        if (town.equals("")) {
            town = "Информация не указана";
        }
        return town;
    }

    public String getJob() {
        if (job.equals("")) {
            job = "Информация не указана";
        }
        return job;
    }

    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown()+ ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + getJob() + ". Будем знакомы!";
    }
}
