def call (Map config)
{
    node 
    {
        stage('checkout')
        {
            echo "checking out the source "
            checkout scmurl
        }
        
    }
}