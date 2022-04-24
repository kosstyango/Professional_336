import java.util.ArrayList;

public class HomeWorkBarnaev {
    //    Создайте пример наследования, реализуйте класс Student и класс Aspirant,
    //    аспирант отличается от студента наличием некой научной работы.
    //    Класс Student содержит переменные: String firstName, lastName, group.
    //    А также, double averageMark, содержащую среднюю оценку.
    //    Создайте переменную типа Student, которая ссылается на объект типа Aspirant.
    //    Создайте метод getScholarship() для класса Student, который возвращает сумму стипендии.
    //    Если средняя оценка студента равна 5 баллам, то сумма 100 р, иначе 80 р. Переопределить этот метод в классе Aspirant.
    //    Если средняя оценка аспиранта равна 5 баллам, то сумма 200 р, иначе 180 р.
    //    Создайте массив типа Student, содержащий объекты класса Student и Aspirant.
    //    Вызовите метод getScholarship() для каждого элемента массива.
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList(); //создаём массив Студентов и Аспирантов
        list.add(new Student("Иван","Иванов", 134, 4.5));
        list.add(new Student("Пётр","Петров", 254, 4.2));
        list.add(new Student("Сидр","Сидоров", 185, 5.0));
        list.add(new Aspirant("Семён Семёныч","Разнополов", 0, 4.5, "Научная работа"));
        list.add(new Aspirant("Кузьма Николаевич","Кузьмин", 0, 5.0, "Научная работа2"));
        list.add(new Aspirant("Валерия Николаевна","Свистунова", 0, 5.0, "Научная работа3"));
        list.add(new Student("Екатерина","Синицина", 184, 4.0));

        for(int i=0; i<list.size(); i++) //Выводим инфо о стипендии всех Студентов и Аспирантов
            System.out.println(list.get(i).lastName+" получает ежемесячно: "+list.get(i).getScholarship());
    }
    public static class Student{
        String firstName;
        String lastName;
        int groupNumber;
        Double averageMark;

        public int getScholarship(){
            if (this.averageMark == 5) return 100;
            else return 80;
        }
        public Student (String firstName, String lastName, int groupNumber, Double averageMark) {
            this.firstName=firstName;
            this.lastName=lastName;
            this.groupNumber=groupNumber;
            this.averageMark=averageMark;
        }
    }
    public static class Aspirant extends Student{
        String scienceWork;

        public Aspirant(String firstName, String lastName, int groupNumber, Double averageMark, String scienceWork) {
            super(firstName, lastName, groupNumber, averageMark);
        }

        @Override
        public int getScholarship(){
            if (this.averageMark == 5) return 200;
            else return 180;
        }
    }
}