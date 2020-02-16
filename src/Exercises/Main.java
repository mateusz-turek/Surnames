package Exercises;

import Exercises.model.Human;
import Exercises.service.HumanArray;

public class Main {

    public static void main(String[] args) {
        HumanArray humanArray = new HumanArray(new Human[23]);
        humanArray.addHuman(new Human("Andrew", "Edams"),0);
        humanArray.addHuman(new Human("Andrew", "Badams"),1);
        humanArray.addHuman(new Human("Andrew", "Cadams"),2);
        humanArray.addHuman(new Human("Andrew", "Dadams"),3);
        humanArray.addHuman(new Human("Andrew", "Adams"),4);
        humanArray.addHuman(new Human("Andrew", "Fadams"),5);
        humanArray.addHuman(new Human("Andrew", "Gadams"),6);
        humanArray.addHuman(new Human("Andrew", "Hadams"),7);
        humanArray.addHuman(new Human("Andrew", "Iadams"),8);
        humanArray.addHuman(new Human("Andrew", "Jadams"),9);
        humanArray.addHuman(new Human("Andrew", "Zzadams"),10);
        humanArray.addHuman(new Human("Andrew", "Zadams"),22);
        humanArray.addHuman(new Human("Andrew", "Ladams"),11);
        humanArray.addHuman(new Human("Andrew", "Madams"),12);
        humanArray.addHuman(new Human("Andrew", "Nadams"),13);
        humanArray.addHuman(new Human("Andrew", "Oadams"),14);
        humanArray.addHuman(new Human("Andrew", "Padams"),15);
        humanArray.addHuman(new Human("Andrew", "Radams"),16);
        humanArray.addHuman(new Human("Andrew", "Sadams"),17);
        humanArray.addHuman(new Human("Andrew", "Tadams"),18);
        humanArray.addHuman(new Human("Andrew", "Uadams"),19);
        humanArray.addHuman(new Human("Andrew", "Wadams"),20);
        humanArray.addHuman(new Human("Andrew", "Kadams"),21);

        System.out.println(humanArray.toString());
        System.out.println("==================LAST=================");
        System.out.println(humanArray.findLastSurnameInArray(humanArray.getHumans()));
        System.out.println("=================FIRST=================");
        System.out.println(humanArray.findFirsSurnameInArray(humanArray.getHumans()));
    }
}
