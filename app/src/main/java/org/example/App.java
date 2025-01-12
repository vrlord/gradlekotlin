/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String plainPassword = "vrlord_test";
        String encodedPassword = passwordEncoder.encode(plainPassword);

        System.out.println(encodedPassword);
    }
}
