import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex2();
    }

    static List<Integer> createListInt(int size, int min, int max) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }


    static void ex0() {
//      Дан произвольный список чисел, удалить из него четные
        int s = (int) (Math.random() * 100);
        List<Integer> list = createListInt(s, 1, 20);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
    static void ex1(){
        //Задан целочисленный список ArrayList.
        //Найти минимальное, максимальное и среднее арифметическое из этого списка.
        //Collections.max()
        int s = (int)(Math.random()*100);

        int m = (int)(Math.random()*100);
        List<Integer> list = createListInt(s, 0, m);
        System.out.println("Список "+list);
        System.out.println("Макс "+Collections.max(list));
        System.out.println("Мин "+Collections.min(list));
        int n = 0;
        int lSize= list.size();
        for (int i = 0; i < list.size(); i++) {
            n=n+list.get(i);
        }
        System.out.println("Общая сумма "+n);
        System.out.println("Размер массива "+lSize);

        double n1=(double)n;
        double lSize1=(double)lSize;
        double j = (double)(Math.round((n1/lSize1)*100))/100;

        System.out.println(j);
    }
    static void ex2() {
//      Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//      Вывести название каждой планеты и количество его повторений в списке.

        int n = (int) (Math.random() * 10);

        List<String> finList = new ArrayList<>();

        List<String> planetList = new ArrayList<String>();
        List<String> finalList = new ArrayList<String>();
        planetList.add("Меркурий");
        planetList.add("Венера");
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Юпитер");
        planetList.add("Сатурн");
        planetList.add("Уран");
        planetList.add("Нептун");
        planetList.add("Плутон");

        List<String>randomPlanetList = new ArrayList<>();

        createRandomList(randomPlanetList, planetList, finList);

        System.out.println("список планет "+planetList);
        System.out.println("случайный список планет "+randomPlanetList);
        System.out.println("Окончательный список "+finList);

    }

    static void createRandomList(List<String> randomPlanetList, List planetList, List finList){

        int count=0;


        int sizeArray = (int)(Math.random()*10+1);
        System.out.println("random size "+sizeArray);
        System.out.println("sizeArray "+sizeArray);
        for (int i = 0; i < sizeArray-1; i++) {

            randomPlanetList.add((String) planetList.get((int)(Math.random()*9)));
        }

        for (int i = 0; i < planetList.size(); i++) {
            count=0;
            for (int j = 0; j <randomPlanetList.size(); j++) {
                if(randomPlanetList.get(j)==planetList.get(i)){
                    count++;
                }
            }
            if(count!=0){
                finList.add(String.valueOf(count)+" - "+(String)planetList.get(i) );
            }
        }

    }

}