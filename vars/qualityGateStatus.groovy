def call(sonarCredential){
waitForQualityGate abortPipeline: false, credentialsId: sonarCredential
}
