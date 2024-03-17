package net.javaguides.springboot.web;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.model.Reminders;
import net.javaguides.springboot.service.ReminderService;
import net.javaguides.springboot.web.dto.ReminderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/reminders")
public class ReminderController {
	private ReminderService reminderService;
	
	 private static final Logger logger = LoggerFactory.getLogger(ReminderController.class);
	 public List<Reminders> remindersList;

	public ReminderController(ReminderService reminderService) {
		super();
		this.reminderService = reminderService;
	}
	@PostMapping
	public String createReminder(@ModelAttribute("reminder") ReminderDto registrationDto) {
		reminderService.save(registrationDto);
		return "redirect:/reminders?success";
	}
	@GetMapping
	public String showReminder() {
		return "reminders";
	}
	@ModelAttribute("reminder")
    public ReminderDto ReminderDto() {
        return new ReminderDto();
    }
	@GetMapping("/getAll")
    public String getSamplePage(Model model) {
        // Add data to be displayed on the view
        model.addAttribute("list", reminderService.getAllReminders());
        remindersList = new ArrayList<>();
        remindersList = reminderService.getAllReminders();
        System.out.println(reminderService.getAllReminders().toString());
        System.out.println(reminderService.getAllReminders().size());
        System.out.println(reminderService.getAllReminders());
        logger.info("sss");
        
        return "list";
    }
	@GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
		Reminders remiders = reminderService.getById(id);
        model.addAttribute("reminders", remiders);
        return "update";
    }
	@GetMapping("/update")
    public String updateForm(@ModelAttribute("reminder") ReminderDto registrationDto) {
		reminderService.save(registrationDto);
        return "redirect:/reminders/getAll";
    }
 
    @GetMapping("/deleteRemiders/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
    	reminderService.deleteViaId(id);
        return "redirect:/reminders/getAll";
 
    }
    
	/*
	 * @PostMapping("/getBirthdayNames") public ResponseEntity<List<String>>
	 * getBirthdayNames(@RequestBody int userInput) { if (userInput < 1) { return
	 * ResponseEntity.badRequest().build(); // Invalid user input }
	 * 
	 * // Call the ReminderService to get birthday names based on user input
	 * List<String> birthdayNames =
	 * reminderService.getBirthdayNamesForDate(userInput); return
	 * ResponseEntity.ok(birthdayNames); }
	 */
    
	/*
	 * @PostMapping("/getBirthdayNames") public ResponseEntity<List<String>>
	 * getBirthdayNames(@RequestBody Map<String, Integer> userInputMap) { Integer
	 * userInput = userInputMap.get("userInput"); if (userInput == null || userInput
	 * < 1) { return ResponseEntity.badRequest().build(); // Invalid user input }
	 * 
	 * // Call the ReminderService to get birthday names based on user input
	 * List<String> birthdayNames =
	 * reminderService.getBirthdayNamesForDate(userInput);
	 * System.out.println(birthdayNames.toString()); return
	 * ResponseEntity.ok(birthdayNames); }
	 */
	/*
	 * @PostMapping("/getBirthdayNames") public ResponseEntity<List<String>>
	 * getBirthdayNames(@RequestParam("userInput") Integer userInput) { if
	 * (userInput == null || userInput < 1) { return
	 * ResponseEntity.badRequest().build(); // Invalid user input }
	 * System.out.println("hiii"+userInput);
	 * 
	 * // Call the ReminderService to get birthday names based on user input
	 * List<String> birthdayNames =
	 * reminderService.getBirthdayNamesForDate(userInput);
	 * 
	 * System.out.println("Hii "+ birthdayNames); return
	 * ResponseEntity.ok(birthdayNames); }
	 */

    
    @PostMapping("/getBirthdayNames")
    public ResponseEntity<List<String>> getBirthdayNames(@RequestParam("userInput") int userInput) {
        if (userInput < 1) {
            return ResponseEntity.badRequest().build(); // Invalid user input
        }

        // Call the ReminderService to get reminders within the next day
        List<Reminders> reminders = reminderService.getRemindersWithinNextNDays(userInput);

        // Extract names from the reminders
        List<String> birthdayNames = reminders.stream()
                .map(Reminders::getName)
                .collect(Collectors.toList());
        
        System.out.println("Hi"+birthdayNames);

        return ResponseEntity.ok(birthdayNames);
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void runBirthdayCheckDaily() {
        String birthdayMessage = reminderService.checkIfBirthdayToday();
        if (birthdayMessage != null) {
            // Log or send the message as needed
            System.out.println(birthdayMessage);
        }
    }
}
