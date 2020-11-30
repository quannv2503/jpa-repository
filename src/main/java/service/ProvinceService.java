package service;

import model.Province;

import javax.persistence.NamedQuery;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
