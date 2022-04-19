public class HomeWorkBarnaev {
    //    Создать класс Person, который содержит:
    //    переменные fullName, age;
    //    методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
    //    Добавьте два конструктора  - Person() и Person(fullName, age).
    //    Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)
    public static void main(String[] args) {
        Person person1 = new Person(); //дефолтный человек
        person1.move();
        person1.talk();
        Person person2 = new Person("Константин Сергеевич", 45);
        person2.move();
        person2.talk();
    }

    public static class Person {
        String fullNAme;
        int age;

        public Person() { //дефолтный конструктор
        }

        public Person(String fullName, int age) { //конструктор с двумя полями
            this.age = age;
            this.fullNAme = fullName;
        }

        void move() {
            System.out.println(this.fullNAme + " person идёт");
        }
        void talk() {
            System.out.println(this.fullNAme + " person говорит");
        }
    }
}