def call(String dockerHubCredentialsId, String dockerImage, String dockerTag, String dockerHubRepo) {
    script {
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
    docker.image('carlosdelgadillo/sumaa').push('latest')
}

    }
}
