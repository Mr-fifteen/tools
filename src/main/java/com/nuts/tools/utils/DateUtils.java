/*
 * <p>项目名称: 疫情 </p >
 * <p>文件名称: DateUtils </p >
 * <p>描述: 时间工具类</p >
 * <p>创建时间: 2020-04-17 </p >
 * <p>公司信息: 烽火 </p >
 * @author yangjiayang
 * @version v1.0
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
package com.nuts.tools.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.nuts.tools.common.Constant.*;

public class DateUtils {
    private static Logger log = LoggerFactory.getLogger(DateUtils.class);

    private DateUtils() {
    }

    /**
     * 功能描述:
     *
     * @param: 获取当前系统时间 yyyy-MM-dd HH:mm:ss
     */
    public static String getCurrentDate() {
        SimpleDateFormat df = new SimpleDateFormat(YYYYMMDDHHMMSS);
        return df.format(System.currentTimeMillis());
    }

    /**
     * 功能描述:
     *
     * @param: date类 获取当前系统时间 yyyy-MM-dd HH:mm:ss
     */
    public static Date getCurrentDateToDate() {
        DateFormat df = new SimpleDateFormat(YYYYMMDDHHMMSS);
        String date = df.format(System.currentTimeMillis());
        Date d = null;
        try {
            d = df.parse(date);
        } catch (ParseException e) {
            log.error(ERROR + e);
        }
        return d;
    }

    /**
     * 增加时间单位：天
     *
     * @param day
     */
    public static String getCurrentAddDay(int day) {
        SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDDHHMMSS);
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, day);
        return sdf.format(cal.getTime());
    }

    /**
     * 增加时间单位：分钟
     *
     * @param minute
     */
    public static String getCurrentAddMin(int minute) {
        SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDDHHMMSS);
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MINUTE, minute);
        return sdf.format(cal.getTime());
    }

    /**
     * 获取当前时间
     */
    public static String getNowDateString() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDD);
        return sdf.format(d);
    }

    /**
     * 把Date转为String
     *
     * @param date
     * @param format
     */
    public static String getFormatTime(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 增加时间单位：天
     *
     * @param day
     */
    public static Date addDay(int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, day);
        return cal.getTime();
    }

    /**
     * 增加时间单位：天
     *
     * @param date
     * @param day
     */
    public static Date addDay(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, day);
        return cal.getTime();
    }

    /**
     * 减去多少天
     *
     * @param date
     * @param day
     */
    public static Date minusDay(Date date, int day) {
        return addDay(date, -day);
    }

    /**
     * 将不规范的日期变成规范的日期 例如 将2020-10-01 12:10:00,2020-10-01 12:10:00 转换成 2020-10-01 00:00:00,2020-10-02 00:00:00
     * @param dateStr
     * @return
     */
    public static String getSearchDate(String dateStr){
        String searchDate = "";
        String hhssmm = " 00:00:00";
        if(dateStr != null){
            String[] dateStrArr=dateStr.split(",");
            String beforeDateStr = dateStrArr[0];
            beforeDateStr = getDateStr(beforeDateStr)+hhssmm;
            String afterDateStr = dateStrArr[1];
            afterDateStr = addOneDay(afterDateStr)+hhssmm;
            searchDate = beforeDateStr +","+afterDateStr;
        }
        return searchDate;
    }

    /**
     * 将不规范的日期变成规范的日期 例如 将2020-10-01,2020-10-01 转换成 2020-10-01,2020-10-02
     * @param dateStr
     * @return
     */
    public static String getSearchDate2(String dateStr){
        String searchDate = "";
        if(dateStr != null){
            String[] dateStrArr=dateStr.split(",");
            String beforeDateStr = dateStrArr[0];
            beforeDateStr = getDateStr(beforeDateStr);
            String afterDateStr = dateStrArr[1];
            afterDateStr = addOneDay(afterDateStr);
            searchDate = beforeDateStr +","+afterDateStr;
        }
        return searchDate;
    }

    /**
     * 在某一天上增加一天 2020-10-01 12:10 变成 2020-10-02
     * @param dateStr
     * @return
     */
    public static String addOneDay(String dateStr){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        dateStr=getDateStr(dateStr);
        try {
            Date date=sdf.parse(dateStr);
            Calendar cal=Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE,1);
            date=cal.getTime();
            dateStr=sdf.format(date);
        }catch (Exception e){
            e.printStackTrace();
        }

        return dateStr;
    }

    /**
     * 将时间字符串变成 yyyy-MM-dd的字符串
     * @param dateStr
     * @return
     */
    public static String getDateStr(String dateStr){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date=sdf.parse(dateStr);
            dateStr=sdf.format(date);
        }catch (Exception e){
            // e.printStackTrace();
        }
        return dateStr;
    }

    public static List<String> getNearDateStrList(){
        List<String> list = new ArrayList<>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        for(int i=0;i<=4;i++){
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.add(Calendar.DATE,-i);
            Date date = cal.getTime();
            String temp = sdf.format(date);
            list.add(temp);
        }
        return list;
    }

    /** 获取加减时间后的时间字符传 返回时间字符格式 yyyy-MM-dd */
    public static String getWantDateStr(int index){
        String wantDateStr = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,index);
        Date date = cal.getTime();
        wantDateStr = sdf.format(date);
        return wantDateStr;
    }

    public static String getNowTime(){
        String wantDateStr = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        wantDateStr = sdf.format(new Date());
        return wantDateStr;
    }

    public static String getDateStr(Date date){
        String wantDateStr = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        wantDateStr = sdf.format(date);
        return wantDateStr;
    }
    public static String getDateStr1(String dateStr){
        String wantDateStr = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(dateStr);
            wantDateStr = sdf.format(date);
        }catch (Exception e){

        }
        return wantDateStr;
    }
    public static boolean isDate(String dateStr){
        boolean flag = true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.parse(dateStr);
        }catch (Exception e){
            flag = false;
        }
        return flag;
    }

    /** 获取七天内的时间段 */
    public static String get7DayStr(){
        String startTime = getWantDateStr(-7);
        String endTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        return startTime+","+endTime;
    }

    /** 获取三天内的时间段 */
    public static String get3DayStr(){
        String startTime = getWantDateStr(-3);
        String endTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        return startTime+","+endTime;
    }

    public static java.sql.Date getSqlDate(){
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        return date1;
    }

    public static java.sql.Time getSqlTime(String dateStr){
        java.sql.Time time = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(dateStr);
            time = new java.sql.Time(date.getTime());
        }catch (Exception e){
            e.printStackTrace();
        }
        return time;
    }

    public static java.sql.Timestamp getSqlTimestamp(String dateStr){
        java.sql.Timestamp timestamp = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(dateStr);
            timestamp = new java.sql.Timestamp(date.getTime());
        }catch (Exception e){
            e.printStackTrace();
        }
        return timestamp;
    }

    public static void main(String[] args) {
        System.out.println(getSqlTimestamp("2021-02-20 12:00:00"));
    }

}