
# Ewallet Microservices Project

This project is a microservices-based e-wallet application. It consists of multiple services that handle different aspects of the e-wallet functionality, including user management, wallet management, transaction processing, and notifications.It consists of four main services, each responsible for a specific aspect of the e-wallet functionality. The services communicate with each other using REST APIs and Kafka for inter-service communication.

## Project Structure
The project is organized into four main directories, each representing a microservice:

1. ewalletNotificationService-master
2. ewalletTransactionService-master
3. ewalletUserService-master
4. ewalletWalletService-master

```
ewalletNotificationService-master/
    .gitignore
    pom.xml
    src/
        main/
    target/
ewalletTransactionService-master/
    .gitignore
    pom.xml
    src/
        main/
    target/
ewalletUserService-master/
    .gitignore
    pom.xml
    src/
        main/
    target/
ewalletWalletService-master/
    .gitignore
    pom.xml
    src/
        main/
    target/
```

## Services

### UserService

Handles user-related activities such as signing up, signing in, updating, and deleting users.

**APIs:**

- `POST /user/signup`: Sign up a new user.
- `GET /user/profile`: Retrieve user profile information.
- `DELETE /user/remove`: Remove a user account.
- `PUT/PATCH /user/profile/update`: Update user profile information.

**Events:**

- `USER_CREATE` -> Publish -> `userID`: Event triggered when a new user is created.
- `USER_REMOVE` -> Publish -> `userID`: Event triggered when a user is removed.

**Relevant Code:**

- `UserRequest`: Handles user request data.
- `MyUser`: Represents the user entity.
- `UserMessage`: Manages user-related messages.
- `UserService`: Core service logic for user management.

### WalletService

Handles wallet-related activities such as creating a wallet, showing balance, and updating wallet balance.

**APIs:**

- `GET /wallet/details`: Retrieve wallet details and balance.

**Events:**

- Receive event -> Consumer -> `USER_CREATED` -> create a wallet: Creates a wallet when a new user is created.

**Relevant Code:**

- `UserMessage`: Manages user-related messages.

### TransactionService

Handles transactions between users, including adding and withdrawing balance, and storing transaction status.

**APIs:**

- `POST /transaction`: Initiate a new transaction.

**Events:**

- `WALLET_TRANS` -> Publish -> transaction details: Event triggered for wallet transactions.
- `TRANS_STATUS` -> Publish -> transaction status: Event triggered for transaction status updates.

### NotificationService

Sends notifications to users about transaction status and updated wallet balance.

**APIs:**

- `POST /notification/send`: Send a notification to a user.

**Events:**

- `NOTIFICATION` -> Publish -> notification details: Event triggered for sending notifications.

## Design Notes

- **UserService:** Handles all user-related activities and stores user data in the user database.
- **WalletService:** Handles all wallet updates and stores wallet data in the wallet database.
- **TransactionService:** Processes transaction requests, updates wallets, stores transaction status, and sends notifications.
- **NotificationService:** Notifies users about transaction status and balance updates.

## Communication

- **REST:** Used for external communication between services.
- **Kafka:** Used for inter-service communication.

## Getting Started

### Prerequisites

- Java 11
- Maven
- Kafka
- Spring Boot

### Building the Project

Navigate to each service directory and run the following command:

```sh
mvn clean install
```

### Running the Services

Navigate to each service directory and run the following command:

```sh
mvn spring-boot:run
```

### Testing

Unit tests are located in the `src/test` directory of each service. To run the tests, navigate to the service directory and run:

```sh
mvn test
```
