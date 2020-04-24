package com.bmc.chatbot.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmc.chatbot.entity.MessageContext;

@RestController
@RequestMapping("/context")
public class ContextController {
    @Autowired
    private ContextRepository contextRepository;
    
    @GetMapping("/all")
    public List<Context> getAllContext(){
        return contextRepository.findAll();
    }
    @GetMapping("/byId/{id}")
    public ResponseEntity<Context> getContextById(@PathVariable(value="id") Integer contextId) throws Exception{
        Context context = contextRepository.findById(contextId).orElseThrow(()->new Exception("Context "+contextId+" not found"));
        return ResponseEntity.ok().body(context);
    }
    @PostMapping("/createContext")
    public Context createContext(@RequestBody MessageContext messageContext) {
        Context context = new Context(messageContext.getUserName(),messageContext.getSessionId());
        return contextRepository.save(context);
    }
    
}
