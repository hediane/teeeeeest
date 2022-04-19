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
                retriever: modernSCM([
                    remote: "${scmurl}"
])
            }
    }
}