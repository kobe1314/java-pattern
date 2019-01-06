package com.hsbc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/06
 */
public class StreamTest {
    public static void main(String[] args){
        List<Employee> emps = Arrays.asList(
                new Employee(102,"李四",59,6666.66,Status.BUSY),
                new Employee(103,"张三",52,3333.66,Status.FREE),
                new Employee(101,"王五",10,5783.66,Status.FREE),
                new Employee(100,"赵六",35,6782.66,Status.VOCATION),
                new Employee(104,"杜氏",39,8972.66,Status.BUSY),
                new Employee(105,"田七",26,2346.66,Status.VOCATION)
        );

        //1.find and match
        boolean matchResult = emps.stream().allMatch(emp -> emp.getStatus().equals(Status.BUSY));
        System.out.println(matchResult);
        //match any item
        boolean matchAny = emps.stream().anyMatch(emp -> emp.getStatus().equals(Status.BUSY));
        System.out.println("matchAny result:"+matchAny);

        //Find first value
        Optional<Employee> op1 = emps.stream().sorted((e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary())).findFirst();
        List list = emps.stream().sorted((e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary())).collect(Collectors.toList());
        System.out.println(list.toArray());
        System.out.println(op1.get());

        //Find the salary max value
        Optional<Double> op = emps.stream().map(Employee::getSalary).max(Double::compareTo);
        System.out.println(op.get());

    }
}
