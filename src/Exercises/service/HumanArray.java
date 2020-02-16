package Exercises.service;

import Exercises.model.Human;

import java.util.Arrays;

public class HumanArray {
    private Human [] humans;

    public HumanArray(Human[] humans) {
        this.humans = humans;
    }
    public void addHuman(Human human, int index){
        humans[index] = human;
    }

    public Human[] getHumans() {
        return humans;
    }

    @Override
    public String toString() {
        return "HumanArray{" +
                "humans=" +"\n"+ Arrays.toString(humans) +
                '}';
    }

    public String findFirsSurnameInArray(Human[] humans) {
        int variable;
        int lowestNumber = Integer.MAX_VALUE;
        String firstSurname = null;
        for (int i = 0; i < humans.length ; i++) {
            for (int j = 0; j < humans.length ; j++) {
                variable = humans[i].getSurname().compareTo(humans[j].getSurname());
                if (variable < lowestNumber) {
                    lowestNumber = variable;
                    firstSurname = humans[i].getSurname();
                }
            }
        }
        return firstSurname;
    }

    public String findLastSurnameInArray(Human[] humans) {
        int variable;
        int lowestNumber = Integer.MIN_VALUE;
        String lastSurname = null;
        for (int i = 0; i < humans.length ; i++) {
            for (int j = 0; j < humans.length ; j++) {
                variable = humans[i].getSurname().compareTo(humans[j].getSurname());
                if (variable > lowestNumber) {
                    lowestNumber = variable;
                    lastSurname = humans[i].getSurname();
                }
            }
        }
        return lastSurname;
    }}

