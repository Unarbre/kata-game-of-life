# Simple Game of life implementation #


## Summary ##

This project does not super (yet) multi generation processing. It will only return the very next generation every time you call it with a proper formatted generation.


## How to run me ##
Gradle version : Gradle 7.3.1
java version : 13
```shell
gradle build && ./gradlew :exposition:bootRun 
```

#How to run tests
For domain unitary tests :
 ```shell
gradle test
```

#How to run bdd tests
```shell
gradle cucumber
```