# SQL构建


> 🔭SQL语句
> 
> **部分**(2024-06-03更新,需要引入新的数据库建表)

```sql
create database demospringboot;
use demospringboot;
drop table if exists `user`;

-- 用户表 
CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);
select * from user;

-- 学生信息表
drop table if exists `stuInfo`;
create table stuInfo(
	id int auto_increment primary key,
    username varchar(50) not null,
    stuname varchar(50) not null,
    stuid varchar(100) not null,
    grade varchar(10) not null,
    class varchar(50) not null
);
insert into `stuinfo` values(1,'xieleihan','xieleihan','1001','大二','1班');
select * from stuinfo;

-- 老师表
drop table if exists `teacherInfo`;
create table teacherInfo(
	id int auto_increment primary key,
    username varchar(50) not null,
    teachername varchar(50) not null,
    teacherid varchar(50) not null,
    grade varchar(50) not null
);

CREATE TABLE admin (
    adminname VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);

INSERT INTO admin (adminname, password) VALUES ('admin', 'password123');
```
关键部分就是上面那些,后续肯定有修改

> 设计情况
```text
分开设计的优缺点
优点：
定制化用户体验：管理员和学生的需求不同，分开设计可以为每类用户提供最适合他们的界面和功能。
提高安全性：通过分开设计，可以更容易地管理权限，确保不同角色只能访问他们需要的部分，减少安全隐患。
简化开发和维护：每个页面的功能更聚焦，可以减少代码的复杂度，提高代码的可读性和可维护性。
缺点：
开发成本增加：需要开发和维护多个不同的页面，可能会增加初始开发和后期维护的成本。
一致性挑战：确保不同页面之间的一致性可能更具挑战，需要更多的沟通和协调。
统一设计的优缺点
优点：
开发效率高：统一的页面设计可以减少重复工作，节省开发时间和资源。
用户体验一致：统一的设计风格和交互方式可以为所有用户提供一致的体验，减少学习成本。
便于维护：只有一个页面需要更新和维护，简化了版本管理和错误修复。
缺点：
复杂度增加：需要处理不同角色的不同权限和功能需求，可能导致页面变得复杂和难以管理。
安全性风险：如果权限管理不当，可能会导致安全问题，例如学生意外访问到管理员的功能。
综合考虑
建议：
角色分离需求：如果管理员和学生的功能需求差异很大，建议分开设计。这可以提高每类用户的使用体验，并且更易于管理权限。
项目资源和时间：如果项目时间紧迫，资源有限，统一页面可能是一个更快速的实现方式，但需要在设计时充分考虑角色权限和界面简洁性。
未来扩展性：考虑系统未来的扩展性，如果系统需要增加更多角色或功能，分开设计的可扩展性可能更好。
```
