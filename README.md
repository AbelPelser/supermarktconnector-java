A Java port of https://github.com/bartmachielsen/SupermarktConnector

Intended to be used as a library. In order to do so, run `mvn clean install` from the repository root, and then include
in your project's pom:

```xml

<dependencies>
  ...
  <dependency>
    <groupId>org.harrygovert</groupId>
    <artifactId>supermarktconnector</artifactId>
    <version>1.0</version>
  </dependency>
</dependencies>
```

Since there is virtually no real logic in this code, there are no unit tests (yet). Consult `ExampleUsage.java` to get
an idea of how to use the code. To execute this file,
run `mvn clean package && java -jar target/supermarktconnector-*-jar-with-dependencies.jar`  
