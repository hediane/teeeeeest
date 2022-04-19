def call (scmurl)
{
    node()
    {
            echo "checking out the source "
            git branch: 'main',
            url : 'https://github.com/hediane/teeeeeest.git'
        
    }
}