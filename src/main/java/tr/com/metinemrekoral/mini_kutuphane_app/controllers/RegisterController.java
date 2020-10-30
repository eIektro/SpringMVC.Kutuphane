package tr.com.metinemrekoral.mini_kutuphane_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import tr.com.metinemrekoral.mini_kutuphane_app.entities.User;
import tr.com.metinemrekoral.mini_kutuphane_app.models.uyelikFormu;
import tr.com.metinemrekoral.mini_kutuphane_app.repositories.UserRepository;
import tr.com.metinemrekoral.mini_kutuphane_app.utilities.AES;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/register")
    public String getRegisterPage(){
        return "register";
    }

    @PostMapping(path = "/register")
    public String submitRegister(uyelikFormu _uyelikFormu){
        User user = null;

        if(_uyelikFormu!=null){
            user = new User(_uyelikFormu.getIsim(), _uyelikFormu.getSoyisim(), _uyelikFormu.getKullaniciAdi(), _uyelikFormu.getEPosta(), AES.encrypt(_uyelikFormu.getPasswd(), "elektro"));
        }
        userRepository.save(user);
        return "register-success"; 
    }
}
