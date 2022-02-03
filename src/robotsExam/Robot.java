package robotsExam;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Robot {
    private int robotHealth = 100;
    private String robotName = "";
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
}
