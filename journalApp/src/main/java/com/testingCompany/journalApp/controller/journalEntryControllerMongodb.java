package com.testingCompany.journalApp.controller;
import com.testingCompany.journalApp.entity.JournalEntry;
import com.testingCompany.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEntryControllerMongodb {

    @Autowired
    private JournalEntryService myJournalEntryService;

    @GetMapping("/getAllJournal")
    public List<JournalEntry> getAllJournal(){
       return myJournalEntryService.getAllEntry();
    }

    @PostMapping("/postNewJournal")
    public JournalEntry postJournal(@RequestBody JournalEntry myJournalEntry){
        myJournalEntry.setDate(LocalDateTime.now());
        myJournalEntryService.saveEntry(myJournalEntry);
        return myJournalEntry;
    }

    @GetMapping("/getJournal/{myId}")
    public JournalEntry getJournalById(@PathVariable ObjectId myId){
        return myJournalEntryService.getJournalEntryById(myId).orElse(null);
    }

    @DeleteMapping("/deleteJournal/{myId}")
    public void deleteJournalById(@PathVariable ObjectId myId){
        myJournalEntryService.deleteJournalEntryById(myId);
    }

    @PutMapping("/updateJournal/{myId}")
    public JournalEntry updateJournal(@PathVariable ObjectId myId, @RequestBody JournalEntry data){
        JournalEntry oldjournalEntry = myJournalEntryService.getJournalEntryById(myId).orElse(null);
        if(oldjournalEntry!=null){
                oldjournalEntry.setTitle(data.getTitle() !=null && !data.getTitle().equals("") ? data.getTitle(): oldjournalEntry.getTitle());
                oldjournalEntry.setDescription(data.getDescription() !=null && !data.equals("") ? data.getDescription(): oldjournalEntry.getDescription());
        }
        myJournalEntryService.saveEntry(oldjournalEntry);   // here we are not writing any special function for update purpose in case of update in Service we just use saveEntry() funct to fulfill requirement
        return oldjournalEntry;

    }
}
