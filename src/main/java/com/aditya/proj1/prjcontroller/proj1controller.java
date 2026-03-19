package com.aditya.proj1.prjcontroller;
import java.util.*;
import com.aditya.proj1.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Journal")
public class proj1controller {
    private Map<Long,JournalEntry> list= new HashMap<>();
    @GetMapping("/viewAll")
    public List<JournalEntry> getList() {
        return new ArrayList<>(list.values());
    }

    @PostMapping
    public boolean create(@RequestBody JournalEntry newentry){
        list.put(newentry.getId(), newentry);
        return true;
    }
    @GetMapping("/see/{CurrId}")
    public JournalEntry show(@PathVariable Long CurrId){
        return list.get(CurrId);
    }

    @PutMapping("/update/{currId}")
    public boolean update(@PathVariable Long currId, @RequestBody JournalEntry curr){
        list.put(currId,curr);
        return true;
    }

    @DeleteMapping("/delete/{CurrId}")
    public boolean delete(@PathVariable Long CurrId){

        list.remove(CurrId);
        return true;
    }
}
