#### 代理模式
> 也称委托模式，结构型设计模式
> 为其他对象提供一种代理以控制对这个对象的访问

当无法或者不想直接访问某个对象或者访问某个对象存在困难时，可以通过一个代理对象来访问。
委托对象跟代理对象需要实现相同的接口。

uml

![proxy](../pic/proxy.png)

代理模式分为两大部分，静态代理，动态代理

* 静态代理
    
    代理者的代码已经写好或者通过一些自动化工具生成在对其进行编译，代码运行前代理类的class就已经存在了。

* 动态代理
    
    通过反射机制动态生成代理者的对象，在code阶段不需要知道代理谁，代理谁在执行阶段决定。
    java中的InvocationHandler接口，提供invoke方法。
