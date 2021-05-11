package com.hurryyu.externalscopedtest;

/**
 * @author lizheng
 * create at 2021/4/30
 * description:
 *
 * 对于重载中的一种特殊情况，如果参数有继承关系，那就看调用的时候的类型，因为这时候调用什么方法，在编译成class字节码的时候，已经定下了
 */
class JavaTest {

    public  void getFood(Animal animal){

    }

    public  void getFood(Cat animal){

    }
    //参数二是Cat类型， 那么调用getFood(Cat animal){
    public void print(JavaTest test,Cat animal){
        test.getFood(animal);
    }

    //参数二是Animal类型，调用getFood(Animal animal){
    public void print(JavaTest test,Animal animal){
        //在字节码里面，
        //先检查test有没有子类，如果有子类，先调用子类相应的getFood接口，如果没有子类，检查当前类的方法
        //如果当前类中的参数有继承关系，那么在在字节码里面，会去调用当前类型的方法
        test.getFood(animal);
    }
}
