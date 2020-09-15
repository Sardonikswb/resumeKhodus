package by.example.blogv1.Controllers;

import by.example.blogv1.Models.Post;
import by.example.blogv1.Repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blogMain")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blogMain";
    }

    @GetMapping("/blog/{id}")
    public String blogDetails(@PathVariable(value = "id") long id, Model model) {
        if (!postRepository.existsById(id)) {
            return "redirect:/blogMain";
        }
        Post posts = postRepository.findById(id).orElseThrow(NullPointerException::new);
        posts.setViews(posts.getViews() + 1);
        postRepository.save(posts);
        model.addAttribute("posts", posts);
        return "blog-details";
    }

    @GetMapping("/blog/{id}/edit")
    public String blogEdit(@PathVariable(value = "id") long id, Model model) {
        if (!postRepository.existsById(id)) {
            return "redirect:/blogMain";
        }

        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);
        return "blog-edit";
    }

    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
        return "blog-add";
    }

    @PostMapping("/blog/add")
    public String blogAddPost(Model model, @RequestParam String title, @RequestParam String anons, @RequestParam String full_text) {
        Post post = new Post(title, anons, full_text);
        postRepository.save(post);
        return "redirect:/blogMain";
    }

    @PostMapping("/blog/{id}/edit")
    public String blogUpdatePost(@PathVariable(value = "id") long id, Model model, @RequestParam String title, @RequestParam String anons, @RequestParam String full_text) {
        Post post = postRepository.findById(id).orElseThrow(NullPointerException::new);
        post.setTitle(title);
        post.setAnons(anons);
        post.setFull_text(full_text);
        postRepository.save(post);
        return "redirect:/blogMain";
    }

    @RequestMapping(value = "/blog/{id}/remove", method = RequestMethod.POST)
    public String blogRemove(@PathVariable(value = "id") long id, Model model, @RequestParam(value = "promt") String yesno) {
        if (yesno.equals("yes")) {
            postRepository.deleteById(id);
        } else {
            return "redirect:/blog/" + id;
        }
        return "redirect:/blogMain";
    }

}
