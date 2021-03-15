package com.company;

import com.company.objects.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Cat cat = new Cat("Барсик");
        Robot robot = new Robot("T-800");
        Human human = new Human("Мадара");

        cat.jump(2);
        human.run(1000);
        robot.jump(1);
        System.out.println("--------------------------");


        Participant participant1 = new Participant("Валодя", 50, 1);
        Participant participant2 = new Participant("Иноске", 500, 3);
        Participant participant3 = new Participant("Мадара", 5000, 30);


        Wall wall = new Wall(5);
        Treadmill treadmill = new Treadmill(500);
        Wall wall1 = new Wall(1);
        Treadmill treadmill1 = new Treadmill(50);
        Wall wall2 = new Wall(25);
        Treadmill treadmill2 = new Treadmill(2000);


//        HashMap<Wall, Treadmill> road = new HashMap<>();
//        road.put(wall, treadmill);
//        road.put(wall1, treadmill1);
//        road.put(wall2, treadmill2);
        // мне нужен был один класс чтоб церез цыкл все участники прохдили через все препядствия
        // с 2-мя классами я долго пробовал но не получилось, так что рукой прописал в цыкле
        //если вы знаете как это сделать напишите мне в Telegram пожалуйста


        ArrayList<Participant> participants = new ArrayList<>();
        participants.add(participant1);
        participants.add(participant2);
        participants.add(participant3);

        startObstacleCourse(participants,treadmill,wall);
        startObstacleCourse(participants,treadmill1,wall1);
        startObstacleCourse(participants,treadmill2,wall2);

    }

    //куда можно было это запихнуть?
    public static void startObstacleCourse(ArrayList<Participant> participants, Treadmill treadmill, Wall wall) {
        for (Participant participant : participants) {
            participant.start(treadmill, wall);
        }
        System.out.println("-------------Конец-------------");
    }



}
