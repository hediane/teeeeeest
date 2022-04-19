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
                    $class: 'GitSCMSource',
                    credentialsId: 'your-credentials-id', // remove this if it's public!
                    remote: '${scmurl}'
])
            }
    }
}