package top.cronCreate;

/**
 * @author apotatopudding
 * @date 2022/12/13 23:23
 */

import java.util.ArrayList;
import java.util.List;

public class CronTemp {
    public Integer cycleMinRange;
    public Integer cycleMaxRange;
    public Integer fromMinRange;
    public Integer fromMaxRange;
    public String appoint = "?";
    public Integer LatestWorkDay;
    public Integer latestDay = 0;
    public Integer OrderWeek;
    public Integer OrderDay;
    public List<Integer> weekAppointList = new ArrayList<>();//只用于周的指定部分统计

    public Integer getCycleMinRange() {
        return cycleMinRange;
    }

    public void setCycleMinRange(Integer cycleMinRange) {
        this.cycleMinRange = cycleMinRange;
    }

    public Integer getCycleMaxRange() {
        return cycleMaxRange;
    }

    public void setCycleMaxRange(Integer cycleMaxRange) {
        this.cycleMaxRange = cycleMaxRange;
    }

    public Integer getFromMinRange() {
        return fromMinRange;
    }

    public void setFromMinRange(Integer fromMinRange) {
        this.fromMinRange = fromMinRange;
    }

    public Integer getFromMaxRange() {
        return fromMaxRange;
    }

    public void setFromMaxRange(Integer fromMaxRange) {
        this.fromMaxRange = fromMaxRange;
    }

    public String getAppoint() {
        return appoint;
    }

    public void setAppoint(String appoint) {
        this.appoint = appoint;
    }

    public Integer getLatestWorkDay() {
        return LatestWorkDay;
    }

    public void setLatestWorkDay(Integer latestWorkDay) {
        LatestWorkDay = latestWorkDay;
    }

    public Integer getLatestDay() {
        return latestDay;
    }

    public void setLatestDay(Integer latestDay) {
        this.latestDay = latestDay;
    }

    public Integer getOrderWeek() {
        return OrderWeek;
    }

    public void setOrderWeek(Integer orderWeek) {
        OrderWeek = orderWeek;
    }

    public Integer getOrderDay() {
        return OrderDay;
    }

    public void setOrderDay(Integer orderDay) {
        OrderDay = orderDay;
    }

    private String weekChange(Integer num){
        String s;
        switch (num){
            case 1-> s = "MON";
            case 2-> s = "TUE";
            case 3-> s = "WED";
            case 4-> s = "THU";
            case 5-> s = "FRI";
            case 6-> s = "SAT";
            case 7-> s = "SUN";
            default -> s = "";
        }
        return s;
    }
}
