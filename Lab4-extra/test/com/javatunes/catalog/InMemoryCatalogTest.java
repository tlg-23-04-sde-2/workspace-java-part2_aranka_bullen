package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    //fixtures
    private InMemoryCatalog catalog;


    @Before
    public void setUp() throws Exception {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void findSelfTitledAlbums_shouldReturnSelfTitledAlbums_artistMatches() {
        Collection<MusicItem> selfTitled = catalog.selfTitledAlbums();
        assertEquals(2, selfTitled.size());
    }

    @Test
    public void findByCategory_shouldReturnPopulatedCollection_categoryFound() {
        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
        //should be size 4
        //all MusicItems in this collection should have a category
    }

    @Test
    public void findById_shouldReturnNull_idNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
    }

    @Test
    public void findById_shouldReturnMusicItemWithId_whenIdFound() {
        MusicItem item = catalog.findById(6L);
        assertEquals(6, item.getId().longValue());
    }
}