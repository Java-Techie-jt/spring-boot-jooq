# spring-boot-jooq

## jooq-codegen-maven plugin

```
<plugin>
                <groupId>org.jooq</groupId>
                <artifactId>jooq-codegen-maven</artifactId>
                <executions>
                    <execution>
                        <id>jooq-codegen</id>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <!--Insert your DB configuration-->
                            <jdbc>
                                <driver>com.mysql.cj.jdbc.Driver</driver>
                                <url>jdbc:mysql://localhost:3306/javatechie_youtube</url>
                                <user>username</user>
                                <password>password</password>
                            </jdbc>
                            <generator>
                                <database>
                                    <name>org.jooq.meta.mysql.MySQLDatabase</name>
                                    <includes>.*</includes>
                                    <excludes></excludes>
                                    <inputSchema>javatechie_youtube</inputSchema>
                                </database>
                                <generate>
                                    <pojos>true</pojos>
                                    <pojosEqualsAndHashCode>
                                        true
                                    </pojosEqualsAndHashCode>
                                    <javaTimeTypes>true</javaTimeTypes>
                                    <fluentSetters>true</fluentSetters>
                                </generate>
                                <target>
                                    <packageName>
                                        com.tej.JooQDemo.jooq.sample.model
                                    </packageName>
                                    <directory>
                                        target/generated-sources/jooq
                                    </directory>
                                </target>
                            </generator>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            ```
