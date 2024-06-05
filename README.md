# JavaEE-Project

一个使用HTML+CSS+JavaScript构建前端页面,用Springboot构建后端业务逻辑,用MySQL实现数据持久化的小型项目.

# 项目

![demo-Java-EE-Project](https://socialify.git.ci/xieleihan/demo-Java-EE-Project/image?description=1&font=Source%20Code%20Pro&forks=1&issues=1&language=1&logo=https%3A%2F%2Favatars.githubusercontent.com%2Fu%2F57227318%3Fs%3D400%26u%3D0042e26f16ac9b24babe9cc6d8f659ba4167f457%26v%3D4&name=1&owner=1&pattern=Floating%20Cogs&pulls=1&stargazers=1&theme=Light)

## 技术栈

1. 前端

  `HTML`+`CSS`+`JavaScript`

  <div align="center">
    <img src="https://fastly.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" height="45" alt="html5 logo"  />
    <img width="6" />
    <img src="https://fastly.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg" height="45" alt="css3 logo"  />
    <img width="6" />
    <img src="https://fastly.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg" height="45" alt="javascript logo"  />
  </div>

2. 后端

	`Springboot`+`Mybatis`

3. 数据持久化

	`MySQL`



# 项目结构

```text
/docs
    ├── README.md               # 主页及项目介绍
    ├─── src
    │   ├─── main
    |   |   ├─── java
    |   |   |   └─── org.example.demojavaeeproject
    |   |   |       ├─── config
    |   |   |       ├─── Controller
    |   |   |       ├─── Model
    |   |   |       ├─── Repository
    |   |   |       ├─── Service
    |   |   |       └─── DemoJavaEeProjectApplication.java       # 启动类
    |   |   └─── resources
    |   |       ├─── static       # 静态文件(放置HTML文件等)
    |   |       └─── application.properties       # 配置信息
    |   └─── target
    └─── pom.xml       # 环境
```



# 项目部署

## 第一步:克隆项目在本地

```text
git clone git@github.com:xieleihan/demo-Java-EE-Project.git
```

## 第二步:将这个文件导入到你的IDEA里

运行`DemoJavaEeProjectApplication.java`这个文件,然后在浏览器输入`http://127.0.0.1:9808`这个网址,开始访问操作.

> 🚧:这里需要注意的是,**后面的端口号是依靠配置而生效**,如果你在使用过程中,浏览器拒绝连接,说明项目中我修改了端口.你需要在这个文件里`application.properties`找到`server.port=`这个配置,在后面,修改你本地运行的时候不会冲突的端口,进行访问就行.

## 第三步:数据库建立

由于我使用的是MySQL数据库,所以在`application.properties`有相应的数据库连接配置,你需要根据实际情况去进行修改.

然后数据库表源码我会放在单独的文件下,这里不过多介绍

