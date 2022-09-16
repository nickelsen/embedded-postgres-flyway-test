import io.zonky.test.db.postgres.embedded.EmbeddedPostgres
import org.flywaydb.core.Flyway
import org.flywaydb.core.internal.database.postgresql.PostgreSQLConfigurationExtension

object Main extends App {
  val pg = EmbeddedPostgres.start()
  val config = Flyway.configure().dataSource(pg.getPostgresDatabase).locations("classpath:db/migration")
  val configExtension = config.getPluginRegister.getPlugin(classOf[PostgreSQLConfigurationExtension])
  configExtension.setTransactionalLock(false)
  config.load().migrate()
}