@echo off

rem Remove existing .class files
del /S /Q *.class

rem Compile Start.java
javac Start.java

rem Run the compiled Java program
java Start
