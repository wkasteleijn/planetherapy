set JAVA_HOME=resources\app\jre
set PATH=%JAVA_HOME%\bin;%PATH%
%JAVA_HOME%\bin\java.exe -jar pleunus-worker.jar >> pleunus-worker.log
