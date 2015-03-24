package com.example.kata.bowling;

/**
* Created by alvaro on 24/03/15.
*/
public class BowlingEngine {

	private Integer totalScore;

	public BowlingEngine(){
		totalScore=0;
	}

	public Integer throwBalls (int ball1, int ball2) {

		int realValueBall1 = ball1;

		if (totalScore != 0){
			realValueBall1 *= 2;
		}

		totalScore += realValueBall1 + ball2;

		return ball1 + ball2;
	}

	public Integer getFrameScore(){
		return totalScore;
	}
}
