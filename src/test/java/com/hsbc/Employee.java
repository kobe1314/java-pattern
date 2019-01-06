package com.hsbc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/06
 */
@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private Status status;
}
