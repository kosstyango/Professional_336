public class HomeWorkBarnaev {
    //    Создайте иерархию "Пользователи библиотеки" со следующими интерфейсами:
//    Читатель – берет и возвращает книги.
//    Библиотекарь – заказывает книги.
//    Поставщик книг – приносит книги в библиотеку.
//    Администратор – находит и выдает книги и уведомляет о просрочках времени возврата.
//    В методе public static void main создайте 2-3 объекта, реализующих эти интерфейсы.
    public static void main(String[] args) {

        Librerian Petrova = new Librerian("Петрова");
        Petrova.orderBooks("Война и мир", "Лев Николаевич Толстой");

        Reader Raskolnikov = new Reader("Раскольников");
        Raskolnikov.returnBooks("Как свергнуть правительство");

        Reader Smirnova = new Reader("Смирнова");
        Smirnova.takeBooks("Как учиться на пятёрки");

        Supplier Sidorov = new Supplier("Сидоров");
        Sidorov.bringBooks("Как учиться на пятёрки", 2.5);

        Admin Ivanova = new Admin("Иванова");
        Ivanova.giveawayBooks("Как учиться на пятёрки", 1999);
        Ivanova.delayInform("Раскольников", "Как свергнуть правительство", 14);
        Ivanova.findBooks("Домоводство", 1772);
    }

    public interface TakeBooksAble { //интерфейс "может взять книги"
        void takeBooks(String bookName);
    }

    public interface ReturnBooksAble { //интерфейс "может возвращать книги"
        void returnBooks(String bookName);
    }

    public interface OrderBooksAble { //интерфейс "может заказывать книги"
        void orderBooks(String bookName, String authorName);
    }

    public interface BringBooksAble { //интерфейс "может приносить книги"
        void bringBooks(String bookName, Double bookWeight);
    }

    public interface FindBooksAble { //интерфейс "может находить книги"
        void findBooks(String bookName, int issueYear);
    }

    public interface GiveawayBooksAble { //интерфейс "может выдавать книги"
        void giveawayBooks(String bookName, int issueYear);
    }

    public interface DelayInformAble { //интерфейс "может информировать о просрочке"
        void delayInform(String readerName, String bookName, int daysDelay);
    }
    public static class Librerian implements OrderBooksAble {
        String surname;

        public Librerian(String surname) {
            this.surname = surname;
        }
        @Override
        public void orderBooks(String bookName, String authorName) {
            System.out.println("Библиотекарь " + surname + ": Заказываю книгу \"" + bookName + "\", которую написал " + authorName + ".");
        }
    }

    public static class Supplier implements BringBooksAble {
        String surname;

        public Supplier(String surname) {
            this.surname = surname;
        }
        @Override
        public void bringBooks(String bookName, Double bookWeight) {
            System.out.println("Поставщик " + surname + ": принёс вам книгу \"" + bookName + "\", которую весит " + bookWeight + "кг.");
        }
    }

    public static class Reader implements TakeBooksAble, ReturnBooksAble {
        String surname;

        public Reader(String surname) {
            this.surname = surname;
        }
        @Override
        public void takeBooks(String bookName) {
            System.out.println("Читатель " + surname + ": беру книгу \"" + bookName + "\".");
        }

        @Override
        public void returnBooks(String bookName) {
            System.out.println("Читатель " + surname + ": сдаю книгу \"" + bookName + "\".");
        }
    }

    public static class Admin implements FindBooksAble, GiveawayBooksAble, DelayInformAble {
        String surname;

        public Admin(String surname) {
            this.surname = surname;
        }
        @Override
        public void findBooks(String bookName, int issueYear) {
            System.out.println("Администратор " + surname + ": нашёл книгу \"" + bookName + "\" " + issueYear + "года.");
        }

        @Override
        public void giveawayBooks(String bookName, int issueYear) {
            System.out.println("Администратор " + surname + ": выдаю книгу \"" + bookName + "\" " + issueYear + "года.");
        }

        @Override
        public void delayInform(String readerName, String bookName, int daysDelay) {
            System.out.println("Администратор " + surname + ": информирую читателя " + readerName + ": книга \"" + bookName + "\" " + "просрочена на " + daysDelay + "дней.");
        }
    }
}