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
                git branch: 'main',
                url : "git@github.com:hediane/teeeeeest.git"
            }
    }
}