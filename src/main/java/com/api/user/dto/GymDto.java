package com.api.user.dto;

import com.api.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GymDto {

    private String name;
    private String address;
    private Long contactNo;
    private String membershipPlans;
    private String facilities;
    private List<User> members = new ArrayList<>();

}