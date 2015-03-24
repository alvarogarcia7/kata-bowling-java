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

		if (wasLastAStrike()) {
			countThisFrameTwice(ball1);
		}
		countThisFrameOnce(result);

		if (isStrike(ball1)){
			previousStrike= true;
		}

		return result;
	}

	private void countThisFrameOnce (final int result) {
		totalScore += result;
	}

	private void countThisFrameTwice (final int ball1) {
		totalScore += ball1;
	}

	private boolean isStrike(int ball){
		return ball == 10;
	}
	private boolean wasLastAStrike () {
		return previousStrike;
	}

	public Integer getFrameScore(){
		return totalScore;
	}
}
