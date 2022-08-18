package com.ylun.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 * @author lyl
 * @date 2022/8/11
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 1861559512790331342L;

    private String userAccount;
    private String userPassword;

}
