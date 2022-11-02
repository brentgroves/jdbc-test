https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html

# compile
pushd ~/src/jdbc-test/bin
./build.sh
<!-- https://www.dummies.com/article/technology/programming-web-design/java/how-to-use-the-javac-command-172116/ -->
<!-- https://www.dummies.com/article/technology/programming-web-design/java/how-to-use-the-javac-command-172116/ -->
javac -verbose -d . ../src/mobex/mssql/*.java  
-d specifies where to put the class files

# create the jar file
<!-- https://docs.oracle.com/javase/tutorial/deployment/jar/manifestindex.html -->
<!-- https://docs.oracle.com/javase/tutorial/deployment/jar/modman.html -->
We first create a text file named manifest.txt with the following contents:
Main-Class: mobex.mssql.JdbcAllTests
Class-Path: mssql-jdbc-11.2.0.jre11.jar
Warning: The text file must end with a new line or carriage return. The last line will not be parsed properly if it does not end with a new line or carriage return.

The basic command has this format:
jar cfm jar-file manifest-addition input-file(s)
Let's look at the options and arguments used in this command:
The c option indicates that you want to create a JAR file.
The m option indicates that you want to merge information from an existing file into the manifest file of the JAR file you're creating.
The f option indicates that you want the output to go to a file (the JAR file you're creating) rather than to standard output.
manifest-addition is the name (or path and name) of the existing text file whose contents you want to add to the contents of JAR file's manifest.
jar-file is the name that you want the resulting JAR file to have.
The input-file(s) argument is a space-separated list of one or more files that you want to be placed in your JAR file.
The m and f options must be in the same order as the corresponding arguments.

pushd ~/src/jdbc-test/bin
jar cvfm JdbcAllTests.jar manifest.txt mobex/mssql/*.class

You can directly invoke this application by running the following command:
Note: make sure the class files used by the program are specified in the Class-Path of the manifest.txt file.
java -jar JdbcAllTests.jar

Alternative if you did not create a jar file:
pushd ~/src/jdbc-test/bin
java -cp ../lib/mssql-jdbc-11.2.0.jre11.jar:. mobex.mssql.JdbcAllTests
