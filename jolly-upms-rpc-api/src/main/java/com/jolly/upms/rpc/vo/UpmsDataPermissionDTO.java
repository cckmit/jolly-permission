package com.jolly.upms.rpc.vo;

import java.io.Serializable;
import java.util.Set;

/**
 * 数据维度DTO
 */
public class UpmsDataPermissionDTO implements Serializable {
    /**
     * 数据维度
     * 举例：比如语言：Language
     */
    public String dataDimension;

    /**
     * 数据维度值
     * 举例：比如 Set<String> 为ar 阿拉伯语  ,fa 波斯语
     */
    public Set<String> dataDimensionValueSet;


}
