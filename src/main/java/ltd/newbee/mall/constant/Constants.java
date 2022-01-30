package ltd.newbee.mall.constant;

public class Constants {

    public static final Byte CATEGORY_LEVEL_ONE = 1;
    public static final Byte CATEGORY_LEVEL_TWO = 2;
    public static final Byte CATEGORY_LEVEL_THREE = 3;


    public final static int INDEX_GOODS_HOT_NUMBER = 4;//首页热卖商品数量
    public final static int INDEX_GOODS_NEW_NUMBER = 5;//首页新品数量
    public final static int INDEX_GOODS_RECOMMOND_NUMBER = 10;//首页推荐商品数量


    public final static String MALL_USER_SESSION_KEY = "mallUser";//session中user的key

    public final static String MALL_VERIFY_CODE_KEY = "mallVerifyCode";//验证码key


    public final static int GOODS_SEARCH_PAGE_LIMIT = 10;//搜索分页的默认条数(每页10条)

    public final static int ORDER_SEARCH_PAGE_LIMIT = 3;//我的订单列表分页的默认条数(每页3条)

    /**
     * 字符编码
     */
    public static final String UTF_ENCODING = "UTF-8";
    /**
     * 字符串表示true
     */
    public static final String TRUE = "true";

    /**
     * 当前页
     */
    public static String PAGE_NUMBER = "pageNumber";

    /**
     * 分页大小
     */
    public static String PAGE_SIZE = "pageSize";

    /**
     * 排序字段名
     */
    public static String SORT_NAME = "sortName";

    /**
     * 排序方式 asc或者desc
     */
    public static String ORDER_DESC = "desc";
    public static String SORT_ASC = "asc";

    /**
     * 秒杀执行盐值
     */
    public static final String SECKILL_EXECUTE_SALT = "qwe";
    /**
     * 秒杀下单盐值
     */
    public static final String SECKILL_ORDER_SALT = "asd";

    /**
     * 秒杀商品库存缓存
     */
    public static final String SECKILL_GOODS_STOCK_KEY = "seckill_goods_stock:";

    /**
     * 秒杀商品缓存
     */
    public static final String SECKILL_KEY = "seckill:";
    /**
     * 秒杀商品详情页面缓存
     */
    public static final String SECKILL_GOODS_DETAIL_HTML = "seckill_goods_detail_html:";
    /**
     * 秒杀商品列表页面缓存
     */
    public static final String SECKILL_GOODS_LIST_HTML = "seckill_goods_list_html:";

    /**
     * 秒杀成功的用户set缓存
     */
    public static final String SECKILL_SUCCESS_USER_ID = "seckill_success_user_id:";

}
