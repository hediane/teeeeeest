def call (Map config)
{
    pipeline 
    {
        stage('checkout')
        {
            echo "checking out the source "
            checkout scmurl
        }
        
    }
}