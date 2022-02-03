package robotsExam;

import java.util.Random;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Robot {
    private int robotHealth = 100;
    private String robotName = "";
    public static final String ALL_BUTTONS = "QWEASDZXC";
    private String failureAttackButtons = "QWEASDZXC";
    private String damageButtons = "";

    Logger logger = Logger.getLogger(getClass());

    public void setRobotName(String robotName){
        this.robotName = robotName;
    }

    public void setRobotName(){
        this.robotName = fillRobotsName();
    }

    public String getRobotName(){
        return this.robotName;
    }

    public int getRobotHealth(){
        return this.robotHealth;
    }

    private String fillRobotsName(){
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter the Robot's name");
        return scanner.next();
    }

    private char setDamageAction(){
        int randIdx = new Random().nextInt(failureAttackButtons.length());
        char randChar = failureAttackButtons.charAt(randIdx);
        failureAttackButtons = failureAttackButtons.replace(String.valueOf(randChar), "");
        return randChar;
    }

    public String defineDamageButtons(){
        for (int i = 0; i<5; i++){
            damageButtons = damageButtons+setDamageAction();
        }
        return damageButtons;
    }

    public void showActionButtons(){
        for(int i=0; i<ALL_BUTTONS.length(); i++ ){
            logger.info(ALL_BUTTONS.charAt(i)+" ");
        }

    }

}
