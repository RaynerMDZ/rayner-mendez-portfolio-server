package com.raynermdz.raynermendezportfolioserver.bootstrap;

import com.raynermdz.raynermendezportfolioserver.models.Picture;
import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.models.Service;
import com.raynermdz.raynermendezportfolioserver.models.User;
import com.raynermdz.raynermendezportfolioserver.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Component
@Profile(value = "dev")
public class DataInitializer implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setAboutMe("");
        user.setGithub("");
        user.setLinkedIn("");
        user.setTwitter("");
        user.setYoutube("");

//        Picture picture = new Picture();
//        picture.setCreatedDate(new Date());
//        picture.setIsHidden(false);
//        picture.setPictureString(null);
//        user.setPicture(picture);

        Service service = new Service();
        List<Service> services = new ArrayList<>();
        services.add(service);
        user.setServices(services);

        Post post = new Post();
        post.setCreatedDate(new Date());
        post.setIsHidden(false);
        post.setDescription("");
        post.setGitHub("");
        post.setTitle("");
        List<Post> posts = new ArrayList<>();
        List<Picture> pictures = new ArrayList<>();
        post.setPictures(pictures);

        posts.add(post);
        user.setPosts(posts);

        User returnedUser = this.userService.saveUser(user);
        System.out.println(returnedUser.getId());

    }
}
