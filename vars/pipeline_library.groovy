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
              git url : "https://github.com/hediane/teeeeeest.git"
            }
    }
}