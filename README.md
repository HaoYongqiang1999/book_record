# book_record
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
通过添加spring-boot-starter-actuator依赖，并在yml里配置
management.endpoints.web.exposure.include: "beans"后，可以通过http://localhost:81/actuator/beans查看当前应用的所有bean