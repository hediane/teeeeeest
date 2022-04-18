def call (scmurl)
{
    node()
    {
        stage('checkout')
        {
            echo "checking out the source "
            checkout"${scmurl}"
        }
        
    }
}