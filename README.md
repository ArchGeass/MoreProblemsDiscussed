## 目标
spring-boot项目，计划实现不同业务模块的代码分离，
parent模块作为主模块，负责加载不同子模块代码并启动运行，
子模块不需要单独编译运行，只包含具体业务代码，由父模块一并加载启动

## 现象
不清楚maven中<modeles>相对于<dependencies>在依赖代码引用层面的区别，
父pom在不使用<dependencies>引入而单纯使用<modules>声明时，父模块无法引入子模块代码；
父模块在增加对于子模块的<dependencies>声明后，可以正常引入子模块的代码，
但无法执行maven相关命令，如clean和package命令，
会产生`Process terminated`的报错(`child-module:1.0-SNAPSHOT is referencing itself`)，
同时无法正常启动父模块ParentMainClass(另一个项目确实无法启动，启动报错是乱码无法排查，不清楚这个项目为啥能成功启动)

同时pom.xml关于<packing>的声明，父模块需要编译为`jar`，但根据idea提示只能指定为`pom`
不知道是不是maven对于含有子module的pom.xml中的<packing>只能为`pom`

## 求助
这样的maven结构是否可行，如果可行应该怎么改造,目前错在了哪里

## 附上另一个项目的启动报错声明
`java: æäºå·æå¾ªç¯ä¾èµå³ç³» [child-model-1,child-model-2] çæ¨¡åå¨é¡¹ç®è®¾ç½®ä¸­å·²éå 'éå å½ä»¤è¡åæ°'ã
è¿äºç¼è¯éé¡¹å·²åºç¨äºå¾ªç¯ä¸­çæææ¨¡åã`
已检测idea的几个编码设置均为utf-8,
针对此乱码报错暂时不知如何调整，使得可以输出正常报错信息
