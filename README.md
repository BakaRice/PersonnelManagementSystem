# 导师选择系统

## 关于工程
- JDK 1.11、Maven 3.2、Mysql8.0
- 使用Spring Boot作为核心框架
- 包含REST API

系统支持多个导师及学生的双向选择，导师可以设置每一门课程的权重以及最低分限制以达到对学生进行选择的目的。
学生可以对心仪导师进行选择。

### 实体类设计
![DataBaseDesign](https://github.com/BakaRice/PersonnelManagementSystem/docs/database_design.png)

### 时间轴
`~2020/03/11`:  
- 创建项目 和 实体类，并进行测试。

`~2020/03/12`:  
- 新增教师实体类、  
- 新增`Authority类`进行独立账户验证   
- 创建教师与学生间多对一关系  
- 为课程类添加权重属性

`~2020/03/17`  
- 调整实体类，修改属性细节。~~新增`schedule类`作为教师和课程中间类，用于设置权重及最低分。
(用于支持多个老师对于课程的权重，进行不同的设置)~~  
- 新增抽象repositories、services。


感谢阅读这份文档。
