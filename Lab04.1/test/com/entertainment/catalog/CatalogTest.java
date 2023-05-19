/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {


  @Test
  public void findByBrand_shouldReturnPopulateMap_whenBrandsPass() {
    Map<String, Collection<Television>> tvMap = Catalog.findByBrands("Sony", "N0-MATCHES");
    assertEquals(2, tvMap.size());

    //check the sony row
    Collection<Television> sonyTvs = tvMap.get("Sony");
    assertEquals(7, sonyTvs.size());
    for(Television tv: sonyTvs){
      assertEquals("Sony", tv.getBrand());
    }
    //check the NO-MATCHES row
    Collection<Television> noMatchesTvs = tvMap.get("NO-MaTCHES");
    assertTrue(noMatchesTvs.isEmpty());
  }

  @Test
  public void findByBrands_shouldReturnEmptyMap_whenNoBrandsPass() {
    Map<String, Collection<Television>> tvMap = Catalog.findByBrands();

    assertEquals(0, tvMap.size());
    assertTrue(tvMap.isEmpty());
  }

  /**
   * Contract: a no-matches result should be an empty collection (not null).
   */
  @Test
  public void findByBrands_shouldReturnEmptyCatalog_whenNoMatchesFound() {
    Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());     //equivalent method is assert(0, tvs.size())
  }

  @Test
  public void findByBrands_shouldReturnPopulatedCollection_whenMatchFound() {
    Collection<Television> tvs = Catalog.findByBrand("Sony");
    assertNotNull(tvs);
    assertEquals(7, tvs.size());
    for(Television tv: tvs) {
      assertEquals("Sony", tv.getBrand());
    }
  }
}