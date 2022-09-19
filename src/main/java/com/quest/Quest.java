package com.quest;

import lombok.Getter;

@Getter

public class Quest {
   Integer id;

    Integer left;
    Integer right;
    Boolean isWin;

    String question;
    String leftAnswer;
    String rightAnswer;


    public Quest() {
        this.id=1;
        this.left = null;
        this.right = null;
        this.isWin = false;
        String question = null;
        String leftAnswer = null;
        String rightAnswer = null;
    }

    public Quest(Integer id, Integer left, Integer right, Boolean isWin, String question, String leftAnswer, String rightAnswer) {
        this.id=id;
        this.left = left;
        this.right = right;
        this.isWin = isWin;
        this.question = question;
        this.leftAnswer = leftAnswer;
        this.rightAnswer = rightAnswer;
    }


}
