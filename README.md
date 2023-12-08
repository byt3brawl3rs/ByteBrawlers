# ByteBrawlers
To run the entire program locally you need to first clone the entire repository.
<img width="960" alt="Image1_Downlaod_From_Code_Button" src="https://github.com/byt3brawl3rs/ByteBrawlers/assets/112716986/3a41f387-8118-41f5-9e57-396f6dc678a9">
<img width="960" alt="Image2_Select_Download_Folder" src="https://github.com/byt3brawl3rs/ByteBrawlers/assets/112716986/917a957b-a1d9-4991-b677-dbfc0ed8cc0a">

Once you have cloned the repository you need to have the latest version on node installed on your computer so you are able to run npm commands.
You can follow this link if you do not have them isntalled: https://docs.npmjs.com/downloading-and-installing-node-js-and-npm

## Frontend
If node is already installed than run your terminal as an administrator. In the terminal locate the frontend directory and run 'npm install'. This will install all of the necessary React dependecies for your project.
<img width="960" alt="Image3_Running_npm_install" src="https://github.com/byt3brawl3rs/ByteBrawlers/assets/112716986/2e564928-5a93-4d6a-a59d-f8eea6a84705">

Once 'npm install' is finished installing your dependecies to run the front end of the project make sure you are still inside fo the frontend directory. You need to be inside of that directory to run 'npm start' to start your React application.You should see this page with a few React errors saying "Failed to fetch".
<img width="960" alt="Image4_Running_npm_start" src="https://github.com/byt3brawl3rs/ByteBrawlers/assets/112716986/e3b790f3-e575-4214-82ca-ff47c24d6e13">

## Backend
Once you have the frontend app running you need to boot up the backend to get your React app connected to your database.
<img width="960" alt="Image5_Navigate_to_mian_class" src="https://github.com/byt3brawl3rs/ByteBrawlers/assets/112716986/c88a77ea-dffb-4de0-b680-82c251486938">

To start, you need to have an IDE with JDK 17 or higher download, in order to compile our SpringBoot application. I am using VScode and have the latest "Extension Pack for Java" extension downlaoded on my machine which works great for compiling and running the application. The details for the extension pack are located under this message.
Extension Pack for Java
Id: vscjava.vscode-java-pack
Description: Popular extensions for Java development that provides Java IntelliSense, debugging, testing, Maven/Gradle support, project management and more
Version: 0.25.15
Publisher: Microsoft
VS Marketplace Link: https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack

After you are successfully able to compile and run the application once you hit start, and the application fully boots, refresh your React app on your localhost. You should
no longer see any errors occuring and should see items from our database populate the screen.
<img width="960" alt="Image5_Run_main_class_and_Refresh" src="https://github.com/byt3brawl3rs/ByteBrawlers/assets/112716986/aeb5bd64-81ff-4baf-895f-01ab039e7c58">

