package com.hurryyu.externalscopedtest //扩展了 Animal  和Cat   Cat 继承 Animal
fun Animal.getFood() = "苹果"
fun Cat.getFood() = "猫粮"

//在这个方法中  传入类型是 Animal  所以获取到的是"苹果"，不管是传入的是Animal 还是 Animal 的子类 如Cat
fun printFood(food: Animal) {
    print(food.getFood())
}


var Snake.size:Int
    set(value) {aaa = value}
    get() = aaa +1

fun main(args: Array<String>) {
    val snake = Snake()
    print(snake.size)
    snake.size = 3
    print(snake.size)
}

fun Snake.Companion.foo(){

}


