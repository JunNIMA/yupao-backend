package com.yupi.yupao.model.request;

import lombok.Data;

import java.util.Date;

/**
 * 添加队伍请求体
 */
@Data
public class TeamAddRequest {

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 创建人id
     */
    private Long userId;

    /**
     * 0 - 公开, 1 - 私有, 2 - 加密
     */
    private Integer status;

    /**
     * 密码
     */
    private String password;

    /**
     * 过期时间
     */
    private Date expireTime;


}
