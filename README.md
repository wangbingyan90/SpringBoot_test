# Spring-boot
* 优点
* 使用步骤
### 优点
 * 配置简单：通过初始化扫码和大量注解类简化配置
 * 运行简单：servlet等核心包，无需web容器直接执行java程序
 * 内置hibernate等核心包使用方便
 ### 使用步骤
 ##### 1，引入相关包
 方法1：只需要在POM里面添加parent父工程即可。
<pre>
        &lt;project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd"&gt;
              &lt;modelVersion&gt;4.0.0&lt;/modelVersion&gt;
            
              &lt;!--系统信息--&gt;
              &lt;groupId&gt;com.wby&lt;/groupId&gt;
              &lt;artifactId&gt;SpringBoot&lt;/artifactId&gt;
              &lt;packaging&gt;war&lt;/packaging&gt;
              &lt;version&gt;1.0-SNAPSHOT&lt;/version&gt;
              &lt;name&gt;SpringBoot Maven Webapp&lt;/name&gt;
              &lt;url&gt;http://maven.apache.org&lt;/url&gt;
            
              &lt;!--POM的方式引入--&gt;
              &lt;parent&gt;
                &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
                &lt;artifactId&gt;spring-boot-starter-parent&lt;/artifactId&gt;
                &lt;version&gt;2.0.0.BUILD-SNAPSHOT&lt;/version&gt;
              &lt;/parent&gt;
            
              &lt;!--相关依赖包？--&gt;
              &lt;dependencies&gt;
                &lt;dependency&gt;
                  &lt;groupId&gt;junit&lt;/groupId&gt;
                  &lt;artifactId&gt;junit&lt;/artifactId&gt;
                  &lt;version&gt;3.8.1&lt;/version&gt;
                  &lt;scope&gt;test&lt;/scope&gt;
                &lt;/dependency&gt;
            
                &lt;!--web模块包--&gt;
                &lt;dependency&gt;
                  &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
                  &lt;artifactId&gt;spring-boot-starter-web&lt;/artifactId&gt;
                &lt;/dependency&gt;
            
                &lt;!--操作数据库包--&gt;
                &lt;dependency&gt;
                  &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
                  &lt;artifactId&gt;spring-boot-starter-data-jpa&lt;/artifactId&gt;
                &lt;/dependency&gt;
                &lt;dependency&gt;
                  &lt;groupId&gt;mysql&lt;/groupId&gt;
                  &lt;artifactId&gt;mysql-connector-java&lt;/artifactId&gt;
                &lt;/dependency&gt;
              &lt;/dependencies&gt;
            
              &lt;build&gt;
                &lt;finalName&gt;SpringBoot&lt;/finalName&gt;
                &lt;plugins&gt;
                &lt;plugin&gt;
                  &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
                  &lt;artifactId&gt;spring-boot-maven-plugin&lt;/artifactId&gt;
                &lt;/plugin&gt;
                &lt;/plugins&gt;
              &lt;/build&gt;
            
              &lt;!--远程仓库定义--&gt;
              &lt;repositories&gt;
                &lt;repository&gt;
                  &lt;id&gt;spring-snapshots&lt;/id&gt;
                  &lt;url&gt;http://repo.spring.io/snapshot&lt;/url&gt;
                  &lt;snapshots&gt;&lt;enabled&gt;true&lt;/enabled&gt;&lt;/snapshots&gt;
                &lt;/repository&gt;
                &lt;repository&gt;
                  &lt;id&gt;spring-milestones&lt;/id&gt;
                  &lt;url&gt;http://repo.spring.io/milestone&lt;/url&gt;
                &lt;/repository&gt;
              &lt;/repositories&gt;
              &lt;pluginRepositories&gt;
                &lt;pluginRepository&gt;
                  &lt;id&gt;spring-snapshots&lt;/id&gt;
                  &lt;url&gt;http://repo.spring.io/snapshot&lt;/url&gt;
                &lt;/pluginRepository&gt;
                &lt;pluginRepository&gt;
                  &lt;id&gt;spring-milestones&lt;/id&gt;
                  &lt;url&gt;http://repo.spring.io/milestone&lt;/url&gt;
                &lt;/pluginRepository&gt;
              &lt;/pluginRepositories&gt;
            &lt;/project&gt;
    </pre>
方法2：显示声明所有Maven配置

 ##### 2，编写执行类（程序入口）
    Application.java文件
 
 ##### 3，编写控制层Controller类
 主要使用<p>
 @RestController,@RequestMapping等注解类
 ##### 4，编写bean相关类，无须写配置文件
 包括实体类，仓库类
 