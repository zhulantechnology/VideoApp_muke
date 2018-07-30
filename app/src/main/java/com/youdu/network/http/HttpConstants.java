package com.youdu.network.http;

/**
 * @author: qndroid
 * @function: 所有请求相关地址
 * @date: 16/8/12
 */
public class HttpConstants {

    private static final String ROOT_URL = "http://imooc.com/api";
   // public static String HOME_RECOMMAND = "http://10.0.2.2:8080/MyWEB13/home_data.json";

    /**
     * 请求本地产品列表
     */
   // public static String PRODUCT_LIST = ROOT_URL + "/fund/search.php";
    public static String PRODUCT_LIST = "http://10.0.2.2:8080/MyWEB13/search.json";

    /**
     * 本地产品列表更新时间措请求
     */
    public static String PRODUCT_LATESAT_UPDATE = ROOT_URL + "/fund/upsearch.php";
   // public static String HOME_RECOMMAND = "http://10.0.2.2:8080/MyWEB13/home_data.json";

    /**
     * 登陆接口
     */
    public static String LOGIN = ROOT_URL + "/user/login_phone.php";
    //public static String HOME_RECOMMAND = "http://10.0.2.2:8080/MyWEB13/home_data.json";

    /**
     * 检查更新接口
     */
   // public static String CHECK_UPDATE = ROOT_URL + "/config/check_update.php";
    public static String CHECK_UPDATE = "http://10.0.2.2:8080/MyWEB13/update.json";

    /**
     * 首页产品请求接口
     */
   // public static String HOME_RECOMMAND = ROOT_URL + "/product/home_recommand.php";
    public static String HOME_RECOMMAND = "http://10.0.2.2:8080/MyWEB13/home_data.json";
    /**
     * 课程详情接口
     */
   // public static String COURSE_DETAIL = ROOT_URL + "/product/course_detail.php";
    public static String COURSE_DETAIL = "http://10.0.2.2:8080/MyWEB13/course_detail.json";


}


