import com.Model.Entry;
import com.accessor.CassandraEntriesAccessor;
import com.accessor.iterator.EntryIterator;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.*;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by silvana.albert on 3/29/15.
 */
public class TestAccessor {

    @Test
    public  void testGetEntries() throws Exception {
        CassandraEntriesAccessor cassandraEntriesAccessor = new CassandraEntriesAccessor();

        cassandraEntriesAccessor.activate();
//        List<Entry> entities= (List<Entry>) cassandraEntriesAccessor.readEntries();
//        assertEquals(216, entities.size());
//        assertEquals("2641122202034", entities.get(0).getIdentificationNumber());

    }

}
