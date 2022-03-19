public class Player {
    private String name;
    private String surname;
    private long yearOfBirth;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(long yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Player(String name, String surname, long yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

}
