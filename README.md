# Cucumber Automated Testing - Blackjack
A simple blackjack game that runs in a Docker container. When the code is compiled, it runs automatic tests on the behavior of the software

## Installation
It is necessary to have docker installed, therefore if you do not have it installed inside your machine and you use Ubuntu, it is advisable to follow the following instructions: </br>
https://docs.docker.com/install/linux/docker-ce/ubuntu/

To run the dockerized application, you have to execute the following steps inside the terminal:

```sh
git clone https://github.com/tdavilab/cucumber-automated-testing
cd cucumber-automated-testing
sudo docker build -t 21-container/test .
sudo docker run 21-container/test
```

**Made by:**
Thomas Daniel Avila Blenkey, Jonathan Steven Capera Quintana and Daniel David Leal Lara
