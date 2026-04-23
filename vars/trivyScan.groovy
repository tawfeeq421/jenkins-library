def call(String type, String image = ""){
    if (type == "fs"){
        sh '''
        trivy fs . \
        --severity HIGH,CRITICAL \
        --format table \
        --no-progress \
        > trivyfs-report.txt
        '''
    }
    else if (type == "image"){
        sh """
        trivy image ${DOCKER_IMAGE}:${DOCKER_TAG} \
        --severity HOGH,CRITICAL \
        --format table \
        --no-progress \
        > trivy-image-report.txt
        """
    }
    else {
        error "Invalid type. use 'fs' or 'image' "
    }
}