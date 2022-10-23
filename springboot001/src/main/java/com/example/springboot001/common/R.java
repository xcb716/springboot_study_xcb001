package com.example.springboot001.common;

import lombok.Data;

/**
 * 表现层（controller）返回结果的模型类，用于前后端数据统一，也称为前后端数据协议
 */
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {

    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
