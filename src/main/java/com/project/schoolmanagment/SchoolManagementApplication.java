package com.project.schoolmanagment;

import com.project.schoolmanagment.entity.concretes.user.UserRole;
import com.project.schoolmanagment.entity.enums.Gender;
import com.project.schoolmanagment.entity.enums.RoleType;
import com.project.schoolmanagment.payload.request.user.UserRequest;
import com.project.schoolmanagment.repository.user.UserRoleRepository;
import com.project.schoolmanagment.service.user.UserRoleService;
import com.project.schoolmanagment.service.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.time.LocalDate;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SchoolManagementApplication implements CommandLineRunner {


    private final UserRoleService userRoleService;
    private final UserService userService;
    private final UserRoleRepository userRoleRepository;

    public SchoolManagementApplication(UserRoleService userRoleService,
                                       UserService userService,
                                       UserRoleRepository userRoleRepository) {
        this.userRoleService = userRoleService;
        this.userService = userService;
        this.userRoleRepository = userRoleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementApplication.class, args);

    }

    @Override
    public void run(String... args) {
        // !!! Role tablomu dolduracagim
        if(userRoleService.getAllUserRole().isEmpty()){
            UserRole admin = new UserRole();

            admin.setRoleType(RoleType.ADMIN);
            admin.setRoleName("Admin");
            userRoleRepository.save(admin);

            UserRole dean = new UserRole();
            dean.setRoleType(RoleType.MANAGER);
            dean.setRoleName("Dean");
            userRoleRepository.save(dean);

            UserRole viceDean = new UserRole();
            viceDean.setRoleType(RoleType.ASSISTANT_MANAGER);
            viceDean.setRoleName("ViceDean");
            userRoleRepository.save(viceDean);

            UserRole student = new UserRole();
            student.setRoleType(RoleType.STUDENT);
            student.setRoleName("Student");
            userRoleRepository.save(student);

            UserRole teacher = new UserRole();
            teacher.setRoleType(RoleType.TEACHER);
            teacher.setRoleName("Teacher");
            userRoleRepository.save(teacher);
        }
        //!!! Admin olusturulacak  built_in
        // !!! userService de countAllAdmins ekle
        if(userService.countAllAdmins()==0){
            UserRequest adminRequest  = new UserRequest();
            adminRequest.setUsername("Admin");
            adminRequest.setEmail("admin@admin.com");
            adminRequest.setSsn("111-11-1111");
            adminRequest.setPassword("12345678");
            adminRequest.setName("Lars");
            adminRequest.setSurname("Urich");
            adminRequest.setPhoneNumber("111-111-1111");
            adminRequest.setGender(Gender.FEMALE);
            adminRequest.setBirthDay(LocalDate.of(1980,2,2));
            adminRequest.setBirthPlace("Texas");
            userService.saveUser(adminRequest,"Admin");
        }
    }
}









