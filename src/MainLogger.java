
    import org.apache.log4j.Logger;

    public class MainLogger {
        private static final Logger logger = Logger.getLogger(MainLogger.class);
        public static void main(String[] args) {
            logger.info("Пользователь вошел в админ -панель");
        }
    }

