package com.hsbc.pattern.decorator;

import lombok.Getter;

/**
 * @program: java-design
 * @description: beverage
 * @author: Kobe
 * @create: 2018/12/18
 */
@Getter
public abstract class Beverage {
    public String description = "Unknown beverage!";
    /**
    *@Description: This is calculate beverage price
    *@Param: 
    *@return: 
    *@Author: kobe
    *@date: 2018/12/18
    */
    public abstract double cost();
}
