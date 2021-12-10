/*
 * <p>项目名称: 疫情 </p >
 * <p>文件名称: Constant </p >
 * <p>描述: 全局常量Constant类</p >
 * <p>创建时间: 2020-04-17 </p >
 * <p>公司信息: 烽火 </p >
 * @author yangjiayang
 * @version v1.0
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
package com.nuts.tools.common;

/**
 * Constant
 *
 * @author yangjiayang
 * @version 1.0
 * @date 2020-04-04
 * @description 全局常量
 */
public class Constant {
    /**
     * 私有构造方法->不允许构建
     */
    private Constant() {

    }

    /**
     * UTF-8编码
     */
    public static final String UTF8 = "UTF-8";
    /**
     * a-z A-Z
     */
    public static final String AZ = "a-z A-Z";
    /**
     * ERROR错误
     */
    public static final String ERROR = "ERROR-";
    /**
     * COUNT字符串
     */
    public static final String COUNT = "COUNT";
    /**
     * COLOR字符串
     */
    public static final String COLOR = "COLOR";
    /**
     * AND字符串
     */
    public static final String AND = " AND ";
    /**
     * LIMIT字符串
     */
    public static final String LIMIT = " LIMIT ";
    /**
     * IS NULL字符串
     */
    public static final String ISNULL = "IS NULL";
    /**
     * ORDER BY字符串
     */
    public static final String ORDERBY = " ORDER BY ";
    /**
     * 大于等于
     */
    public static final String DY = " >= ";
    /**
     * 小于等于
     */
    public static final String XY = " <= ";
    /**
     * LIKE字符串
     */
    public static final String LIKE1 = " LIKE '%1%'";
    /**
     * LIKE字符串
     */
    public static final String LIKE0 = " LIKE '%0%'";
    /**
     * SELECT COUNT(*) FROM (字符串
     */
    public static final String SELECT1 = "SELECT COUNT(*) FROM (";
    /**
     * SELECT COUNT(DISTINCT IDCARD) FROM KFNH_INTOCHINA 字符串
     */
    public static final String SELECT2 = "SELECT COUNT(DISTINCT IDCARD) FROM KFNH_INTOCHINA ";
    /**
     * AREAID字符串
     */
    public static final String AREAID = "AREAID";
    /**
     * TOWNID字符串
     */
    public static final String TOWNID = "TOWNID";
    /**
     * CITYID字符串
     */
    public static final String CITYID = "CITYID";
    /**
     * 】对ID：字符串
     */
    public static final String TOID = "】对ID：";

    /**
     * all字符串
     */
    public static final String ALL = "all";
    /**
     * allCount字符串
     */
    public static final String ALLCOUNT = "allCount";
    /**
     * today字符串
     */
    public static final String TODAY = "today";
    /**
     * todayCount字符串
     */
    public static final String TODAYCOUNT = "todayCount";
    /**
     * green字符串
     */
    public static final String GREEN = "green";
    /**
     * blue字符串
     */
    public static final String BLUE = "blue";
    /**
     * yellow字符串
     */
    public static final String YELLOW = "yellow";
    /**
     * red字符串
     */
    public static final String RED = "red";
    /**
     * black字符串
     */
    public static final String BLACK = "black";

    /**
     * all_green字符串
     */
    public static final String ALL_GREEN = "all_green";
    /**
     * all_blue字符串
     */
    public static final String ALL_BLUE = "all_blue";
    /**
     * all_yellow字符串
     */
    public static final String ALL_YELLOW = "all_yellow";
    /**
     * all_red字符串
     */
    public static final String ALL_RED = "all_red";
    /**
     * today_green字符串
     */
    public static final String TODAY_GREEN = "today_green";
    /**
     * today_blue字符串
     */
    public static final String TODAY_BLUE = "today_blue";
    /**
     * today_yellow字符串
     */
    public static final String TODAY_YELLOW = "today_yellow";
    /**
     * today_red字符串
     */
    public static final String TODAY_RED = "today_red";
    /**
     * parent_id字符串
     */
    public static final String PARENT_ID = "parent_id";

    /**
     * noTurn字符串
     */
    public static final String NOTURN = "noTurn";
    /**
     * yyyy-MM-dd字符串
     */
    public static final String YYYYMMDD = "yyyy-MM-dd";
    /**
     * yyyy-MM-dd HH:mm:ss字符串
     */
    public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
    /**
     * %Y-%m-%d %H:%i:%s字符串
     */
    public static final String YMDHIS = "%Y-%m-%d %H:%i:%s";

    /**
     * 佛山市-字符串
     */
    public static final String FS = "佛山市";
    /**
     * 禅城区-字符串
     */
    public static final String CC = "禅城区";
    /**
     * 南海区-字符串
     */
    public static final String NH = "南海区";
    /**
     * 顺德区-字符串
     */
    public static final String SD = "顺德区";
    /**
     * 三水区-字符串
     */
    public static final String SS = "三水区";
    /**
     * 高明区-字符串
     */
    public static final String GM = "高明区";
    /**
     * 接口执行出错
     */
    public static final String ERROR_INTERFACE = "接口执行出错";
    /**
     * 获取禅城区数据失败
     */
    public static final String ERROR_CC = "获取禅城区数据失败";
    /**
     * isGzryhx字段为空不设置此筛选条件
     */
    public static final String ISGZRYHX_NULL = "isGzryhx字段为空不设置此筛选条件";
    public static final String TIME_ZERO = "00:00:00";

    /**
     * 统计页面展示权限（1是0否）
     */
    public static final String PERMISSION_COUNT = "count";
    /**
     * 统计页面-电子通行证申领情况统计展示权限（1是0否）
     */
    public static final String PERMISSION_DZCOUNT = "dzCount";
    /**
     * 统计页面-企业复产和口罩情况统计展示权限（1是0否）
     */
    public static final String PERMISSION_QYCOUNT = "qyCount";
    /**
     * 统计页面-外地抵佛自助申报情况统计展示权限（1是0否）
     */
    public static final String PERMISSION_RYCOUNT = "ryCount";
    /**
     * 统计页面-企业员工健康情况统计展示权限（1是0否）
     */
    public static final String PERMISSION_JKCOUNT = "jkCount";
    /**
     * 统计页面-入境人员信息统计展示权限（1是0否）
     */
    public static final String PERMISSION_JWCOUNT = "jwCount";
    /**
     * 查询页面-人员报备页面展示权限（1是0否）
     */
    public static final String PERMISSION_PERSON = "person";
    /**
     * 查询页面-举报线索页面展示权限（1是0否）
     */
    public static final String PERMISSION_CLUE = "clue";
    /**
     * 查询页面-企业复工页面展示权限（1是0否）
     */
    public static final String PERMISSION_COMPANY = "company";
    /**
     * 查询页面-口罩申请页面展示权限（1是0否）
     */
    public static final String PERMISSION_SUPPLIES = "supplies";
    /**
     * 查询页面-一人一档页面展示权限（1是0否）
     */
    public static final String PERMISSION_ONEPERSONLIST = "onePersonList";
    /**
     * 查询页面-跨境货车司机扫码查询页面展示权限（1是0否）
     */
    public static final String PERMISSION_CROSSBORDERDRIVER = "crossBorderDriver";

    /** 特定码头扫码记录查询 */
    public static final String PERMISSION_TEMPRECORD = "temprecord";

    /** 新冠病毒检测个案登记 */
    public static final String PERMISSION_CASEREGIST = "caseRegistration";

    /** 隔离场所工作人员信息 */
    public static final String PERMISSION_SPLITPLACE = "splitPlace";

    /** 核酸检测记录查询 */
    public static final String PERMISSION_NUCLEIC = "nucleicAcid";
    /** 核酸结果导入 */
    public static final String PERMISSION_NUCLEIC_IMPORT = "nucleicAcidImport";
    /** 核酸结果导出 */
    public static final String PERMISSION_NUCLEIC_EXPORT = "nucleicAcidExport";
    /** 新冠个案登记 */
    public static final String PERMISSION_NUCLEIC_ADD = "nucleicAcidTab2";

    /**
     * 电子通行证页面展示权限（1是0否）
     */
    public static final String PERMISSION_NEWLIST = "newList";
    /**
     * 基础信息表页面展示权限（1是0否）
     */
    public static final String PERMISSION_BASICINFORMATION = "basicInformation";
    /**
     * 入境人员信息页面展示权限（1是0否）
     */
    public static final String PERMISSION_OVERSEASINPUT = "overseasInput";
    /**
     * 控制电子通行证以及基础信息表的所有按钮权限（1是0否）
     */
    public static final String PERMISSION_ISCOMMUNITY = "isCommunity";
    /**
     * 镇街权限（1是0否）
     */
    public static final String PERMISSION_TOWN = "permission_town";
    /**
     * 社区权限（1是0否）
     */
    public static final String PERMISSION_COMMUNITY = "permission_community";
    /**
     * 信访查询权限（1是0否）
     */
    public static final String PERMISSION_XINFANG = "xinfang";
    /**
     * 省接口查询权限（1是0否）
     */
    public static final String PERMISSION_LETTERSVISITS = "lettersVisits";
    /**
     * 运维资金申请与上报系统清单（1是0否）
     */
    public static final String PERMISSION_FUNDAPPLYSYSTEMREPORTLIST = "fundApplySystemReportList";

    /**
     * 五区口罩申请情况
     */
    public static final String PERMISSION_WQKZDATA = "wqkzdata";

    /**
     * 操作日志查询权限（1是0否）
     */
    public static final String PERMISSION_OPERATIONLOG = "operationLog";

    public static final String PERMISSION_TJFX = "tjfx";

    /**
     * 是否有权限修改"是否纳管人员"字段（1是0否）
     */
    public static final String PERMISSION_XGNGRYQX = "xgngryqx";
    public static final String PERMISSION_JUSTICEBUREAUSEARCH = "justiceBureauSearch";

    /**
     * Num
     *
     * @author yangjiayang
     * @version 1.0
     * @date 2020-04-04
     * @description 常用数字常量
     */
    public static final class Num {
        private Num() {
        }

        /**
         * 数字-0
         */
        public static final int NUM_ZERO = 0;
        /**
         * 数字-1
         */
        public static final int NUM_ONE = 1;
        /**
         * 数字-2
         */
        public static final int NUM_TWO = 2;
        /**
         * 数字-3
         */
        public static final int NUM_THREE = 3;
        /**
         * 数字-4
         */
        public static final int NUM_FOUR = 4;
        /**
         * 数字-5
         */
        public static final int NUM_FIVE = 5;
        /**
         * 数字-6
         */
        public static final int NUM_SIX = 6;
        /**
         * 数字-7
         */
        public static final int NUM_SEVEN = 7;
        /**
         * 数字-8
         */
        public static final int NUM_EIGHT = 8;
        /**
         * 数字-9
         */
        public static final int NUM_NINE = 9;
        /**
         * 数字-10
         */
        public static final int NUM_TEN = 10;
        /**
         * 数字-11
         */
        public static final int NUM_ELEVEN = 11;
        /**
         * 数字-12
         */
        public static final int NUM_TWELVE = 12;
        /**
         * 数字-13
         */
        public static final int NUM_THIRTEEN = 13;
        /**
         * 数字-14
         */
        public static final int NUM_FOURTEEN = 14;
        /**
         * 数字-15
         */
        public static final int NUM_FIFTEEN = 15;
        /**
         * 数字-16
         */
        public static final int NUM_SIXTEEN = 16;
        /**
         * 数字-17
         */
        public static final int NUM_SEVENTEEN = 17;
        /**
         * 数字-18
         */
        public static final int NUM_EIGHTEEN = 18;
        /**
         * 数字-19
         */
        public static final int NUM_NINETEEN = 19;
        /**
         * 数字-20
         */
        public static final int NUM_TWENTY = 20;
        /**
         * 数字-24
         */
        public static final int NUM_TWENTY_FOUR = 24;
        /**
         * 数字-30
         */
        public static final int NUM_THIRTY = 30;
        /**
         * 数字-40
         */
        public static final int NUM_FORTY = 40;
        /**
         * 数字-50
         */
        public static final int NUM_FIFTY = 50;
        /**
         * 数字-60
         */
        public static final int NUM_SIXTY = 60;
        /**
         * 数字-100
         */
        public static final int NUM_HUNDRED = 100;
        /**
         * 数字-200
         */
        public static final int NUM_TWOHUNDRED = 200;
        /**
         * 数字-400
         */
        public static final int NUM_400 = 400;
        /**
         * 数字-1000
         */
        public static final int NUM_1000 = 1000;
        /**
         * 数字-1024
         */
        public static final int NUM_1024 = 1024;
        /**
         * 数字-10240
         */
        public static final int NUM_10240 = 10240;
        /**
         * 数字-3600
         */
        public static final int NUM_3600 = 3600;
        /**
         * 数字-6000
         */
        public static final int NUM_SIXTHOUSAND = 6000;
        /**
         * 数字-60000
         */
        public static final int NUM_60000 = 60000;
        /**
         * 数字-300000
         */
        public static final int NUM_300000 = 300000;
        /**
         * 数字-10000000000L
         */
        public static final long NUM_10000000000L = 10000000000L;
    }
}