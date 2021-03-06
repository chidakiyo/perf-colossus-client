import colossus._
import service._
import protocols.telnet._

object Main extends App {

  implicit val io = IOSystem()
  
  import protocols.http._
import HttpMethod._
import UrlParsing._

Service.serve[Http]("http-service", 80){ context =>
  val responseMsg = """親譲おやゆずりの無鉄砲むてっぽうで小供の時から損ばかりしている。小学校に居る時分学校の二階から飛び降りて一週間ほど腰こしを抜ぬかした事がある。なぜそんな無闇むやみをしたと聞く人があるかも知れぬ。別段深い理由でもない。新築の二階から首を出していたら、同級生の一人が冗談じょうだんに、いくら威張いばっても、そこから飛び降りる事は出来まい。弱虫やーい。と囃はやしたからである。小使こづかいに負ぶさって帰って来た時、おやじが大きな眼めをして二階ぐらいから飛び降りて腰を抜かす奴やつがあるかと云いったから、この次は抜かさずに飛んで見せますと答えた。""""""
  context.handle{ connection =>
    connection.become{
      case request @ Get on Root => request.ok(responseMsg)
    }
  }
}

}