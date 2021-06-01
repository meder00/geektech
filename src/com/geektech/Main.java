package com.geektech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shelter romashka = new Shelter("Romashka","Ibraimova 90");

        Dog sharik = new Dog();
        sharik.setShelter(romashka);

        Dog layka = new Dog("Layka","Чихуахуа",Color.BLACK,romashka);
        layka.setShelter(romashka);

        Dog barsik = new Dog("Barsik","Домашняя",Color.BROWN,romashka,new String[]{"Стоять","Сидеть"});
        barsik.setShelter(romashka);

        System.out.println("________________");

        System.out.println(sharik.getInfo());
        System.out.println(layka.getInfo());
        System.out.println(barsik.getInfo());

        System.out.println("________________");

        barsik.makeVoice("гав гав",3);
        System.out.println("________________");

        layka.makeVoice(4," АВ АВ ");
        System.out.println("________________");

        sharik.makeVoice("ЫЫР ЫЫР");



    }
}
