package com.bmc.chatbot.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContextRepository extends JpaRepository<Context, Integer>{

}
