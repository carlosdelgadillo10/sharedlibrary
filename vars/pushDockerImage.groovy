def pushDockerImage(String dockerHubCredentialsId, String docker_Image, String dockerTag, String dockerHubRepo) {
    script {
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
        docker.image("${docker_image}")push('latest')
}

    }
}
