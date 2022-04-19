def call (scmurl)
{
    node
        { 
            stage('msg')
            {
                echo "checking out the source "
            }
            stage('checkout')
            {  
              checkout -f "${scmurl}"
            }
    }
}