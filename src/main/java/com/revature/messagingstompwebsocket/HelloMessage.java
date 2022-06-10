package com.revature.messagingstompwebsocket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "messages")
public class HelloMessage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int msgId;
    private String name;
    private int receiver;
    private int sender;


}