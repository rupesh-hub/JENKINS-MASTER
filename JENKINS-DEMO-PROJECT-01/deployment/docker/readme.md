1. Build project
   docker build -t rupesh1997/jenkins-demo-project:1.0.0 -f deployment/docker/Dockerfile .

2. Run on docker
    docker run -d -p 9090:9090 --name jenkins-demo-project rupesh1997/jenkins-demo-project:1.0.0
    
    -  curl http://localhost:9090/api/v1.0.0/messages

3. Docker commands
    docker system prune -f
    docker kill <container-id> && docker rm <container-id>