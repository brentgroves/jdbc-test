#!/bin/bash
rm JdbcAllTests.jar
rm -rf mobex
javac -verbose -d . ../src/mobex/mssql/*.java  
jar cvfm JdbcAllTests.jar manifest.txt mobex/mssql/*.class
