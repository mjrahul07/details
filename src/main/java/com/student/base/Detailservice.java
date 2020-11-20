package com.student.base;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Detailservice extends CrudRepository<Details, Integer> {


}
