package com.sessions.sample.sessionSample.repository;


import com.sessions.sample.sessionSample.model.AppUser;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface AppUserRepository extends PagingAndSortingRepository<AppUser, Long>, JpaSpecificationExecutor<AppUser> {

    @Query("Select user from AppUser user where user.userName = :userName")
    AppUser findAppUserByUserName(String userName);
}
