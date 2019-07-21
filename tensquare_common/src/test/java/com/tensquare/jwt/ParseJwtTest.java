package com.tensquare.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.text.SimpleDateFormat;

public class ParseJwtTest {
    public static void main(String[] args) {
        Claims claims = Jwts.parser().setSigningKey("itcast").parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiLlsI_pqawiLCJpYXQiOjE1NjMzNjEwNDgsImV4cCI6MTU2MzM2MTEwOCwicm9sZSI6ImFkbWluIn0.wpYzqKCUcPhVuBF5ekZDYs6NnLzT4kjSwlebQQ-2WP0")
                .getBody();
        System.out.println("用户id"+claims.getId());
        System.out.println("姓名"+claims.getSubject());
        System.out.println("日期"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getIssuedAt()));
        System.out.println("过期时间"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getExpiration()));
        System.out.println("用户角色"+claims.get("role"));
    }
}
