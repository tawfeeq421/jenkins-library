def call(String sonarEnv, String scannerTool){
    def scannerHome = tool scannerTool

    withSonarQubeEnv(sonarEnv){
        sh "${scannerHome}/bin/sonar-scanner"
    }
}