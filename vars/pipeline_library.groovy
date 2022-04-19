def call (scmurl)
{
    node
        { 
            stage('msg')
            {
                echo "checking out the source "
            }
           stage("testCheckout") {
            checkout([$class: 'GitSCM', 
            branches: [[name: 'refs/tags/main']], 
            userRemoteConfigs: [[
                refspec: '+refs/tags/*:refs/remotes/origin/tags/*', 
                url: 'https://github.com/hediane/teeeeeest.git']]
        ])
    }
    }
}