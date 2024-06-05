# demo-Java-EE-Project
一个使用HTML+CSS+JavaScript构建前端页面,用Springboot构建后端业务逻辑,用MySQL实现数据持久化的小型项目.

# 项目



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

