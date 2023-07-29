# Hexagonal Architecture Project Microservices
Dependencies :
              - Spring Boot Starter Web
              - Spring Boot Starter Jpa
              - MySQL Connector
Maven Project 2.7.9
Java Versión 8

1. Domain
    - models
        -  (c)AdditionalTaskInfo
        -  (c)Task 
    - ports
        -  input
            -  (i)CreateTaskUseCase
            -  (i)DeleteTaskUseCase
            -  (i)GetAdditionalInfoUseCase
            -  (i)RetreiveTaskUseCase
            -  (i)UpdateTaskUseCase     
        -  output
            -  (i)ExternalServicePort
            -  (i)TaskRepositoryPort  
2. Application
    - services
        - (c)TaskService
    - usecases
        - (c)CreateTaskUseCaseImpl
        - (c)DeleteTaskUseCaseImpl
        - (c)GetAdditionalTaskInfoUseCaseImpl
        - (c)RetreiveTaskUseCaseImpl
        - (c)UpdateTaskUseCaseImpl 
3. Infrastructure
    - adapters
        - (c)ExternalServiceAdapter
    - config
        - (c)ApplicationConfig
    - controllers
        - (c)TaskController
    - entities
        - (c)TaskEntity
    - repositories
        - (i)JpaTaskRespository
        - (c)JpaTaskRepositoryAdapter
      
