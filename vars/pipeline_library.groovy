def call (scmurl)
{
    node
        { 
            stage('msg')
            {
                echo "checking out the source scmurl "
                echo "${scmurl}"
            }
           stage("testCheckout") {
            checkout([$class: 'GitSCM', 
            branches: [[name: 'refs/heads/main']], 
            userRemoteConfigs: [[
                //refspec: '+refs/tags/*:refs/remotes/origin/tags/*',
                url:"${scmurl}"]]
                //url: 'https://github.com/hediane/teeeeeest.git']]
        ])
    }
    }
}