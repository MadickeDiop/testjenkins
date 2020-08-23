package testjenkins

class TestController {

    def index() {
        render "test jenkins"
    }

    def test(){
        render  "correct test method"

    }

    def notifiedjenkins(){
        render "test jenkins emails notification"

    }

    def jenkinsdetecterror{
        render "error must detected by jenkins"
    },
}
