# ByteBrawlers
To run the entire program locally you need to first clone the entire repository.

Once you have cloned the repository you need to have the latest version on node installed on your computer so you are able to run npm commands.
If you do not have them installed follow the tutorial on the website: https://radixweb.com/blog/installing-npm-and-nodejs-on-windows-and-mac

## Frontend
If node is already installed than in your terminal locate the frontend directory and run 'npm install'. 

This will install all of the necessary React dependecies for your project.

Once 'npm install' is finished installign your dependecies to run the front end of the project make sure you are still inside fo the frontend directory. You need to be inside of that directory to run 'npm start' to start your React application.

You should see this page with a few React errors saying "Failed to fetch".

## Backend
Once you have the frontend app running you need to boot up the backend to get your React app connected to your database.

To start, you need to have an IDE with JDK 17 or higher download, in order to compile our SpringBoot application. I am using VScode and have the latest "Extension Pack for Java" extension downlaoded on my machine which works great for compiling and running the application. The details for the extension pack are located under this message.
Extension Pack for Java
Id: vscjava.vscode-java-pack
Description: Popular extensions for Java development that provides Java IntelliSense, debugging, testing, Maven/Gradle support, project management and more
Version: 0.25.15
Publisher: Microsoft
VS Marketplace Link: https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack

After you are successfully able to compile and run the application once you hit start, and the application fully boots, refresh your React app on your localhost. You should no longer see any errors occuring and should see items from our database populate the screen.
