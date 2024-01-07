package api;

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class MyBasicSimulation extends Simulation {

  val usersPerSec = sys.env.getOrElse("CONCURRENCY", "1").toInt
  val durationSec = sys.env.getOrElse("DURATION", "60").toInt

  val httpProtocol = http
    // Here is the root for all relative URLs
    .baseUrl("http://app:8080")

  // A scenario is a chain of requests and pauses
  val scn = scenario("Scenario Name")
    .exec(
      http("request_1")
        .get("/")
    )
    // Note that Gatling has recorded real time pauses
    .pause(7)

  setUp(
    scn.inject(
      constantUsersPerSec(usersPerSec) during(durationSec seconds)
    ).protocols(httpProtocol)
  )
}