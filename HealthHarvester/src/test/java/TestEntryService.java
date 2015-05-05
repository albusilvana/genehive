import com.DTO.EntryDTO;
import com.Model.Entry;
import com.Service.EntryService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class TestEntryService {

    private EntryService entryService = new EntryService();
    @Test
    public  void testGetEntries() throws Exception {

        List<EntryDTO> entities = entryService.getAllEntries();

        assertEquals(4, entities.size());
        assertEquals("2641122202034", entities.get(0).getIdentificationNumber());

    }
}
