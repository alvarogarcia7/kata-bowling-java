package com.example.kata.bowling;

/**
* Created by alvaro on 24/03/15.
*/
public class BowlingEngine {

	private Integer totalScore;

	private boolean previousStrike;

	public BowlingEngine(){
		totalScore = 0;
		previousStrike = false;
	}

	public Integer throwBalls (int ball1, int ball2) {

		int result = ball1 + ball2;

		if (wasThereAPreviousStrikeOrSpare()){
			totalScore += ball1;
		}

		totalScore += result;

		if (isStrike(ball1)){
			previousStrike= true;
		}

		return result;
	}

	private boolean isStrike(int ball){
		return ball == 10;
	}
	private boolean wasThereAPreviousStrikeOrSpare () {
		return previousStrike;
	}

	public Integer getFrameScore(){
		return totalScore;
	}
}
