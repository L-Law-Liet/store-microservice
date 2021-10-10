package com.example.storecatalogservice.service;

import com.example.storecatalogservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCatalogService {

    @Autowired
    private RestTemplate restTemplate;

    public Catalog getProductById(Long productId) {
        List<Product> productList = new ArrayList<>();


            Product product = restTemplate.getForObject("http://information/products/" + productId, Product.class);
            Rating rating = restTemplate.getForObject("http://rating/ratings/" + productId, Rating.class);


        return new Catalog(product.getTitle(), rating.getRating());

    }


    public User getUserData(Long userId) {

        UserRating ratings = restTemplate.getForObject("http://rating/ratings/users/" + userId, UserRating.class);

        User user = restTemplate.getForObject("http://profile/profile/" + userId, User.class);

        UserCart cart = restTemplate.getForObject("http://cart/cart/" + userId, UserCart.class);

        UserComment userComment = restTemplate.getForObject("http://comment/comments/" + userId, UserComment.class);


        user.setCartList(cart);
        user.setUserRating(ratings);
        user.setUserComment(userComment);

        return user;
    }
}
