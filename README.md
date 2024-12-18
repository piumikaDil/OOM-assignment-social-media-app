
# OOM-Assignment-Social-Media-App


Welcome to the OOM-Assignment-Social-Media-App! This is a simple social media desktop application built using JavaFX, SceneBuilder, and Java 11, with a strong focus on Test-Driven Development (TDD) principles, powered by JUnit 5.

# 📌 Features
1 - Publish-Subscribe Model: Users can interact by subscribing and viewing content from various channels.

2 - GUI Interface: Easy-to-use interface for posting and viewing content.

3 - Subscription Management: Users can subscribe or unsubscribe to channels.

# 🛠️ Technologies Used
This project is built using the following technologies:

* JavaFX: For building the desktop user interface.
* SceneBuilder: For designing the UI with a drag-and-drop approach.
* Java 11: For developing the application.
* JUnit 5: For unit testing and ensuring code quality.
* Maven: For build management and dependency handling.

# 🗂️ Project Structure

Here’s a brief overview of the project structure:

* Main Class: HelloApplication.java - The entry point for running the application.

# 🔧 Prerequisites
To run this application, ensure that you have the following software installed:

* Java 11: Download Java 11
* JavaFX SDK: Download JavaFX SDK
* SceneBuilder: Download SceneBuilder
* Maven: Download Maven
* IDE: IntelliJ IDEA, Eclipse, or Visual Studio Code with Maven plugin.

# 🚀 How to Run the Application
1. Clone the Repository
Clone the project repository to your local machine:

bash
Copy code
git clone https://github.com/piumikaDil/OOM-assignment-social-media-app.git

cd OOM-assignment-social-media-app

2. Set Up JavaFX
Configure your IDE to include the JavaFX SDK:

Make sure JavaFX libraries are added to your project’s build path.

3. Build and Run with Maven
Build and run the application using Maven from the command line:

-bash
Copy code
"mvn clean javafx:run"
This will clean the project, compile the code, and launch the application.

4. Run Tests
Execute tests using Maven to ensure everything works smoothly:


# ⚙️ pom.xml Configuration Example for testing 


    <!-- TestFX Dependencies -->
    <dependency>
      <groupId>org.testfx</groupId>
      <artifactId>testfx-core</artifactId>
      <version>4.0.18</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.testfx</groupId>
      <artifactId>testfx-junit5</artifactId>
      <version>4.0.18</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>RELEASE</version>
      <scope>compile</scope>
    </dependency>

  
