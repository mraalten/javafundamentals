# javafundamentals

#Prerequisites
Make sure you have the following tools installed (description on how to install below):

- IntelliJ Idea
- Maven 3.5.4
- NodeJs
- Angular command line tools (Angular CLI)

#IntelliJ and checking out the project
Open IntelliJ and choose :
- VCS
- Checkout from Version Control
- Choose GIT
- For URL enter the following URL details : https://**USER**@github.com/mraalten/javafundamentals.git
  Replace **USER** with your GitHub-username
  
When committing and pushing code for the first time, you will be prompted for your Github-password.

#NodeJS
Install NodeJs package mananger:
Go to https://nodejs.org/ and download and install NodeJs

# Angular CLI interface
After NodeJs is installed you can enter the following command: npm install -g @angular/cli

The project consists of 2 modules: java-frontend (in Angular) and java-backend (in Java). To see if all works fine do the following:

####FrontEnd
Open Terminal or command-line and go the the directory java-frontend.
Enter the following command: **ng serve**

The server will be started and once ready open a browser and go to **localhost:4200**
If all works fine 