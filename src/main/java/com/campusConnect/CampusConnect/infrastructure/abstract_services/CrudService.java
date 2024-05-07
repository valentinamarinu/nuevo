package com.campusConnect.CampusConnect.infrastructure.abstract_services;

import org.springframework.data.domain.Page;

public interface CrudService<RQ, RS, ID> {
    Page<RS> getAll(int page, int size);

    RS create(RQ request);

    RS update(RQ request, ID id);

    void delete(ID id);

    RS getById(ID id);
}
