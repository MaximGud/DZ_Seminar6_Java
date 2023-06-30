import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        // Подумать над структурой класса Ноутбук(или Единорогов) для магазина
        // техники - выделить поля и методы. Реализовать в java.
        // Создать множество ноутбуков.
        // Переопределить toString, equals и hashCode(как на семинаре).
        // Вывести на печать экземпляры класса, сравнить пару экземпляров и найти
        // один экземпляр в наборе.
        Notebook nt1 = new Notebook("Toshiba", 24000, 2019);
        Notebook nt2 = new Notebook("Sony", 13000, 2022);
        Notebook nt3 = new Notebook("Acer", 22000, 2017);
       
        // создаем множество
        HashSet<Notebook> notebooks = new HashSet<Notebook>();
        notebooks.add(nt1);
        notebooks.add(nt2);
        notebooks.add(nt3);
       
        // вывод списка
        System.out.println(nt1);
        System.out.println(nt2);
        System.out.println(nt3);
       
        // сравнение моделей
        System.out.println(nt1.equals(nt2));
       
        // вывод хэш-кода модели
        System.out.println(nt1.hashCode());

    }
}
