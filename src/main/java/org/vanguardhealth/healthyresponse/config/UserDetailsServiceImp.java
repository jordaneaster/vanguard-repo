//package org.vanguardhealth.healthyresponse.config;
//
//import org.springframework.security.core.userdetails.User.UserBuilder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.vanguardhealth.healthyresponse.models.User;
//import org.vanguardhealth.healthyresponse.repositories.UserRepo;
//
//
//import javax.annotation.Resource;
//import java.util.Optional;

//public class UserDetailsServiceImp implements UserDetailsService {
//
//    @Resource
//    UserRepo userRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//
//        // Get existing user from database
//        User user;
//        Optional<User> existingUser = userRepo.findByUserName(userName);
//        if (!existingUser.isPresent()) {
//            throw new UsernameNotFoundException("User not found.");
//        }
//        user = existingUser.get();
//
//        UserBuilder builder;
//        builder = org.springframework.security.core.userdetails.User.withUsername(userName);
//        builder.password(user.getPassword());
//        builder.roles(user.getRole());
//
//
//        return builder.build();
//    }
//
//}