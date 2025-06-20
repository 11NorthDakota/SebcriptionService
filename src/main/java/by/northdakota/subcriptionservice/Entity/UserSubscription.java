package by.northdakota.subcriptionservice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="user_subscriptions")
@Getter
@Setter
@Builder
public class UserSubcription {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(optional=false)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(optional=false)
    @JoinColumn(name="subscription_id")
    private Subscription subscription;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
