# gamebuddy-backend



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