import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JdbcApplication {
    public static void main(String[] args) {
        final SessionFactory sessionFactory= new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Movies.class)
                .addAnnotatedClass(Actors.class)
                .addAnnotatedClass(Genres.class)
                .buildSessionFactory();
    }
}
