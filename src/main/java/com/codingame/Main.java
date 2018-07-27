package com.codingame;

import com.codingame.gameengine.runner.MultiplayerGameRunner;
import com.codingame.gameengine.runner.dto.GameResult;

public class Main {
	public static void main(String[] args) {
	    MultiplayerGameRunner gameRunner = new MultiplayerGameRunner();
	    System.setProperty("league.level", "4");
	    gameRunner.addAgent("D:/code/codingame/legends-of-code-and-magic/main.exe");
	    gameRunner.addAgent("D:/code/codingame/legends-of-code-and-magic/main.exe");
        //gameRunner.start(8888);
        GameResult res = gameRunner.simulate();
    }
}
