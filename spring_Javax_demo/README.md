# Spring and Javax 

> Main focus of this demo is Javax JSR-330 @Inject and 
> @Named standard annotations usage in real time projects.


#### Spring vs Javax Annotation

| Spring | Javax |
| :---: | :---: |
| @Component | @Named |
| @Autowired | @Inject |

> Please refer EmployeeService and EmployeeController classed 
> for @Named and @Inject usage accordingly.


#### Required Dependencies: (pom.xml)
```maven
<!-- Javax Annotatios -->
<dependency>
   <groupId>javax.inject</groupId>
   <artifactId>javax.inject</artifactId>
   <version>1</version>
</dependency>

<!-- Spring WEB annotations -->
<dependency>
    <groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
	<version>2.3.4.RELEASE</version>
</dependency>
```


