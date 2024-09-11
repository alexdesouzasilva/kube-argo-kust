# Kustomize
* kustomize build

# Kubernetes

### apply manifestos 
* k apply -f k8s/deployment.yaml
* k get pods
* k apply -f k8s/service.yaml
* k get svc

### Testando aplicação rodando dentro do kubernetes
* k port-forward svc/kube-argo-kust 8082:8082


### Criando repositório pelo CLI do github
* gh repo create 
* name: alexdesouzasilva/kube-argo-kust
