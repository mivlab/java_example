Hello.java：第一个程序 Hello World!
Example4_5.java ：定义矩形、梯形、圆，实现构造方法
Example4_8.java ：定义圆和圆锥，圆锥包含圆和高两个属性。
TestPoint.java ：定义Point类，重载toString( ) 输出实例信息。
TestRadio.java ：类的定义包含另一个类的对象，在收音机Radio中包含Battery，每次openRadio()时电池电量减1
TestStudent.java：定义一个带构造方法的Student类，实现数组管理学生信息


TestSubclass.java
类的继承实例

TestSimulator.java
一个模拟器Simulator，有一个方法playSound( Animal a)，可以模拟各种动物的叫声。Dog 和Cat分别继承自Animal，父类和子类都实现了cry( ) 方法。
（1）试通过调用playSound 来发出各种声音（通过println来代替发声）。
    class Simulator {
	void playSound( Animal a){
	}
}
（2）给Simulator增加一个Animal成员，playSound( )函数无参数。实现原来的功能。
    class Simulator {
          Animal a;
	void playSound( ){
	}
}


