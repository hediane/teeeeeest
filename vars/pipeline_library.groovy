def call (scmurl)
{
    node()
    {
        stage('checkout')
        {
            echo "checking out the source "
            git branch: 'main',
            url : "${scmurl}"

        }
        
    }
}