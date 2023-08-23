package com.uspring.USpring.Util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptadorPassword {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        var password = "123";
        System.out.println("password: " + password);
        System.out.println("password encriptador: " + encriptarPassword(password));
    }

    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}


