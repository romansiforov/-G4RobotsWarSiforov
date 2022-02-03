package robotsExam;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleGame {
    Logger logger = Logger.getLogger(getClass());
    List<Robot> robotList = new ArrayList<>();

    public void addRobotToGame(Robot robot){
        robotList.add(robot);
    }

    private Robot randomizeWhoWillAttackFirst(List<Robot> robotsList){
        int robotNumber = new Random().nextInt(robotsList.size()-1);
        logger.info("The robot "+robotsList.get(robotNumber).getRobotName()+" will attack first");
        return robotsList.get(robotNumber);
    }

    private void attackEnemy(String damageButtons, Robot robot){
        robot.showActionButtons();

    }

    public void startBattle(){

    }

    public void endBattle(Robot robot){
        logger.info("The enemy has been destroyed");
        logger.info(robot.getRobotName()+" won the Battle");
    }


}

