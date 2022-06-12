package com.tsi.amirzan.project.controller;
import java.util.List;

import com.tsi.amirzan.project.entity.Actor;
import com.tsi.amirzan.project.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ActorController {

        @Autowired
        private ActorService actorService;


        public ActorController(ActorService actorService) {

            this.actorService = actorService;
        }


        @GetMapping("/actor")
        public List<Actor> findAll() {
            return actorService.findAll();
        }

        @GetMapping("/actor/{actor_id}")
        public Actor findById(@PathVariable int actor_id) {
            return actorService.findById(actor_id);
        }

        @DeleteMapping("/actor/{actor_id}")
        public String deleteById(@PathVariable int actor_id) {
            return actorService.deleteById(actor_id) + " Actor deleted from the database";
        }

        @PostMapping("/actor")
        public String save(@RequestBody Actor actor) {
            return actorService.save(actor) + " Actor saved successfully";
        }

        @PutMapping("/actor/{actor_id}")
        public String update(@RequestBody Actor actor, @PathVariable int actor_id) {
            return actorService.update(actor, actor_id) + " Actor updated successfully";
        }
}