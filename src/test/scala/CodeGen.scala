import org.scalatest.FunSpec

/**
  * @author cabos
  */
class CodeGen extends FunSpec {

  describe("generate slick code") {

    it("maihamadb") {
      slick.codegen.SourceCodeGenerator.main(Array(
        "slick.jdbc.MySQLProfile",
        "com.mysql.jdbc.Driver",
        "jdbc:mysql://localhost:3306/maihamadb",
        "/Users/yuto/works/slick-sample/src/main/scala/",
        "slick.mysql",
        "root",
        ""))
    }
  }
}
