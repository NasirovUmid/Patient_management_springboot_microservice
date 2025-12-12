Superficial introduction to microservicses and some technologies. 
To patient_service work u need image of Db and make container name with usual dash "patient-service" so api-gateway can take it.
Billing-service is used only to prove connection with Grpc there is no business logic.
Auth-service generates token and validates it via Jwt and i also need Db image , local Db if u have.
Analytics-service serves as kafka consumer to demonstrate base kafka connestion , the producer is in patient_service .
Integration-tests are basic automated Junit tests. 
