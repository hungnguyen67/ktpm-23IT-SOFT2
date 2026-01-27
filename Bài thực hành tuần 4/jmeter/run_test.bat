@echo off
REM 
REM 

set JMETER_HOME=C:\apache-jmeter-5.6.3

echo Running JMeter test plan...
"%JMETER_HOME%\bin\jmeter.bat" -n -t test_plan.jmx -l results.csv

echo Test completed. Check results.csv for output.
pause