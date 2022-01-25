package com.programming.techie.springredditclone.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoteDto {
    private com.example.springredditclone.model.VoteType voteType;
    private Long postId;
}