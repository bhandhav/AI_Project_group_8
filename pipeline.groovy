stages{
    stage('cloning'){
        steps{
            git branch: 'main'
            url:"https://github.com/bhandhav/AI_Project_group_8.git";
        
        }
    }
    stage('build'){
        steps{
            echo 'build'
        }
    }
    stage('test'){
        steps{
            echo 'test'
        }
    }
    stage('package'){
        steps{
            echo 'package'
        }

    }
    stage('deploy'){
        steps{
            echo 'deploy'
        }
    }
}