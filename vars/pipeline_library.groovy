def call (scmurl)
{
    node()
    {
            echo "checking out the source "
            git branch: 'main',
            url : "${scmurl}"
        
    }
}