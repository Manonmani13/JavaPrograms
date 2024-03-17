package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Reminders;

public interface ReminderRepository extends JpaRepository<Reminders, Long>{
}
