package com.madhan.joblisting.repository;

import com.madhan.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
