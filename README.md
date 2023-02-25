# Gamebuddy

## gamebuddy-backend
This is a multi-module Maven project that includes multiple HTTP services using Docker, Docker Compose, MongoDB, Spring Boot Reactive, and TypeScript React. The purpose of the app is to help people find more players to come play sports when the group is not big enough.

For example, to play basketball 5vs5 we need 10 players. If there are only 8, 2 more are needed. This app acts as a social network to find those extra players.

### Getting Started

#### Prerequisites
To run this app, you need to have the following software installed on your machine:
- Docker
- Docker Compose
- Clone the repository to your local machine.

In the root directory of the project, run the following command to start the Docker containers:

````
docker-compose pull
docker-compose up
````
This command will start MongoDB and all the HTTP services.

Open your web browser and navigate to http://localhost:3000 to view the app.

### Modules
This app consists of the following modules:

#### backend
This module contains the backend HTTP services built using Spring Boot Reactive. The backend provides the REST API for the app and communicates with the MongoDB database.
- gamebuddy-svc
- constants-svc
- repository-svc

#### frontend
This module contains the frontend built using TypeScript React. The frontend provides the user interface for the app and communicates with the backend through the REST API.

#### API Endpoints
The backend provides the following REST API endpoints:

GET /gameTypes -->> Retrieves all the available game types.

POST /games -->> Adds a new game to the database.

GET /games -->> Retrieves all the games in the database.

GET /games/{id} -->> Retrieves a specific game by its ID.

POST /players -->> Adds a new player to the database.

GET /players -->> Retrieves all the players in the database.

GET /players/{id} -->> Retrieves a specific player by its ID.

### Technologies Used
Docker
Docker Compose
MongoDB
Spring Boot Reactive
TypeScript React




install compass https://www.mongodb.com/docs/compass/master/install/ cd bin sudo ./install_compass
install python
https://stackoverflow.com/questions/3655306/ubuntu-usr-bin-env-python-no-such-file-or-directory
https://stackoverflow.com/questions/10575750/python-ioerror-errno-13-permission-denied



sudo apt-get update
sudo apt-get install -y curl jq
sudo curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose


install docker daemon
https://docs.docker.com/engine/install/ubuntu/


sudo docker-compose down
sudo docker-compose ps


ver o q corre em cada porta
sudo lsof -i :27017
matar
sudo systemctl stop mongod

gerar dockerfile
entrar no dir do dockerfile
sudo docker build -t repository-svc .


readlink -f $(which java)
echo $JAVA_HOME

$> mvn clean package
sudo apt install maven

https://www.baeldung.com/spring-boot-fix-the-no-main-manifest-attribute#:~:text=Whenever%20we%20encounter%20the%20%E2%80%9Cno,under%20the%20META%2DINF%20folder.