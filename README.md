#介绍
Spring Mvc小例子，使用maven来构建项目，学习spring mvc的基本功能使用

##构建
本项目使用maven构建，如果使用eclipse来导入项目，需要先使用mvn eclipse:eclipse 转化为eclipse项目之后完成直接import就可以，如果使用Intellij idea 则直接import project选中pom.xml的文件即可

##运行
命令行进入项目目录，直接mvn jetty:run  即可.    
如果使用Intellij idea来执行maven命令，在Run下edit configuration中添加一个maven，然后在Command line上写入jetty:run 即可
运行也可以用tomcat来运行，但是jetty的运行方式支持热部署，比较方便推荐使用
