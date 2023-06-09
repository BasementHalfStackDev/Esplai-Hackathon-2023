# Hackathon Fundació Esplai | T-Systems | Microsoft 2023

Back-end challenge for the 2023 Hackathon.

## Utilised Technologies

### Spring Framework

<p>For the back-end functionality, API, and security.</p>

<img width="500" src="https://github.com/BasementHalfStackDev/Esplai-Hackathon-2023/assets/89463715/4b6ac198-edb4-4db6-8dd1-24ff8fa12340">

### MySQL

<p>As the database service.</p>

<img width="500" src="https://d1.awsstatic.com/asset-repository/products/amazon-rds/1024px-MySQL.ff87215b43fd7292af172e2a5d9b844217262571.png">

## How to use

<ul>
  <li>Modify application.properties located in src/main/resuroces as needed.</li>
  <li>Modify "spring.datasource.url=jdbc:mysql://[pathToYourDatabaseServer/databaseName]" to your MySQL database server and database name."</li>
  <li>Modify "spring.datasource.username" to your database username.</li>
  <li>Modify "spring.datasource.password" to your database password.</li>
  <li>Modify server.port to your desired port for the API</li>
  <li>You can also modify the JWT secret key and expiration time</li>
 </ul>
 
 <p>If all is correctly configured. The API will automatically initialise the database tables with some example values defined in "/src/main/resources/data.sql".</p>

## Utilisation example

To view examples, click <a href="https://documenter.getpostman.com/view/27466796/2s93kxdS24">[here]</a>.

## Routes

### /auth

<p>Routes for user authentication</p>

#### /auth/signup

<p>POST route for user registration. Requires username, password and email. Assigns user role by default and encrypts password using BCrypt.</p>

#### /auth/signin

<p>POST route for user log in. Requires username and password. It returns the JWT bearer token.</p>

### /api

<p>Routes for authenticated users. </p>

#### /api/welcome

<p>GET route. If correctly authenticated using the generated JWT, will return a welcome message.</p>
