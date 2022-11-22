package se.lexicon.dao;

import se.lexicon.AppUser;

import java.util.ArrayList;
import java.util.List;

public  class AppUserDaoCollectionImpl implements AppUserDao {
    private List<AppUser> userStorage;

    public AppUserDaoCollectionImpl() {
        userStorage = new ArrayList<AppUser>();
    }

    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("appUser was null");
        return appUser;
    }

    @Override
    public AppUser findByUsername(String userName) {
        userStorage = new ArrayList<AppUser>();
        return null;
    }

    @Override
    public List<AppUser> findAll() {
        return new ArrayList<>(userStorage);
    }

    @Override
    public void remove(String userName) {
        if (userName == null) throw new IllegalArgumentException("username was null");
        AppUser result = findByUsername(userName);

    }
}
