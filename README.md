## mvn package
run-module依赖了child-module，
我希望run-module在执行package时，可以在当前项目中寻找需要的依赖，
但实际情况是run-module找不到child-module，即使我已经把child-module执行install安装到了本地，
我应该怎么写才能让run-module找到其需要的child-module呢

```shell
/usr/local/java/jdk1.8.0_251/bin/java -Dvisualvm.id=39598324344490 -Dmaven.multiModuleProjectDirectory=/home/archgeass/workspace/github/MoreProblemsDiscussed/run-module -Dmaven.home=/usr/local/java/apache-maven-3.6.3 -Dclassworlds.conf=/usr/local/java/apache-maven-3.6.3/bin/m2.conf -Dmaven.ext.class.path=/home/archgeass/software/ide/idea-IC-203.5981.155/plugins/maven/lib/maven-event-listener.jar -javaagent:/home/archgeass/software/ide/idea-IC-203.5981.155/lib/idea_rt.jar=44249:/home/archgeass/software/ide/idea-IC-203.5981.155/bin -Dfile.encoding=UTF-8 -classpath /usr/local/java/apache-maven-3.6.3/boot/plexus-classworlds.license:/usr/local/java/apache-maven-3.6.3/boot/plexus-classworlds-2.6.0.jar org.codehaus.classworlds.Launcher -Didea.version=2020.3 package
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< org.geass:run-module >------------------------
[INFO] Building run-module 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.387 s
[INFO] Finished at: 2020-12-07T16:53:51+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal on project run-module: Could not resolve dependencies for project org.geass:run-module:jar:1.0-SNAPSHOT: Failure to find org.geass:child-module:jar:1.0-SNAPSHOT in http://maven.haihang.ifengidc.com:8081/nexus/content/groups/public/ was cached in the local repository, resolution will not be reattempted until the update interval of nexus-mirror has elapsed or updates are forced -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException

进程已结束,退出代码1

```