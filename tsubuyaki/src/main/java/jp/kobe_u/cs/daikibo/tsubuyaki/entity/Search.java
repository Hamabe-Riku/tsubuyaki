package jp.kobe_u.cs.daikibo.tsubuyaki.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Search {
    @Id
    Long id; //つぶやきエンティティの識別子
    String keyword;
}