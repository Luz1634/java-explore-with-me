package ru.practicum.main.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.main.service.model.Request;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {

    List<Request> findAllByRequesterId(long userId);

    List<Request> findAllByEventId(long eventId);
}
