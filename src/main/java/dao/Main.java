package dao;

public class Main {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        Student s = dao.getName(31);
        System.out.println(s);
        System.out.println(dao.list);
    }
}
