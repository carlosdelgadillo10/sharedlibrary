def call(String dockerHubCredentialsId, String dockerImage, String dockerTag, String dockerHubRepo) {
    script {
        docker.withRegistry('https://registry.hub.docker.com', dockerHubCredentialsId) {
            sh "docker tag ${dockerImage}:${dockerTag} ${dockerHubRepo}:${dockerTag}"
            sh "docker push ${dockerHubRepo}:${dockerTag}"
        }
    }
}
