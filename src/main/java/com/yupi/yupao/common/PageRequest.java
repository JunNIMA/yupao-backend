package com.yupi.yupao.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 通用分页请求参数
 */
@Data
public class PageRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 7597687187888976423L;
    /**
     * 页面大小
     */
    protected int pagSize = 10;

    /**
     * 当前是第几页
     */
    protected int pageNum = 1;

}
