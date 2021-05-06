package cn.codingcrea.nccommunity.util;

public interface CommunityConstant {

    //激活成功
    int ACTIVATION_SUCCESS = 0;

    //重复激活
    int ACTIVATION_REPEATE = 1;

    //激活失败
    int ACTIVATION_FAILURE = 2;

    //默认凭证超时时间
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    //“记住我”时的凭证超时时间
    int REMEMBERME_EXPIRED_SECONDS = 3600 * 24 * 100;

    //comment的entityType为帖子
    int ENTITY_TYPE_POST = 1;

    //comment的entityType为comment
    int ENTITY_TYPE_COMMENT = 2;
}