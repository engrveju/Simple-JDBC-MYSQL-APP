package dao;

public class Student {
    public int id;
    public String firstname;
    public String surname;
    public String town;
    public int age;

    public int getIs() {
        return id;
    }

    public void setIs(int is) {
        this.id = is;
    }

    public String getName() {
        return firstname;
    }

    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", town='" + town + '\'' +
                ", age=" + age +
                "}\n";
    }
}
