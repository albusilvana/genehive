import com.accessor.CassandraEntriesAccessor;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by silvana.albert on 3/29/15.
 */
public class TestAccessor {

    public static void main(String[] args) throws Exception {
        CassandraEntriesAccessor cassandraEntriesAccessor = new CassandraEntriesAccessor();

        cassandraEntriesAccessor.activate();
        cassandraEntriesAccessor.readEntries();

    }

}
