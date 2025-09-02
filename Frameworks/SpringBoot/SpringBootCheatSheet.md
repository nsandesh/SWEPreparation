Spring Boot Cheat Sheet

Here is a comprehensive list of all the topics covered in the provided video transcript, which serves as a cheat sheet for Spring Boot interviews for Senior Java Developers:

1. Core Concepts

• Starter Dependencies: Understanding which starter dependencies (e.g., spring-boot-starter-web for web applications, ORM like Hibernate/JPA, spring-boot-starter-security for basic security) are used and why.
• Profiling: Knowledge of different profiles (e.g., dev, PPE, UAT, production, local) and how properties are segregated across them.
• Actuator: How to use Actuator to monitor the health of the application.
• Dependency Injection: Understanding how dependencies are injected instead of creating objects with the new keyword.
• Embedded Servers: Familiarity with embedded servers like Tomcat (default), Jetty, or Undertow.
• DevTools: Usage of DevTools for local development to improve performance of startup time.
• Spring Boot CLI: How to use Spring Boot CLI to create projects.
• Starter Customization: How to customize and use customized starter dependencies.
• Lazy Initialization: Understanding lazy vs. eager initialization, and when to use lazy initialization for faster startup, especially in modern Kubernetes environments.
• Application Events: Knowledge of application events.
• Error Handling: Methods for error handling, including custom error handling, global exception handling, and annotations used for controller-level errors with filters and AOP.
• AOP (Aspect-Oriented Programming): Knowledge of AOP in Spring Boot applications.
• Externalized Configurations: How to manage properties using keywords, config servers, or Azure keywords to centralize configurations.


2. Security

• Authentication: Different methods of authentication such as username/password, token-based, OAuth2 with Okta (third-party mechanism), Multi-Factor Authentication (MFA), and social login.
• Authorization: Understanding various authorization approaches: role-based (@PreAuthorize("hasRole('ADMIN')")), permission/scope-based (hasAuthority('SCOPE_READ')), attribute-based (rare, based on IP, device, time), and policy-based for fine-grained control.
• Security Implementation Location: Where security and routing are implemented, such as at the API Gateway, edge level, or within each microservice.
• Rate Limiting and Throttling: Usage of rate limiting and throttling, filtration of firewalls.
• Service-to-Service Security: Implementing security between services using mutual TLS certificates and token propagation with JWT and OAuth2.
• Best Practices for Security:
    ◦ Use short-lived tokens and refresh tokens.
    ◦ Adhere to the Principle of Least Privilege (PoLP).
    ◦ Rotate secrets and keys.
    ◦ Carefully allow Actuator endpoints in production.
    ◦ Disable CSRF only for stateless applications.
    ◦ Implement strong password policies, e.g., using Bcrypt.
    ◦ Adopt a Zero Trust Policy, requiring authentication for every request.
    ◦ Understand claims and scopes.
    ◦ Implement session fixation protection if using sessions.
    ◦ Conduct security testing through penetration testing, OWASP web scanner, and SonarQube.
    ◦ Use mTLS or HTTPS for inter-microservice communication.
    ◦ Avoid default usernames and passwords; store secrets in key vaults (e.g., Azure Key Vault, AWS Key, or custom key vaults).
• Advanced Topics: CORS, reactive security (and its difference from blocking security chains), thread protection with CSRF and hijacking.


3. Microservices

• Config Management: Using tools like Key Vault, Spring Config, Cloud Configs, Consul, Key Maps, and Feature Toggles.
• Service Discovery: Implementing service discovery with ZooKeeper or Eureka.
• Service-to-Service Routing: Internal routing within the system using ISTIO.
• Sidecar Design Pattern: Understanding the sidecar design pattern for service discovery.
• Resilience and Fault Tolerance: Strategies for resilience and fault tolerance.
• Distributed Transactions: Various methods for handling distributed transactions, such as Saga, Outbox patterns, and eventual consistencies.
• Communication Styles: How microservices communicate (synchronous, asynchronous, or event-driven).
• Observability: Implementing observability with metrics, tracing, and centralized logging.
• API Designs: Designing APIs as REST endpoints, gRPC, GraphQL, or using OpenAPI/Swagger for documentation and contract sharing.
• Data Management: Best practices for managing databases across microservices, emphasising "database per service" and avoiding shared databases.
• Deployment: Deployment strategies using Docker and Kubernetes, including Canary, Blue-Green, and Rolling updates.
• Security at Microservices Level: Managing security with mutual Transport Layer Security (mTLS) using certificates or auth tokens.
• Best Practices for Microservices: Backward compatibility, API versioning, graceful degradation, API timeouts, and avoiding "God Services".

4. Performance and Monitoring

• Monitoring and Metrics: Using Micrometer and Prometheus for JVM, business, and custom metrics, and meter registries.
• Tracing: Distributed tracing, backend tracing (e.g., Splunk), maintaining span ID and trace ID across microservices, and tracing asynchronous calls.
• Logging: Structured JSON logging, centralized logging (and ensuring it's not a single point of failure), correlation IDs, and masking sensitive information.
• Startup Optimization: Reducing startup time through lazy initialization, limiting component scans, removing unused starter dependencies, and analyzing startup time with Actuator.
• Runtime Performance Optimization: Strategies like moving from synchronous to asynchronous communication, leveraging reactive programming, implementing caching (Redis, Caffeine), asynchronous processing, and batch inserts/updates.
• Database Performance: Avoiding N+1 queries, using indexes, pagination, views, projections, monitoring with Actuator, read replicas, caching for scaling patterns, and static connection pooling.
• API Performance: Improving API performance with caching, pagination for large data, and rate limiting.
• Resilience and Self-healing: Implementing circuit breaker patterns, health checks for microservices, Kubernetes probes, and graceful shutdowns.


5. Testing

• Unit Testing: Using JUnit (specifically JUnit 5) with Mockito for mocking dependencies and @InjectMocks for testing existing classes.
• Integration Testing: Using Cucumber for integration tests.
• Slice Testing: Performing slice testing.
• Infrastructure Testing: Conducting infrastructure testing.
• Contract Testing: Implementing contract testing.
• End-to-End Testing: Performing end-to-end testing, possibly with Selenium.
• Performance/Load Testing: Mentioned as a type of testing.
• Quality Testing: Using tools like SonarQube for code quality and vulnerability scanning.
• Best Practices for Testing:
    ◦ Keep unit tests fast to avoid increasing CI/CD pipeline time.
    ◦ Avoid mocking everything.
    ◦ Utilize profiles for testing.
    ◦ Employ Given/When/Then assertions.
    ◦ Ensure test coverage in CI/CD.
    ◦ Prefer idempotent data.


6. Common Pitfalls

• Overuse of Component Scan: Excessive use can burden the application.
• Fat Jars: Using fat jars can lead to increased memory footprints and deployment difficulties.
• Uncontrolled Dependency Versions: Not locking dependency versions can cause build failures.
• Hardcoding Secrets: Storing secrets directly in property files instead of secure key vaults.
• Mixing Profiles: Mixing multiple different profiles simultaneously.
• Exposing Actuator Endpoints: Unsecured exposure can reveal sensitive information about the application's environment and beans.
• Insecure Communication: Not using mTLS or HTTPS for inter-microservice communication.
• Default Credentials: Using default usernames and passwords for databases.
• Database Pitfalls: N+1 query problem, lack of pagination, improper connection pooling (creating new pools for every request), and manual schema creation instead of using migration tools like Flyway or Liquibase.
• JVM Tuning: Lack of proper JVM tuning.
• Caching: Insufficient or improper caching.
• Request Timeouts: Not implementing request timeouts.
• Overuse of Spring Boot Tests: Unnecessary loading of data during tests.
• Flaky End-to-End Tests: Causing random build failures.
• Anti-Patterns: Mentioned as something to be aware of.


7. Design Patterns

• Builder Design Pattern: For creating objects with a specific set of fields out of many available fields.
• Factory Design Pattern / Abstract Factory Design Pattern: For abstracting the creation of objects from users.
• Template Method Design Pattern: Examples include RestTemplate and JdbcTemplate.
• Decorator Design Pattern: Used for filters and interceptors.


8. Property Precedences

• This topic is mentioned in the initial outline of what will be covered. While not detailed in a dedicated section, it is implicitly related to externalized configurations and how properties are managed and applied across different environments.
