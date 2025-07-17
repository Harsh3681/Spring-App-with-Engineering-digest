//package com.testingCompany.journalApp.controller;
//
//import com.testingCompany.journalApp.entity.JournalEntry;
//import org.bson.types.ObjectId;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class journalEntryControllerNormal {
//
////          Map<Id, Class>
//    private Map<String, JournalEntry> forJournalEntriesTable = new HashMap<>();
//
////    public string myFunction(){} <--- same as this below
//
//    @GetMapping("/getAllJournal")
//    public List<JournalEntry> getAllJournal(){
//
//        return new ArrayList<>(forJournalEntriesTable.values()); // here values() means JournalEntry because Long is act as an key();
//    }
//
//    @PostMapping("/postNewJournal")
//    public boolean postJournal(@RequestBody JournalEntry myJournalEntry){
//        forJournalEntriesTable.put(myJournalEntry.getId(), myJournalEntry);
//        return true;
//    }
//
//    @GetMapping("/getJournal/{myId}")
//    public JournalEntry getJournalById(@PathVariable Long myId){
//        return forJournalEntriesTable.get(myId);
//    }
//
//    @DeleteMapping("/deleteJournal/{myId}")
//    public JournalEntry deleteJournalById(@PathVariable Long myId){
//        return forJournalEntriesTable.remove(myId);
//    }
//
//    @PutMapping("/updateJournal/{myId}")
//    public JournalEntry updateJournal(@PathVariable ObjectId myId, @RequestBody JournalEntry data){
//        return forJournalEntriesTable.replace(myId,data);
//    }
//
//}
