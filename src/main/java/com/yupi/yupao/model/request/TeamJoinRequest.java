package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class TeamJoinRequest implements Serializable {


    @Serial
    private static final long serialVersionUID = -3675444557553493362L;

    /**
     * id
     */
    private Long teamId;
    /**
     * 密码
     */
    private String password;
}
