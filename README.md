#Sample springboot app
## illustrates docker env

####on your localhost:

mvn clean install

mvn spring-boot:run

curl localhost:8080/hello

Docker
    
    docker build -t . iliefa/samples:vX
Kubernetes:

    kubectl create deployment sample-springboot --image=iliefa/samples
    kubectl expose deployment sample-springboot --port=8080
    kubectl scale deployment sample-springboot --replicas=5
    kubectl get svc
    for i in `seq 1 20`; do curl http://ClusterIp:8080/hello;echo ""; done
 you can edit in the K8s deployment the env variables from
 the HelloControler class, named DB_URL, DB_USER, HOSTNAME  
