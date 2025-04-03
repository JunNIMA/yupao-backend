package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户退出队伍请求体
 */
@Data
public class TeamQuitRequest implements Serializable {


    @Serial
    private static final long serialVersionUID = 4149072169826074936L;
    /**
     * id
     */
    private Long teamId;

}
