package com.accessor.convertor;

import java.util.Date;

import com.Model.Entity;
import com.Model.Entry;
import com.datastax.driver.core.Row;

/**
 * Created by silvana.albert on 3/29/15.
 */
public class EntryConvertor {

        private EntryConvertor() {}

        public static Entry toEntry(Row cassandraRow) {
            if (cassandraRow == null) {
                return null;
            }

            Entry entry = new Entry();

            entry.setLastName(cassandraRow.getString("LAST_NAME"));
            entry.setFirstName(cassandraRow.getString("FIRST_NAME"));

//            String evtId = cassandraRow.getString(EVENT_ID);
//            long globalCustomerId = cassandraRow.getLong(GLOBAL_CUSTOMER_ID);
//            Date occurredDate = cassandraRow.getDate(OCCURRED_DATE);
//            String actionType = cassandraRow.getString(ACTION_TYPE);
//            String channelCode = cassandraRow.getString(CHANNEL_CODE);
//            String articleId = cassandraRow.getString(ARTICLE_ID);
//            String contentDeliveryPlatformId = cassandraRow.getString(CONTENT_DELIVERY_PLATFORM_ID);
//            String customerCustomerId = cassandraRow.getString(CUSTOMER_CUSTOMER_ID);
//            String customerProductId = cassandraRow.getString(CUSTOMER_PRODUCT_ID);
//            String feedId = cassandraRow.getString(FEED_ID);
//            long licensorId = cassandraRow.getLong(LICENSOR_ID);
//            int multiplier = cassandraRow.getInt(MULTIPLIER);
//            long publicationId = cassandraRow.getLong(PUBLICATION_ID);
//            String description = cassandraRow.getString(DESCRIPTION);
//            String ref1 = cassandraRow.getString(REF1);
//            String ref2 = cassandraRow.getString(REF2);
//            Long syndicatorSourceId = cassandraRow.getLong(SYNDICATOR_SOURCE_ID);

            return entry;
        }

}
