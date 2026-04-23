def call(){
    timieout(time: 1, unit: 'HOURS'){
        waitForQualityGate abortPipeline: true
    }
}