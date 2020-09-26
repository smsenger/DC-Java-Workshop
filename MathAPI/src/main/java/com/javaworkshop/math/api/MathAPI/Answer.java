package com.javaworkshop.math.api.MathAPI;

import java.util.Date;

public class Answer {

    private double answer;
    private int inputs;
    private Date when = new Date();
    private String operation;

    public double getAnswer() {
        return answer;
    }

    public void setResult(double answer) {
        this.answer = answer;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

}
