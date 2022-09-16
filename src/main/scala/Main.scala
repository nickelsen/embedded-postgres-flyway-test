import io.zonky.test.db.postgres.embedded.{FlywayPreparer, PreparedDbProvider}

object Main extends App {
    PreparedDbProvider.forPreparer(
      FlywayPreparer.forClasspathLocation("classpath:db/migration")
    )
}