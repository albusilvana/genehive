package com.accessor.iterator;

import java.util.Iterator;

import com.Model.Entry;
import com.accessor.convertor.EntryConvertor;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.google.common.base.Preconditions;

/**
 * Created by silvana.albert on 3/29/15.
 */
public class EntryIterator {


    private Iterator<Row> rowIterator;

    public EntryIterator(ResultSet resultSet) {
        Preconditions.checkArgument(resultSet != null, "resultSet is null");
        rowIterator = resultSet.iterator();
    }


    public Entry next() {
        if (rowIterator != null) {
            return EntryConvertor.toEntry(rowIterator.next());
        }
        return null;
    }


    public boolean hasNext() {
        if (rowIterator != null) {
            return rowIterator.hasNext();
        }
        return false;
    }


    public void remove() {
        throw new RuntimeException("Not supported");
    }


    public void release() {
        rowIterator = null;
    }

}
