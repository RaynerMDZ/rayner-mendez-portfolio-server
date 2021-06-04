package com.raynermdz.raynermendezportfolioserver.bootstrap;

import com.raynermdz.raynermendezportfolioserver.models.*;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;


@AllArgsConstructor
@Component
@Profile(value = "dev")
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userService;

    @Override
    public void run(String... args) throws Exception {

        User user = new User(
                "Rayner", "Enmanuel", "Mendez Garcia",
                "raynermendez@portfolio.com", "1234567890", "Software Engineer",
                "Looking for a job" ,"github.com", "linkedin.com", "twitter.com",
                "youtube.com", new Date(), null, new Picture(), new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>());

        Post post = new Post("First Post", "This is a post", "github.com", "post.com",
                new Date(), null, false, new Picture(), user, new ArrayList<>(),
                new ArrayList<>());

        Post post2 = new Post("Second Post", "This is a post", "github.com", "post.com",
                new Date(), null, false, new Picture(), user, new ArrayList<>(),
                new ArrayList<>());

        user.getPosts().add(post);
        user.getPosts().add(post2);

        Picture picture = new Picture();
        picture.setPictureUrl("picture.com");
        picture.setIsHidden(false);
        picture.setCreatedDate(new Date());
        picture.setPost(post);
        picture.setPictureName("picture");
        post.getPictures().add(picture);

        Comment comment = new Comment();
        comment.setPost(post);
        comment.setCreatedDate(new Date());
        comment.setName("John Doe");
        comment.setBody("This is a comment.");
        comment.setIsHidden(false);
        post.getComments().add(comment);

        Comment comment2 = new Comment();
        comment2.setPost(post2);
        comment2.setCreatedDate(new Date());
        comment2.setName("John Doe");
        comment2.setBody("This is a comment.");
        comment2.setIsHidden(false);
        post2.getComments().add(comment2);

        Comment comment3 = new Comment();
        comment3.setPost(post2);
        comment3.setCreatedDate(new Date());
        comment3.setName("John Doe");
        comment3.setBody("This is a comment.");
        comment3.setIsHidden(false);
        post2.getComments().add(comment3);

        Service service = new Service();
        service.setUser(user);
        service.setService("Frontend");
        service.setCreatedDate(new Date());
        service.setDescription("This is a service.");
        service.setIsHidden(false);
        user.getServices().add(service);

        Skill skill = new Skill();
        skill.setUser(user);
        skill.setSkill("Java");
        skill.setDescription("This is a skill.");
        skill.setIsHidden(false);
        skill.setCreatedDate(new Date());
        user.getSkills().add(skill);

        User savedUser = this.userService.save(user);

        Picture picture2 = new Picture();
        picture2.setPictureUrl("picture.com");
        picture2.setIsHidden(false);
        picture2.setCreatedDate(new Date());
        picture2.setPictureName("picture");

        savedUser.setPicture(picture2);

        this.userService.save(savedUser);

        System.out.println(
                "User ID: " + savedUser.getId() + "\nPost ID: " + savedUser.getPosts().get(0).getId()
                + "\nPicture ID: " + savedUser.getPosts().get(0).getPictures().get(0).getId()
                + "\nComment ID: " + savedUser.getPosts().get(0).getComments().get(0).getId()
                + "\nService ID: " + savedUser.getServices().get(0).getId()
                + "\nSkill ID: " + savedUser.getSkills().get(0).getId());

    }
}
