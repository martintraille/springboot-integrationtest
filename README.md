# Overview
In this project, we will show how Spring boot and spring data can be used to integrate with PostgreSQL.

## To Build the project and run Integration Test:
```mvn clean install```

## If you want to start the application:
```java -jar target/springboottest-0.0.1-SNAPSHOT.jar```

## Tasks

The StudentControllerTests.java file is failing to compile 
and some tests within that file are also failing.


1. Update the StudentControllerTests.java file to fix the compilation issues
2. Make all tests pass within the StudentControllerTests.java

#Bonus
1. Extend the StudentControllerTests file to include startYear as integer and make sure it fails.
2. Expand the Service to include a startYear field and make sure all tests pass.
3. Update the StudentControllerMockTests file to check on the name, description and startYear.


## Tasks
To run tests:
```mvn -Dtest=StudentControllerTests test```
