## Test Task: Server Application

This is a server-side application for a test task. The application allows you to interact with a MySQL database to store and retrieve numerical data.

### Prerequisites

Before running the server application, make sure you have the following prerequisites:

1. **MySQL Database**: Manually create a MySQL database with the name `test_task`. You can use your preferred MySQL management tool to create the database.

2. **Run Initial Database Setup**: After creating the database, open the `schema.sql` file in your project and uncomment the following line:

   ```sql
   --INSERT INTO `number` (`id`, `number_value`) VALUES (1, 0);
   ```

   You can just copy scripts from this file and execute them directly in your MySQL management tool (then you have to go to application.properties and set `spring.sql.init.mode=never`) or you can run the application, comment out 'insert' line and after that start the app again.
### Running the Application

Follow these steps to run the server application:

1. Make sure you have Java 17 and Gradle installed.

2. Open a terminal and navigate to the project directory.

3. Run the following command to build and start the server application:

   ```sh
   ./gradlew bootRun
   ```

   This will start the Spring Boot application, and it will be accessible at `http://localhost:8080`.

### API Endpoints

The server provides the following API endpoints:

- **POST `/api/numbers`**: Create a new number entry in the database. The request body should be in JSON format with the following structure:

   ```json
   {
     "id": "1",
     "numberValue": "42"
   }
   ```

- **GET `/api/numbers`**: Retrieve the number entry from the database.

**Note**: This README provides instructions for the server-side application. If you want to set up the client-side Flutter application, please refer to the respective README in the [Flutter project](https://github.com/AndriyBarskyi/test_task_f).
