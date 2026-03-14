# Java 编译和运行

## 编译

**语法：**
```bash
javac [选项] [源文件路径/文件名.java]
```

**选项说明：**
- `-d <编译输出的根目录>`
- `-cp <依赖的类路径>`

**示例：**
```bash
javac -d D:\GithubLibrary\Java_study\javaclass HelloWorld.java
```

## 运行

**语法：**
```bash
java [选项] [类全限定名]
```

**选项说明：**
- `-cp <装载类根目录>`

**示例：**
```bash
java -cp D:\GithubLibrary\Java_study\javaclass cs2025.hfut.ch1.HelloWorld
```

> `-cp` 定位包，全限定名定位类  
> **注：** 无 `.java` 后缀