def call (Map config)
{
    pipeline
        { 
        stages
        {
            stage('msg')
            {
                echo "checking out the source "
            }
            stage('checkout')
            {
                git branch: 'main',
                url : "${scmurl}"
            }
        }
    }
}