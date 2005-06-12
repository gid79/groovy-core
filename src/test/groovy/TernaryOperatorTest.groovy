class TernaryOperatorTest extends GroovyTestCase {

    void testSimpleUse() {
        def y = 5

        def x = (y > 1) ? "worked" : "failed"
        assert x == "worked"


        x = (y < 4) ? "failed" : "worked"
        assert x == "worked"
    }

    void testUseInParameterCalling() {
        def z = 123
        assertCalledWithFoo(z > 100 ? "foo" : "bar")
        assertCalledWithFoo(z < 100 ? "bar" : "foo")
       }

    def assertCalledWithFoo(param) {
        println "called with param ${param}"
        assert param == "foo"
    }
}
