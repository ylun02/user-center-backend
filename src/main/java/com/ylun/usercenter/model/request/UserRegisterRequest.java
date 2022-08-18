package com.ylun.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * @author lyl
 * @date 2022/8/11
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -1463685778680855725L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
