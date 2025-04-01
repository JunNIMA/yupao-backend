package com.yupi.yupao.model.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
public class TeamUpdateRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -9119395135977284437L;
    /**
     * id
     */
    private Long id;
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
