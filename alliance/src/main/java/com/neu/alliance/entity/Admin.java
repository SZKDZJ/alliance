package com.neu.alliance.entity;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Title: Admin
 * @Author 曦
 * @Date 2025/6/18 8:37
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Integer id;              // 用户主键ID
    private String username;         // 账号
    private String password;         // 密码（加密后）
    private Integer role;            // 用户类型（1=超级管理员，2=企业用户）
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    private String phone;            // 手机号码
    private String email;            // 邮箱
    private Integer gender;          // 性别（0=未知，1=男，2=女）
    private String avatar;           // 头像URL
    private LocalDateTime createTime; // 创建时间
    private Integer status;          // 用户状态（1=启用，0=禁用）
}
