# JavaEE-Project

一个使用HTML+CSS+JavaScript构建前端页面,用Springboot构建后端业务逻辑,用MySQL实现数据持久化的小型项目.



# 项目

![demo-Java-EE-Project](https://socialify.git.ci/xieleihan/demo-Java-EE-Project/image?description=1&font=Source%20Code%20Pro&forks=1&issues=1&language=1&logo=https%3A%2F%2Favatars.githubusercontent.com%2Fu%2F57227318%3Fs%3D400%26u%3D0042e26f16ac9b24babe9cc6d8f659ba4167f457%26v%3D4&name=1&owner=1&pattern=Floating%20Cogs&pulls=1&stargazers=1&theme=Light)

## 技术栈

1. 前端

	`HTML`+`CSS`+`JavaScript`

	<div align="left">
    <img src="https://fastly.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" height="45" alt="html5 logo"  />
    <img width="6" />
    <img src="https://fastly.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg" height="45" alt="css3 logo"  />
    <img width="6" />
    <img src="https://fastly.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg" height="45" alt="javascript logo"  />
    </div>

2. 后端

	`Springboot`+`Mybatis`

	<div align="left">
    <img src="https://fastly.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" height="45" alt="Spring logo"  />
    </div>

3. 数据持久化

	`MySQL`
	
	<div align="left">
	  <img src="https://fastly.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" height="45" alt="MySQL logo"  />
	</div>



# 项目结构

```text
/github
    ├── README.md               # 项目介绍
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



# 项目问题

1. 安全性

	> 由于在开发过程中,为了减少开发时间,没有引入对数据方面的加密处理,需要后续的进行补充,但是在我没有修改这个引用的时候,安全性问题依旧存在

2. 健壮性

	> 没有安排人进行测试,所以不知道这个项目是否可靠

3. 前端的美观

	> 本项目基本是我一个人进行开发,所以我必须把精力放在后端上,但是作为一个前端开发者,我无法同时顾及两方面,所以导致这个问题,后续的成员加入进来,并没有说能够进一步的美化的时间给他们学习,所以导致了页面相比前端开发的稍微差了一点



# 项目后续

在完成大作业后,该项目就会被废弃掉...😭

但是该项目依旧开源有效,任何拿去学习魔改等都没有任何问题,无需许可,感谢每一个对该项目支持的开发者,虽然这个是一个很不起眼的项目,也没有什么创新的点,但是学习就是这样

小组成员:4人(**前后端框架,前端,后端1人**[@xieleihan],*前端2人*[@[**tingxianzi1**](https://github.com/tingxianzi1)],[@[**Qqqqqzr**](https://github.com/tingxianzi1)],*word文档1人*),历时2day🔭

