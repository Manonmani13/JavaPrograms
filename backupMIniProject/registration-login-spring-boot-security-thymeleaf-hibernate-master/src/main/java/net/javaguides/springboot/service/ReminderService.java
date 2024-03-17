package net.javaguides.springboot.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Reminders;
import net.javaguides.springboot.repository.ReminderRepository;
import net.javaguides.springboot.web.dto.ReminderDto;

@Service
public class ReminderService {
	@Autowired
	private ReminderRepository reminderRepo;
	public Reminders save(ReminderDto reminderDto) {
		Reminders reminder = new Reminders();
		reminder.setName(reminderDto.getName());
		reminder.setMessage(reminderDto.getMessage());
		reminder.setDate(reminderDto.getDate());
		reminder.setUserId(reminderDto.getUserId());
		return reminderRepo.save(reminder);
	}
	public List<Reminders> getAllReminders()
    {
        return reminderRepo.findAll();
    }

     public Reminders getById(Long id)
    {
        Optional<Reminders> optional = reminderRepo.findById(id);
        Reminders employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                "Remider not found for id : " + id);
        return employee;
    }
 
     public void deleteViaId(long id)
    {
    	 reminderRepo.deleteById(id);
    }
}
