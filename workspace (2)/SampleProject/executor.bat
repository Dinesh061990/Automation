set myProjectpath=C:\my\workspace\location\Basic
cd %myProjectpath%
set classpath=%myProjectpath%\bin;%myProjectpath%\lib\*
java org.testng.TestNG %myProjectpath%\sampleTest.xml
