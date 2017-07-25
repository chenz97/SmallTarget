package com.starryrain.smalltarget;


public class Target {
    private int id;
    private int beginy,beginm,begind;//创建时间
    private int type;//0代表限期目标，1代表不限期目标
    private int endy,endm,endd;//限期目标的结束时间
    private String name;//目标名
    private boolean alarm;//提醒开关
    private int alarm_type;//提醒方式
    private int alarmh,alarmm;//提醒时间
    private boolean[] week;//重复提醒设置，不支持单次提醒

    public int getId() {
        return id;
    }

    public int getBeginy() {
        return beginy;
    }

    public int getBeginm() {
        return beginm;
    }

    public int getBegind() {
        return begind;
    }

    public int getType() {
        return type;
    }

    public int getEndd() {
        return endd;
    }

    public int getEndm() {
        return endm;
    }

    public int getEndy() {
        return endy;
    }

    public String getName() {
        return name;
    }

    public int getAlarmh() {
        return alarmh;
    }

    public boolean isAlarm() {
        return alarm;
    }

    public int getAlarmm() {
        return alarmm;
    }

    public boolean[] getWeek() {
        return week;
    }
}
