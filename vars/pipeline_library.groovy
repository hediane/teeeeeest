def call (Map config)
{
    pipeline
        {  any agent
        stages {
            stage('msg')
            {
                echo "checking out the source scmurl "
                echo "${config.scmurl}"
            }
          
            stage('location of dockerfile') 
                {  
                    docker build -t teeeeeest -f "${config.dockerfileLocation}". 
                    echo "checking out the source dockerfile "
                    //echo "${config.dockerfileLocation}",
                }
    }
        }

}