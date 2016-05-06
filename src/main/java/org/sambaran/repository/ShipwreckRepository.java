package org.sambaran.repository;

import org.sambaran.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sambaran on 4/5/16.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
