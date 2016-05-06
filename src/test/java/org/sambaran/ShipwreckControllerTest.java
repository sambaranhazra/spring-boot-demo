package org.sambaran;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.sambaran.controller.ShipWreckController;
import org.sambaran.model.Shipwreck;
import org.sambaran.repository.ShipwreckRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by sambaran on 5/5/16.
 */
public class ShipwreckControllerTest {
    @InjectMocks
    private ShipWreckController controller;

    @Mock
    private ShipwreckRepository repository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet() throws Exception {
        Shipwreck sw = new Shipwreck();
        sw.setId(1L);
        when(repository.findOne(1L)).thenReturn(sw);
        Shipwreck shipwreck = controller.get(1L);
        assertEquals(new Long(1L), shipwreck.getId());

    }
}
